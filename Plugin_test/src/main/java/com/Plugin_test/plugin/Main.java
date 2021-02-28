package com.Plugin_test.plugin;

import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("플러그인 활성화");

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }



}
