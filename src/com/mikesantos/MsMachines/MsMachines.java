package com.mikesantos.MsMachines;

import org.bukkit.plugin.java.JavaPlugin;

import com.mikesantos.MsMachines.Utils.Console;

public class MsMachines extends JavaPlugin{
	
	@Override
	public void onLoad() {
		Console.init(this);
		super.onLoad();
	}
	
	@Override
	public void onEnable() {
		
		super.onEnable();
	}
	
	@Override
	public void onDisable() {
		
		super.onDisable();
	}
}
