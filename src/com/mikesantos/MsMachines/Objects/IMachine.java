package com.mikesantos.MsMachines.Objects;

import java.util.Calendar;
import java.util.Date;
import java.util.Set;

import org.bukkit.inventory.ItemStack;

import com.mikesantos.MsMachines.Utils.DateUtils;

public abstract class IMachine {
	private ItemStack machineIcon, fuelItem;
	private Set<ItemStack> machineDrops;
	private Date created, expires;
	
	public IMachine() {
		super();
	}

	public IMachine(ItemStack machineIcon, ItemStack fuelItem, Set<ItemStack> machineDrops, Date created, Date expires) {
		super();
		this.machineIcon = machineIcon;
		this.fuelItem = fuelItem;
		this.machineDrops = machineDrops;
		this.created = created;
		this.expires = expires;
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
	
	public void setWorkingTime(int seconds) {
		setExpires(DateUtils.addTimeInDate(DateUtils.getCurrentDate(), Calendar.SECOND, seconds));
	}
	
	public boolean isWorking() {
		return getExpires().before(DateUtils.getCurrentDate());
	}
	
	public long getRemaingWorkTime() {
		return !isWorking() ? -1 : DateUtils.getSecondsBetween2Dates(new Date(), getExpires()); 
	}
	
}
