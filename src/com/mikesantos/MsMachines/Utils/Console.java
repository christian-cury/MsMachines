package com.mikesantos.MsMachines.Utils;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.Plugin;

public class Console {
	
	private static String PREFIX;
	public static void init(Plugin plugin) {
		PREFIX = "&f[&b" + plugin.getDescription().getName().trim() + "&f]: ";
	}
	
	public static void info(String string) {
		message(String.format("&a%s", string));
	}
	
	public static void warning(String string) {
		message(String.format("&e%s", string));
	}
	
	public static void severe(String string) {
		message(String.format("&c%s", string));
	}
	
	private static void message(String string) {
		Bukkit.getConsoleSender().sendMessage(colorize(PREFIX + string));
	}
	
	private static String colorize(String string) {
		return ChatColor.translateAlternateColorCodes('&', string);
	}
}
