package org.sayandev;

import org.bukkit.plugin.Plugin;

import java.io.File;
import java.net.URLClassLoader;

public class BukkitClassLoader implements LightClassLoader {
    private final Plugin plugin;
    private final URLClassLoaderHelper classLoader;

    public BukkitClassLoader(Plugin plugin) {
        this.plugin = plugin;
        classLoader = new URLClassLoaderHelper((URLClassLoader) plugin.getClass().getClassLoader());
    }

    @Override
    public void load(File file) {
        try {
            classLoader.addToClasspath(file.toPath());
        } catch (Exception e) {
            e.fillInStackTrace();
        }
    }
}
