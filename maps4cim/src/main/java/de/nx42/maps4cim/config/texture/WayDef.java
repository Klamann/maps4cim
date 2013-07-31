/**
 * maps4cim - a real world map generator for CiM 2
 * Copyright 2013 Sebastian Straub
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
package de.nx42.maps4cim.config.texture;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * A single way (polyline), drawn in the user defined color.
 * @see EntityDef
 * @author Sebastian Straub <sebastian-straub@gmx.net>
 */
@XmlRootElement(name = "way")
public class WayDef extends PolygonDef {

	/** with of the line to draw. Defaults to 1.0 pixel (which is about
	    4m on a true to scale map) */
    @XmlAttribute(name = "stroke")
    public Double strokeWidth;      // default: 1.0

    /**
     * @return the stroke width of this way
     */
    public Double getStrokeWidth() {
        return strokeWidth != null ? strokeWidth : 1.0;
    }

}
