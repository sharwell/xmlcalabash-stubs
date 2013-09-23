package com.deltaxml.core;

/**
 * A type-safe enumeration used to define the various filter chains associated
 * with a PipelinedComparatorS9.
 *
 * @see <a href="http://docs.deltaxml.com/core/current/docs/api/com/deltaxml/core/PipelineIOIdentifier.html">
 * Enum PipelineIOIdentifier</a>
 */
public enum PipelineIOIdentifier {
    /**
     * Identifies the first, or 'A' input of the comparator pipeline and its
     * associated filter chain.
     */
    INPUT_A,

    /**
     * Identifies the second, or 'B' input of the comparator pipeline and its
     * associated filter chain.
     */
    INPUT_B,

    /**
     * Identifies the output of the comparator pipeline or its associated filter
     * chain.
     */
    RESULT,

}
