package object_oriented;

public class Goblin extends Monster{
	public Goblin(String name, int attack, int hp, int defense) {
		super(name, attack,hp, defense);
		this.setName(name);
		this.setAttack(attack);
		this.setHp(hp);
		this.setDefense(defense);
	}
	public void Attack(Unit u) {
		System.out.println(this.getName()+"の攻撃!");
		System.out.println(this.getAttack()+"のダメージ!");
		u.setHp(u.getHp()-this.getAttack());
		
	}
}
