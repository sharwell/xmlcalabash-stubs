package com.marklogic.xcc;

import java.io.IOException;
import java.io.InputStream;

/**
 * A {@link Content} object encapsulates content (a document) that can be
 * transferred to and inserted into a contentbase. Because
 * {@link Session#insertContent(Content)} automatically handles recovery of
 * interrupted document inserts, {@link Content} objects must be rewindable to
 * enable auto-retry.
 *
 * <p>
 * It is possible to create non-rewindable {@link Content} instances, such as
 * from an {@link InputStream}, which is too large to buffer and can only be
 * consumed once. If a problem is encountered during or after a non-rewindable
 * Content instance is processed then no automatic retries will be possible and
 * an exception will be thrown.</p>
 *
 * <p>
 * If rewindable and non-rewindable {@link Content} objects are mixed together
 * in a multi-document insert ({@link Session#insertContent(Content[])}) and
 * only rewindable instances have so far been processed, the insert will be
 * retryable. If a non-rewindable instance is in process or if the current
 * instance is rewindable but a non-rewindable instance has previously been
 * processed when a problem occurs then no automatic retry is possible and
 * processing will stop with an exception.</p>
 *
 * <p>
 * Instances of this interface for common usage patterns may be created with the
 * {@link ContentFactory} helper class. This interface may also be implemented
 * by user code to handle specialized situations.</p>
 *
 * @see <a href="http://docs.marklogic.com/javadoc/xcc/com/marklogic/xcc/Content.html">
 * Interface Content</a>
 */
public interface Content {

    /**
     * The URI with which this content should be inserted.
     *
     * @return A URI as a {@link String}.
     */
    String getUri();

    /**
     * Return the byte stream that makes up this document. If the content is
     * character data, as opposed to a binary BLOB, this should be a UTF-8
     * encoding of the characters.
     *
     * <p>
     * Each call to this method returns a stream positioned at the beginning of
     * the content. The {@link InputStream} object should be closed by the
     * client. The returned {@link InputStream} is not intended to be shared.
     * Each call to this method implies that any prior state should be discarded
     * and a new stream created that is positioned at the beginning of the
     * content.</p>
     *
     * @return An open {@link InputStream} instance.
     * @throws IOException
     */
    InputStream openDataStream() throws IOException;

    /**
     * Return the {@link ContentCreateOptions} object which should be applied to
     * this object. Note that if none was provided to the factory method that
     * created this Content instance, one may have been created with appropriate
     * defaults for the content provided.
     *
     * @return An instance of {@link ContentCreateOptions}.
     */
    ContentCreateOptions getCreateOptions();

    /**
     * Indicates whether this {@link Content} instance is rewindable and
     * therefore automatically retryable. If a content insertion
     * ({@link Session#insertContent(Content)}) is interrupted and this method
     * returns {@code true}, then the operation will automatically be restarted.
     * If this method returns {@code false}, then an exception will be thrown
     * immediately. If multiple Content objects are being inserted at once
     * ({@link Session#insertContent(Content[])}) and any non-rewindable
     * {@link Content} object has already been even partially sent, the insert
     * will fail immediately.
     *
     * @return {@code true} if rewindable ({@code #openDataStream()} may be
     * called repeatedly), {@code false} otherwise.
     */
    boolean isRewindable();

    /**
     * This method tells the implementation that the content should be rewound
     * to start again. This method will only be called if
     * {@link #isRewindable()} returns {@code true} and in that case only after
     * {@link #openDataStream()} has been called.
     *
     * @throws IOException If there is a problem rewinding.
     */
    void rewind() throws IOException;

    /**
     * The size of the content, if known.
     *
     * @return The size of the content, in bytes, of the content. If the size
     * cannot be determined at the time this method is invoked (if the content
     * is streaming for example), then -1 is returned.
     */
    long size();

    /**
     * This method will be called after successfully consuming the content from
     * the {@link InputStream} returned by {@link #openDataStream()}. This
     * method need not close the stream, that is the responsibility of the
     * client, but it may invalidate the stream. This method is to inform the
     * implementation that any resources it may be holding can be released.
     */
    void close();

}
