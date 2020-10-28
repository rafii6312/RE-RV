package com.rafii6311.rerv;

import net.minecraft.util.DamageSource;

public class XDamageSource extends DamageSource {
	
	public static DamageSource poison = new DamageSource("poison");
	public static DamageSource poison_heavy = new DamageSource("poison_heavy");
	public static DamageSource acid = new DamageSource("acid");
	public static DamageSource acid_heavy = new DamageSource("acid_heavy");
	public static DamageSource radiation = new DamageSource("radiation");
	public static DamageSource explosion = new DamageSource("explosion");

	public XDamageSource(String damageTypeIn) {
		super(damageTypeIn);
		this.damageType = damageTypeIn;
	}

}
