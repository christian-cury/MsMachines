package com.mikesantos.MsMachines.Hooks;

import net.milkbowl.vault.economy.Economy;
import net.milkbowl.vault.permission.Permission;

import org.bukkit.Bukkit;
import org.bukkit.plugin.RegisteredServiceProvider;

public class VaultHook {
	
	protected static Economy econ = null;
	public static Economy getEconomy(){
		if(econ == null){
			RegisteredServiceProvider<Economy> economyProvider = Bukkit.getServicesManager().getRegistration(Economy.class);
		    if (economyProvider != null) {
		      econ = (Economy)economyProvider.getProvider();
		    }
		}
		return econ;
	}
	
	protected static Permission perm = null;
	public static Permission getPermission(){
		if(perm == null){
			RegisteredServiceProvider<Permission> rsp = Bukkit.getServicesManager().getRegistration(Permission.class);
		    perm = (Permission)rsp.getProvider();
		}
		return perm;
	}
}
