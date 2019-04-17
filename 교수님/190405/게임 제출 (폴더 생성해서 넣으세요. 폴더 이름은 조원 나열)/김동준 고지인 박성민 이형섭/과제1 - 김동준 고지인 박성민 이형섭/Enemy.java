
import java.util.Random;

public class Enemy {
	String name = "";
	int hp = 0;
	int criProbabilty = 0;
	int strength = 0;
	double criDamage = 0;
	double avoidProbability = 0;
	
	Enemy(String name, int hp, int strength, int criProbabilty, double criDamage, double avoidProbability) {
		this.name = name;
		this.hp = hp;
		this.criProbabilty = criProbabilty;
		this.criDamage = criDamage;
		this.strength = strength;
		this.avoidProbability = avoidProbability;
	}
}
