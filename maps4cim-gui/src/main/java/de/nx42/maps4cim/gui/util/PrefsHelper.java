/**
 * maps4cim - a real world map generator for CiM 2
 * Copyright 2013 - 2014 Sebastian Straub
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package de.nx42.maps4cim.gui.util;
import java.util.prefs.Preferences;


public class PrefsHelper {

    // base path for maps4cim-gui (Preferences-API)
    protected static final String registryPath = "/de/nx42/maps4cim-gui";

    // Preferences-object for maps4cim-gui
    protected static final Preferences prefs = Preferences.userRoot().node( registryPath );

    /**
     * @return the Preferences-Object
     */
    public static Preferences getPrefs() {
        return prefs;
    }

    public static boolean exists(String key) {
        return prefs.get(key, null) != null;
    }

}
