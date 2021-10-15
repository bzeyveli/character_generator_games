package com.example.character.entity;

public class HairType {

	public String title;

	private HairType() {

	}

	public enum HairTypes {
		BALD, CURLY, LONG_CURLY, SHORT, LONG_SHORT
	}

	@Override
	public String toString() {
		return "HairType [title=" + title + "]";
	}

	// valueOf metodu kullanýlabilir
	public static HairTypes valueOf(String name) {
		HairTypes type = null;
		if (name.equals("BALD")) {
			type = HairTypes.BALD;
		} else if (name.equals("CURLY")) {
			type = HairTypes.CURLY;
		} else if (name.equals("LONG_CURLY")) {
			type = HairTypes.LONG_CURLY;
		} else if (name.equals("SHORT")) {
			type = HairTypes.SHORT;
		} else {
			type = HairTypes.LONG_SHORT;
		}
		return type;
	}
}
