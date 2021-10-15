package com.example.character.entity;

import com.example.character.entity.Armor.Armors;
import com.example.character.entity.HairColor.HairColors;
import com.example.character.entity.HairType.HairTypes;
import com.example.character.entity.Profession.Professions;
import com.example.character.entity.Weapon.Weapons;

public class Characterr {

	private String name;
	private Professions profession;
	private HairTypes hairType;
	private HairColors hairColor;
	private Armors armor;
	private Weapons weapon;

	private Characterr(Builder builder) {
		this.name = builder.name;
		this.profession = builder.profession;
		this.armor = builder.armor;
		this.weapon = builder.weapon;
		this.hairColor = builder.hairColor;
		this.hairType = builder.hairType;
	}

	public String getName() {
		return name;
	}

	public Professions getProfession() {
		return profession;
	}

	public HairTypes getHairType() {
		return hairType;
	}

	public HairColors getHairColor() {
		return hairColor;
	}

	public Armors getArmor() {
		return armor;
	}

	public Weapons getWeapon() {
		return weapon;
	}

	public static class Builder {

		private String name;
		private Professions profession;
		private HairTypes hairType;
		private HairColors hairColor;
		private Armors armor;
		private Weapons weapon;

		public Builder(String name, Professions profession) {
			try {
				validation(name, profession);
				this.name = name;
				this.profession = profession;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		public Builder() {
		}

		public Builder name(String name) {
			this.name = name;
			return this;
		}

		public Builder profession(Professions profession) {
			this.profession = profession;
			return this;
		}

		public Builder hairType(HairTypes hairType) {
			this.hairType = hairType;
			return this;
		}

		public Builder hairColor(HairColors hairColor) {
			this.hairColor = hairColor;
			return this;
		}

		public Builder armor(Armors armor) {
			this.armor = armor;
			return this;
		}

		public Builder weapon(Weapons weapon) {
			this.weapon = weapon;
			return this;
		}

		public Characterr build() {
			return new Characterr(this);
		}

		@Override
		public String toString() {
			return "Builder [name=" + name + ", profession=" + profession + ", hairType=" + hairType + ", hairColor="
					+ hairColor + ", armor=" + armor + ", weapon=" + weapon + "]";
		}

		public static void validation(String name, Professions profession) {

			if (name == null || profession == null) {
				try {
					throw new IllegalAccessException();
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
