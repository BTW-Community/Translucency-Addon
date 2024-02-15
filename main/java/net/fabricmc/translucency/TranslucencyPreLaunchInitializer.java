package net.fabricmc.translucency;

import net.fabricmc.loader.api.entrypoint.PreLaunchEntrypoint;
import btw.community.translucency.TranslucencyAddon;

public class TranslucencyPreLaunchInitializer implements PreLaunchEntrypoint {
    /**
     * Runs the PreLaunch entrypoint to register BTW-Addon.
     * Don't initialize anything else here, use
     * the method Initialize() in the Addon.
     */
    @Override
    public void onPreLaunch() {
        TranslucencyAddon.getInstance();
    }
}
