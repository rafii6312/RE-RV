package com.rafii6311.rerv;


import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class Tabs {

	public static CreativeTabs components;
	public static CreativeTabs explosives;
	public static CreativeTabs machines;
	public static CreativeTabs ores;
	public static CreativeTabs building;
	public static CreativeTabs weapons;
	
	public static void loadTabs()
	{
		
		components = new GenericTab("components", getIconItem("components"));
		explosives = new GenericTab("explosives", getIconItem("explosives"));
		machines = new GenericTab("machines", getIconItem("machines"));
		ores = new GenericTab("ores", getIconItem("ores"));
		building = new GenericTab("building", getIconItem("building"));
		weapons = new GenericTab("weapons", getIconItem("weapons"));
	}
	
	private static Item getIconItem(String name)
	{
		return Items.APPLE; //this is a scrub! 'name' not used yet
	}
	
}
