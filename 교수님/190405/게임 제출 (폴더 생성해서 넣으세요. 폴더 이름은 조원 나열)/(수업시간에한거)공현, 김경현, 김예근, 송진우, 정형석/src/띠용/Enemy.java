package ¶ì¿ë;

import java.util.Random;
import java.util.Scanner;

public class Enemy {
	String name = "";
	int HP = 0;
	int A = 0;
	int E = 0;
	
	public void makeEnemy() {
		Random r = new Random();
		this.HP = r.nextInt(51) + 20; // 20 ~ 70
	}

	public void eAttack() {
		Random r = new Random();
		this.A = r.nextInt(25) + 1; // 1 ~ 25
		this.E = r.nextInt(25) + 1; // 1 ~ 25
		int Value = this.A - this.E;
		if (Value >= 0) {
			this.HP -= Value;
		}
	}
}