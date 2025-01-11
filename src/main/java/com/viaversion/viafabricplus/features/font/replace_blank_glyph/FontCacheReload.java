/*
 * This file is part of ViaFabricPlus - https://github.com/ViaVersion/ViaFabricPlus
 * Copyright (C) 2021-2025 the original authors
 *                         - FlorianMichael/EnZaXD <florian.michael07@gmail.com>
 *                         - RK_01/RaphiMC
 * Copyright (C) 2023-2025 ViaVersion and contributors
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.viaversion.viafabricplus.features.font.replace_blank_glyph;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.font.FontStorage;

public final class FontCacheReload {

    public static void reload() {
        final MinecraftClient client = MinecraftClient.getInstance();
        if (client != null) {
            for (FontStorage storage : client.fontManager.fontStorages.values()) {
                storage.bakedGlyphCache.clear();
                storage.glyphCache.clear();
            }
        }
    }

}
