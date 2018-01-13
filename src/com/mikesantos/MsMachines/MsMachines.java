package com.mikesantos.MsMachines;

import org.bukkit.plugin.java.JavaPlugin;

import com.mikesantos.MsMachines.Utils.Console;

public class MsMachines extends JavaPlugin{
	
	@Override
	public void onEnable() {
		Console.init(this);
		super.onEnable();
	}
	
	@Override
	public void onDisable() {
		// TODO Auto-generated method stub
		super.onDisable();
	}
}
