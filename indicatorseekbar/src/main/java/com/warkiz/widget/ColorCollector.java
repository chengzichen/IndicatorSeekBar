package com.warkiz.widget;


import android.support.annotation.ColorInt;


public interface ColorCollector {
    /**
     * to collect each section track's color
     *
     * @param colorIntArr ColorInt the container for each section tracks' color.
     *                    this array's length will auto equals section track' count.
     * @return True if apply color , otherwise no change
     */
    boolean collectSectionTrackColor(@ColorInt int[] colorIntArr);
}