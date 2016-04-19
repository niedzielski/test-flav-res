package com.niedzielski.android.testflavres;

import android.test.InstrumentationTestCase;
import android.util.Log;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
public class ApplicationTest extends InstrumentationTestCase {
    private static final String TAG = ApplicationTest.class.getName();

    public void testResources() {
        Log.d(TAG, "prod=" + getInstrumentation().getTargetContext().getString(R.string.prod_res));
        Log.d(TAG, "test=" + getInstrumentation().getContext().getString(com.niedzielski.android.testflavres.test.R.string.test_res));
    }
}