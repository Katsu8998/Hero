package object_oriented;

public abstract class Item {
	private String name;

	public Item(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (this.name == null) {
			throw new IllegalArgumentException("名前が空欄です。処理を中断");
		}
		this.name = name;
	}
}
