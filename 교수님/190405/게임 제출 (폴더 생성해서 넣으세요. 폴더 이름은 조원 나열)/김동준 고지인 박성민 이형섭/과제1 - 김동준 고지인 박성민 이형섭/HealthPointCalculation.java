
public class HealthPointCalculation {
	public int newHp;
	public void damageLoad(int hp, int damage){
		Attack damage = new Attack();
		this.newHp = hp - damage.damage;
	}
}
