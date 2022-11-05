package object_oriented;

public abstract class Unit {
	private String name;
	private int attack;// 攻撃力
	private int hp;// HP
	private int defense;// 防御力

	public Unit(String name, int attack, int hp, int defense) {
		this.name = name;
		this.attack = attack;
		this.hp = hp;
		this.defense = defense;
	}
	
	public abstract void Attack(Monster m);
		

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (this.name == null) {
			throw new IllegalArgumentException("名前が空欄です。処理を中断");
		}
		this.name = name;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		if (this.attack < 0 || this.attack > 100) {
			throw new IllegalArgumentException("攻撃力が異常です。処理を中断");
		}
		this.attack = attack;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		if (this.hp < 0) {
			hp = 0;
		} else if (this.hp > 100) {
			hp=100;
		}
		this.hp = hp;
	}

	public int getDefense() {
		return defense;
	}

	public void setDefense(int defense) {
		if (this.defense < 0) {
			throw new IllegalArgumentException("防御力が異常です。処理を中断");
		}
		this.defense = defense;
	}
}
