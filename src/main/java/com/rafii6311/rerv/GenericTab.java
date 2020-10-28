package com.rafii6311.rerv;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class GenericTab extends CreativeTabs
{
	public Item icon;
	public GenericTab(String name, Item icon)
	{
		super(CreativeTabs.getNextID(), name);
		this.icon = icon;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public ItemStack getTabIconItem()
	{
		return new ItemStack(icon);
	}
	
	public void setIcon(Item item)
	{
		this.icon = item;
	}
}