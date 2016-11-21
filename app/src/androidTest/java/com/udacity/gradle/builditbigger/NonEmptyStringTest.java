package com.udacity.gradle.builditbigger;

import android.test.AndroidTestCase;
import android.util.Log;

/**
 * Created by allu on 11/21/16.
 */

public class NonEmptyStringTest extends AndroidTestCase {
    String Tag="NonEmptyStringTest";
    @SuppressWarnings("unchecked")
    public void test() {

        Log.v("NonEmptyStringTest", "Running NonEmptyStringTest test");
        String result = null;
        EndPointsAsyncTask endpointsAsyncTask = new EndPointsAsyncTask(getContext());
        endpointsAsyncTask.execute();
        try {
            result = endpointsAsyncTask.get();
            Log.e(Tag, "Retrieved a non-empty string successfully: " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
        assertNotNull(result);
    }
}
