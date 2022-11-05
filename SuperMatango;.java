package object_oriented;

public class SuperMatango extends Matango{
	boolean flying;

	public SuperMatango(String name, int attack, int hp, int defense, boolean flying) {
		super(name, attack, hp, defense);
		this.setName(name);
		this.setAttack(attack);
		this.setHp(hp);
		this.setDefense(defense);
		this.setFlying(true);
	}

	public void Attack(Unit u) {
		super.Attack(u);
		if (this.flying) {
			super.Poison(u);
		}
	}

	public boolean isFlying() {
		return flying;
	}

	public void setFlying(boolean flying) {
		this.flying = flying;
	}
	

}
