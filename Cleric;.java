package object_oriented;

public class Cleric extends Unit {
	private int mp;
	private Wand wand;

	public Cleric(String name, int attack, int hp, int defense, int mp,Wand wand) {
		super(name, attack, hp, defense);
		this.setName(name);
		this.setAttack(attack);
		this.setHp(hp);
		this.setDefense(defense);
		this.setMp(mp);
		this.wand=wand;
	}

	public void Attack(Monster m) {
		System.out.println(this.getName() + "の攻撃!");
		System.out.println(this.getAttack() + "のダメージを与えた!");
		m.setHp(m.getHp() - this.getAttack());
	}

	public void selfAid(Unit u) {
		System.out.println(this.getName() + "はセルフエイドを唱えた!");
		System.out.println(u.getName() + "は10Hp回復した!");
		u.setHp(u.getHp() + 10);
	}

	public void magic(Cleric c) {
		System.out.println(c.getName()+"は"+this.getName()+"を振った");
		System.out.println(this.getAttack()+"のダメージを与えた!");
		this.setMp(this.getMp()-5);
	}
	public void run() {
		System.out.println(this.getName()+"はさっと逃げた!");
	}
	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		if (this.mp < 0) {
			mp = 0;
		} else if (this.mp > 100) {
			throw new IllegalArgumentException("攻撃力が異常です。処理を中断");
		}
		this.mp = mp;
	}
	
}
