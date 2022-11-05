package object_oriented;

public class Wand extends Item {
	private int power;

	public Wand(String name, int power) {
		super(name);
		this.setName(name);
		this.setPower(power);
	}

	public void magic(Cleric c) {
			
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		if (power < 0 || power > 100) {
			throw new IllegalArgumentException("攻撃力が異常です。処理を中断");
		}
		this.power = power;
	}
}
