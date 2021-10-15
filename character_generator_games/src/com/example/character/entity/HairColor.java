package com.example.character.entity;

public class HairColor {

	private HairColor() {
	}

	public enum HairColors {
		BLACK, BLOND, BROWN, RED, WHÝTE
	}

	@Override
	public String toString() {
		return "HairColor [toString()=" + super.toString() + "]";
	}

	// valueOf metodu kullanýlabilir

	public static HairColors valueOf(String name) {
		HairColors type = null;
		if (name.equals("BLACK")) {
			type = HairColors.BLACK;
		} else if (name.equals("BLOND")) {
			type = HairColors.BLOND;
		} else if (name.equals("BROWN")) {
			type = HairColors.BROWN;
		} else if (name.equals("RED")) {
			type = HairColors.RED;
		} else {
			type = HairColors.WHÝTE;
		}
		return type;
	}
}
