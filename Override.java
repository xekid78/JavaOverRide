/**
 *
 * @author xekid78
 *
 */
public class Override {

	public static void main(String[] args) {
		Box2 box = new Box2("鋼鉄の剣");
		box.open();

		System.out.println();
		MagicBox magicbox = new MagicBox("ものまねモンスター");
		magicbox.look();
		magicbox.open();

	}

}

class Box2 {
	public String myItem;

	public Box2(String item) {
		myItem = item;
	}

	public void open() {
		System.out.println("宝箱を開いた。" + myItem + "を手に入れた。");
	}
}

class MagicBox extends Box2 {
	public MagicBox(String item) {
		super(item);
	}

	public void look() {
		System.out.println("宝箱は怪しく輝いている");
	}

	public void open() {
		System.out.println("宝箱を開いた。" + myItem + "が襲ってきた！");
	}
}
