package com.rafii6311.rerv;

import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;

public class GenericComponent extends Item {
	private boolean isDisposableFluid = false;
	private String desc;
	private String name;
	
	public GenericComponent(String name, boolean isDisposableFluid, int maxStackSize, String desc)
	{
		this.name = name;
		this.isDisposableFluid = isDisposableFluid;
		this.desc = desc;
		setMaxStackSize(maxStackSize);
		setCreativeTab(Tabs.components);
		setRegistryName(new ResourceLocation(RERV.MODID, name));
		setUnlocalizedName(name);
				
		
		//not finished yet!
	}
}
