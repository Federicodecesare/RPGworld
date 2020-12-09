package it.begear.rpgworld.utils;

import java.util.Random;

import it.begear.rpgworld.entity.Personaggio;

public class Metodivari {
	public static int valorerandom(int ex,int max) {
		Random random = new Random();
		int val;
		do {
		val = random.nextInt(max);
		} while(ex!=val);
		return val;
	}
	public static int sceltarandom() {
		Random random = new Random();
		int val;
		val = random.nextInt(2);
		return val;
	}
	public static int danno(Personaggio p1,Personaggio p2, boolean a1) {
		int d=0;
		return d;
		
		
	}
}
