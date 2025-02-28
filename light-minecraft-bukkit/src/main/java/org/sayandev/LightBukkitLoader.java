package org.sayandev;

import org.sayandev.light.DependencyManager;

public class LightBukkitLoader {

    private final DependencyManager dependencyManager;

    public LightBukkitLoader(DependencyManager dependencyManager) {
        this.dependencyManager = dependencyManager;
    }

    public DependencyManager getDependencyManager() {
        return dependencyManager;
    }
}
