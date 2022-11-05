package object_oriented;

public class Main {

	public static void main(String[] args) {
		Sword s = new Sword("炎の剣", 10);
		Wand w = new Wand("ニワトコの杖", 30);

		Hero h = new Hero("エイト", 30, 40, 10, s);
		Cleric c = new Cleric("ゼルダ", 20, 20, 5, 20, w);
		Wizard wi = new Wizard("ハリー", 20, 10, 5);

		Goblin g = new Goblin("ゴブリン", 7, 7, 7);
		Slime S = new Slime("スライム", 1, 3, 1);
		Matango m = new Matango("マタンゴ", 3, 3, 3);
		SuperMatango Sm = new SuperMatango("スーパーマタンゴ", 10, 15, 10, true);

		System.out.println("モンスターに遭遇した!");
		System.out.println("1:攻撃 2: 逃げる 3: 回復する");
		int choice = new java.util.Scanner(System.in).nextInt();
		int counts = 0;
		while (counts < 5) {
			switch (choice) {
			case 1:
				h.Attack(Sm);
				Sm.setHp(Sm.getHp() - 30);
				c.selfAid(c);
				c.setHp(c.getHp() + 10);
				wi.fireball(m);
				m.setHp(m.getHp() - 20);

				g.Attack(c);
				S.run();
				m.Attack(h);
				Sm.Attack(wi);
				break;

			case 2:
				h.run();
				c.run();
				wi.run();

				break;

			case 3:
				c.selfAid(c);
				break;
			}

			if (g.getHp() == 0 || S.getHp() == 0 || m.getHp() == 0 || Sm.getHp() == 0) {
				System.out.println("モンスター一体倒した!");
				System.out.println("");
				counts++;
			}continue;
					
		}
		System.out.println(h.getName()+"らはモンスターに勝った!");
	}
}
