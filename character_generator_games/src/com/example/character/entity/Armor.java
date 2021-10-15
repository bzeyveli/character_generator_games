package com.example.character.entity;

public class Armor {

	public String title;

	private Armor() {

	}

	public enum Armors {
		CHAIN_MAIL, CLOTHES, LEATHER, PLATE_MAIL
	}

	@Override
	public String toString() {
		return "Armor [title=" + title + "]";
	}
	
	//  valueOf metodu kullanýlabilir 
	public static Armors valueOf(String name) {
		Armors type=null;
		if(name.equals("CHAIN_MAIL")) {
			type=Armors.CHAIN_MAIL;
		}else if(name.equals("CLOTHES")) {
			type= Armors.CLOTHES;
		}else if(name.equals("LEATHER")) {
			type = Armors.LEATHER;
		}else {
			type =Armors.PLATE_MAIL;
		}
		return type;
	}

}