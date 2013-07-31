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
package de.nx42.maps4cim.map.texture;

import de.nx42.maps4cim.map.TextureMap;

/**
 *
 * @author Sebastian Straub <sebastian-straub@gmx.net>
 */
public class SingleTexture extends TextureMap {

    @Override
    public int[][] generateTexture() {
        int[][] map = new int[edgeLength][edgeLength];
        for (int y = 0; y < edgeLength; y++) {
            int[] line = map[y];
            for (int x = 0; x < edgeLength; x++) {
                line[x] = CiMTexture.GRASS.draw();
            }
        }
        return map;
    }

}
