/*
 * This file is part of APNdroid.
 *
 * APNdroid is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * APNdroid is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with APNdroid. If not, see <http://www.gnu.org/licenses/>.
 */

package com.google.code.apndroid;

/**
 * @author Pavlov Dmitry
 * @since 03.10.2009
 */
public final class ApplicationConstants {
    public static final String STATUS_EXTRA = "com.google.code.apndroid.intent.extra.STATUS";
    /**
     * Intent name for send to request current apn state.
     */
    public static final String STATUS_REQUEST = "com.google.code.apdroid.intent.STATUS_REQUEST";
    /**
     * Intent name for send to switch apn state.
     */
    public static final String CHANGE_STATUS_REQUEST = "com.google.code.apndroid.intent.CHANGE_REQUEST";


    public static final String SHOW_NOTIFICATION = "com.google.code.apndroid.intent.extra.SHOW_NOTIFICATION";

    static final String STATUS_CHANGED_MESSAGE = "com.google.code.apndroid.intent.action.STATUS_CHANGED";

    static final String SETTINGS_TOGGLE_BUTTON = "toggle_preference";

    static final String SETTINGS_KEEP_MMS_ACTIVE = "com.google.code.apndroid.preferences.KEEP_MMS_ENABLED";
    static final String SETTINGS_SHOW_NOTIFICATION = "com.google.code.apndroid.preferences.SHOW_NOTIFICATION";
    /**
     * Special flag setting that signals about changing app settings not from main ui (for example from some plugin)
     * <br>
     * In case when main ui was started before that and stopped (user exit activity), but it was not killed and restored
     * this flag set to {@code true} signals that we should refresh our ui.
     */
    static final String SETTINGS_CHANGED = "com.google.com.apndroid.preferences.SETTINGS_CHANGED";

    /**
     * Common log tag
     */
    static final String APP_LOG = "apndroid.log";

}
