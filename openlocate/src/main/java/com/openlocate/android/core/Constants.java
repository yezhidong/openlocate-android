/*
 * Copyright (c) 2017 OpenLocate
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package com.openlocate.android.core;

final class Constants {

    // Default Location constants
    static final long DEFAULT_LOCATION_INTERVAL = 120;
    static final long DEFAULT_TRANSMISSION_INTERVAL = 300;
    static final LocationAccuracy DEFAULT_LOCATION_ACCURACY = LocationAccuracy.HIGH;

    // Location service intent keys
    static final String URL_KEY = "url";
    static final String HEADER_KEY = "header";

    static final String LOCATION_ACCURACY_KEY = "location_accuracy";
    static final String LOCATION_INTERVAL_KEY = "location_interval";
    static final String TRANSMISSION_INTERVAL_KEY = "transmission_interval";

    static final String ADVERTISING_ID_KEY = "advertising_id";
    static final String LIMITED_AD_TRACKING_ENABLED_KEY = "limited_ad_tracking_enabled";

    static final int DEFAULT_PORT = -1;

    // Local broadcast manager event names
    static final String LOCATION_INTERVAL_CHANGED = Constants.class.getCanonicalName() + ".LocationIntervalChanged";
    static final String LOCATION_ACCURACY_CHANGED = Constants.class.getCanonicalName() + ".LocationAccuracyChanged";
    static final String TRANSMISSION_INTERVAL_CHANGED = Constants.class.getCanonicalName() + ".TransmissionIntervalChanged";

    static final String IS_TEST_KEY = "is_test";
}
