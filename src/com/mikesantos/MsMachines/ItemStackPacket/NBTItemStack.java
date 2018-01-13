package com.mikesantos.MsMachines.ItemStackPacket;

import org.bukkit.inventory.ItemStack;

public class NBTItemStack {

	private ItemStack bukkititem;
	
	public NBTItemStack(ItemStack Item){
		bukkititem = Item.clone();
	}
	
	public ItemStack getItem(){
		return bukkititem;
	}
	
	public void setString(String Key, String Text){
		bukkititem = Reflection.setString(bukkititem, Key, Text);
	}
	
	public String getString(String Key){
		return Reflection.getString(bukkititem, Key);
	}
	
	public void setInteger(String key, Integer Int){
		bukkititem = Reflection.setInt(bukkititem, key, Int);
	}
	
	public int getInteger(String key){
		return Reflection.getInt(bukkititem, key);
	}
	
	public void setDouble(String key, Double d){
		bukkititem = Reflection.setDouble(bukkititem, key, d);
	}
	
	public double getDouble(String key){
		return Reflection.getDouble(bukkititem, key);
	}
	
	public void setBoolean(String key, Boolean b){
		bukkititem = Reflection.setBoolean(bukkititem, key, b);
	}
	
	public boolean getBoolean(String key){
		return Reflection.getBoolean(bukkititem, key);
	}
	
	public boolean hasKey(String key){
		return Reflection.hasKey(bukkititem, key);
	}
}
