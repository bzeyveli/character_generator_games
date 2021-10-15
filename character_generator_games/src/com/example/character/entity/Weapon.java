package com.example.character.entity;

import com.example.character.entity.Profession.Professions;

public final class Weapon {

	private Weapon() {

	}

	public enum Weapons {
		AXE, BOW, DAGGER, SWORD, WARHAMMER
	}

	@Override
	public String toString() {
		return "Weapon [toString()=" + super.toString() + "]";
	}

	// valueOf metodu kullanýlabilir

	public static Professions valueOf(String name) {
		Weapons type = null;
		if (name.equals("AXE")) {
			type = Weapons.AXE;
		} else if (name.equals("BOW")) {
			type = Weapons.BOW;
		} else if (name.equals("DAGGER")) {
			type = Weapons.DAGGER;
		} else if (name.equals("SWORD")) {
			type = Weapons.SWORD;
		} else {
			type = Weapons.WARHAMMER;
		}
		return type;
	}

}
