package object_oriented;

public class Matango extends Monster {
	public Matango(String name, int attack, int hp, int defense) {
		super(name, attack, hp, defense);
		this.setName(name);
		this.setAttack(attack);
		this.setHp(hp);
		this.setDefense(defense);
	}

	public void Attack(Unit u) {
		System.out.println(this.getName() + "の攻撃!");
		System.out.println(this.getAttack() + "のダメージ!");
		u.setHp(u.getHp() - this.getAttack());
	}

	public void Poison(Unit u) {
		System.out.println(this.getName() + "は毒の胞子を放った!");
		System.out.println(this.getAttack() + "のダメージ!");
		u.setHp(u.getHp() - this.getAttack());
	}
}