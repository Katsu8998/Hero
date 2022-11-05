package object_oriented;

public class Wizard extends Unit{
	public Wizard(String name, int attack, int hp, int defense) {
		super(name,attack,hp,defense);
		this.setName(name);
		this.setAttack(attack);
		this.setHp(hp);
		this.setDefense(defense);
	}
	public void Attack(Monster m) {
		System.out.println(this.getName()+"の攻撃!");
		System.out.println(this.getAttack()+"のダメージを与えた!");
		m.setHp(m.getHp()-this.getAttack());
	}
	public void fireball(Monster m) {
		System.out.println(this.getName()+"はファイアボールを放った!!");
		System.out.println(this.getAttack()+"のダメージを与えた!");
		m.setHp(m.getHp()-this.getAttack());
	}
	public void run() {
		System.out.println(this.getName()+"はさっと逃げた!");
	}

}
