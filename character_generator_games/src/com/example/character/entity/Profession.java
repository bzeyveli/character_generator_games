package com.example.character.entity;

public class Profession {

	private Profession() {

	}

	public enum Professions {
		MAGE, PRIEST, THOEF, WARRIOR
	}

	@Override
	public String toString() {
		return "Profession [toString()=" + super.toString() + "]";
	}

	// valueOf metodu kullanýlabilir
	public static Professions valueOf(String name) {
		Professions type = null;
		if (name.equals("MAGE")) {
			type = Professions.MAGE;
		} else if (name.equals("PRIEST")) {
			type = Professions.PRIEST;
		} else if (name.equals("THOEF")) {
			type = Professions.THOEF;
		} else {
			type = Professions.WARRIOR;
		}
		return type;
	}
}
