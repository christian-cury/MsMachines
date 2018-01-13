package com.mikesantos.MsMachines.Objects;

import java.util.Calendar;

import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Set;

import org.bukkit.ChatColor;
import org.bukkit.block.Block;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.EntityType;
import org.bukkit.inventory.ItemStack;

import com.mikesantos.MsMachines.Utils.DateUtils;

public abstract class IMachine {
	private ItemStack machineIcon, fuelItem = null;
	private ArmorStand hologram = null;
	private Set<ItemStack> machineDrops = new LinkedHashSet<>();
	private Date created, expires = null;
	private Block physicalMachine = null;
	
	public IMachine() {
		super();
	}

	public ItemStack getMachineIcon() {
		return machineIcon;
	}
	public void setMachineIcon(ItemStack machineIcon) {
		this.machineIcon = machineIcon;
	}
	public Set<ItemStack> getMachineDrops() {
		return machineDrops;
	}
	public void setMachineDrops(Set<ItemStack> machineDrops) {
		this.machineDrops = machineDrops;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	public Date getExpires() {
		return expires;
	}
	public void setExpires(Date expires) {
		this.expires = expires;
	}

	public ItemStack getFuelItem() {
		return fuelItem;
	}

	public void setFuelItem(ItemStack fuelItem) {
		this.fuelItem = fuelItem;
	}
	
	public ArmorStand getHologram() {
		return hologram;
	}

	public Block getPhysicalMachine() {
		return physicalMachine;
	}

	public void setPhysicalMachine(Block physicalMachine) {
		this.physicalMachine = physicalMachine;
	}

	public void createHologram(String text) {
		if(getPhysicalMachine() != null) {
			hologram = (ArmorStand) getPhysicalMachine().getLocation().getWorld().spawnEntity(getPhysicalMachine().getLocation(), EntityType.ARMOR_STAND);
			hologram.setSmall(true);
			hologram.setVisible(false);
			hologram.setCustomNameVisible(true);
			hologram.setBasePlate(false);
			hologram.setCanPickupItems(false);
			hologram.setGravity(false);
			hologram.setRemoveWhenFarAway(false);
			hologram.setArms(false);
			hologram.setMarker(true);
			
			hologram.setCustomName(ChatColor.translateAlternateColorCodes('&', replaceVariables(text)));
		}
	}
	
	public void updateHologramTitle(String text) {
		if(hologram != null) {
			hologram.setCustomName(ChatColor.translateAlternateColorCodes('&', replaceVariables(text)));
		}
	}

	public void setWorkingTime(int seconds) {
		setExpires(DateUtils.addTimeInDate(DateUtils.getCurrentDate(), Calendar.SECOND, seconds));
	}
	
	public boolean isWorking() {
		return getExpires().before(DateUtils.getCurrentDate());
	}
	
	public long getRemaingWorkTime() {
		return !isWorking() ? -1 : DateUtils.getSecondsBetween2Dates(new Date(), getExpires()); 
	}
	
	private String replaceVariables(String text) {
		return text;
	}
	
}
