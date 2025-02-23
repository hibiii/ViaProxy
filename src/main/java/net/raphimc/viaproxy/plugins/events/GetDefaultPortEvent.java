/*
 * This file is part of ViaProxy - https://github.com/RaphiMC/ViaProxy
 * Copyright (C) 2023 RK_01/RaphiMC and contributors
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
package net.raphimc.viaproxy.plugins.events;

import net.raphimc.vialoader.util.VersionEnum;

public class GetDefaultPortEvent {

    private final VersionEnum serverVersion;
    private int defaultPort;

    public GetDefaultPortEvent(final VersionEnum serverVersion, final int defaultPort) {
        this.serverVersion = serverVersion;
        this.defaultPort = defaultPort;
    }

    public VersionEnum getServerVersion() {
        return this.serverVersion;
    }

    public int getDefaultPort() {
        return this.defaultPort;
    }

    public void setDefaultPort(final int defaultPort) {
        this.defaultPort = defaultPort;
    }

}
