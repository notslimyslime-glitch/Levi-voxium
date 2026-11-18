package org.levimc.launcher.core.discord;

import android.app.Application;

/**
 * Discord rich presence is optional and is disabled in the Voxium embedded
 * launcher build because Levi's private partner SDK AAR is not distributed
 * with the source repository. Keep the public API so launcher call sites
 * remain compatible.
 */
public final class DiscordPresence {
    private DiscordPresence() {}

    public static void initialize(Application application) {}
    public static boolean isConfigured() { return false; }
    public static void refresh() {}
    public static void shutdown() {}
}
