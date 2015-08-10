package com.softtanck.lenovoservice;

import android.app.Application;
import android.test.ApplicationTestCase;
import android.util.Log;

import junit.framework.TestResult;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
public class ApplicationTest extends ApplicationTestCase<Application> {
    public ApplicationTest() {
        super(Application.class);
        Log.d("Tanck", "---");
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        Log.d("Tanck", "setUp");
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
        Log.d("Tanck", "tearDown");
    }
}