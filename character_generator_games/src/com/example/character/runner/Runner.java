package com.example.character.runner;

import com.example.character.entity.Armor.Armors;
import com.example.character.entity.Characterr;
import com.example.character.entity.Characterr.Builder;
import com.example.character.entity.HairColor.HairColors;
import com.example.character.entity.HairType.HairTypes;
import com.example.character.entity.Profession.Professions;
import com.example.character.entity.Weapon.Weapons;

public class Runner {
	public static void main(String[] args) {

		HairColors color = HairColors.BLACK;
		HairTypes type = HairTypes.CURLY;
		Armors armor = Armors.CLOTHES;
		Professions professions = Professions.MAGE;
		Weapons weapons = Weapons.BOW;
		
		Builder character = new Characterr.Builder().name("Artur").hairColor(color).armor(armor).hairType(type)
				.profession(professions).weapon(weapons);
		System.out.println("yeni oyuncu :" + character);

	}
}
