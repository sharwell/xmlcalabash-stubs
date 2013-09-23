package com.marklogic.xcc.types;

import java.util.Iterator;

/**
 * A {@link XdmValue} which is a sequence of Items.
 *
 * @see <a href="http://docs.marklogic.com/javadoc/xcc/com/marklogic/xcc/types/XdmSequence.html">
 * Interface XdmSequence</a>
 */
public interface XdmSequence<I extends XdmItem> extends XdmValue {

    /**
     * Returns the size of this {@link XdmSequence}.
     *
     * @return The number of Items (possibly zero) in this sequence.
     */
    int size();

    /**
     * Indicates whether this {@link XdmSequence} is empty.
     *
     * @return {@code true} if {@link #size()} == 0.
     */
    boolean isEmpty();

    /**
     * Construct an array of {@link XdmItem}s from this {@link XdmSequence}.
     *
     * @return An array of {@link XdmItem}, possibly zero-length.
     */
    XdmItem[] toArray();

    /**
     * Return the {@link XdmItem} at the given position from this
     * {@link XdmSequence}.
     *
     * @param index The index of the {@link XdmItem} (zero-based) to return.
     * @return An {@link XdmItem} instance.
     * @throws IllegalArgumentException If {@code index} is negative or is
     * greater than or equal to {@link #size()}.
     */
    XdmItem itemAt(int index);

    /**
     * An {@link Iterator} instance that iterates over the items in this
     * {@link XdmSequence}.
     *
     * @return An {@link Iterator} over the {@link XdmItem} instances in this
     * {@link XdmSequence}.
     */
    Iterator<I> iterator();

    /**
     * Returns a {@link String} comprised of {@link XdmValue#asString()} value
     * of each item in the sequence with the given separator string between
     * each. If the sequence is empty ({@link #isEmpty()} is {@code true}) then
     * the empty string is returned.
     *
     * @param separator A separator string, such as {@code "\n"}, to be inserted
     * between the {@link XdmValue#asString()} value of each item in the
     * sequence. A value of {@code null} is equivalent to the empty string which
     * causes all items to be concatenated with no separator.
     * @return A string representation of the sequence.
     */
    String asString(String separator);

    /**
     * This method is equivalent to {@code asString("\n")}.
     *
     * @return A string representation of the sequence with a newline separator.
     */
    @Override
    String asString();

    /**
     * Returns an array of {@link String}s, each of which is the value returned
     * by the {@link XdmValue#asString()} method for each item in the sequence.
     *
     * @return An array of {@link String}s.
     */
    String[] asStrings();

    /**
     * Return a textual description of this {@link XdmSequence} object, NOT the
     * value of the items in the sequence. Use the {@link #asString()} or
     * {@link #asStrings()} methods to obtain {@link String} representations of
     * the item values.
     *
     * @return A textual description of this object, appropriate for use in a
     * debug or log message.
     * @see #asString()
     * @see #asStrings()
     */
    @Override
    String toString();

}
