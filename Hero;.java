package object_oriented;

public class Hero extends Unit {
	private Sword s;

	public Hero(String name, int attack, int hp, int defense,Sword s) {
		super(name, attack, hp, defense);
		this.setName(name);
		this.setAttack(attack);
		this.setHp(hp);
		this.setDefense(defense);
		this.s=s;
	}

	public void Attack(Monster m) {
		System.out.println(this.getName() + "の攻撃!");
		System.out.println(this.getAttack() + "のダメージ!");
		m.setHp(m.getHp() - this.getAttack());
	}
	public void run() {
		System.out.println(this.getName()+"はさっと逃げた!");
	}
}
