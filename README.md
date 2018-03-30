# JavaOverRide
オーバーライド

## 処理
`Box2()`クラスの`open()`メソッドを`MagicBox()`クラスでオーバーライドする。

## コード
```
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
```

## 出力結果  
```
宝箱を開いた。鋼鉄の剣を手に入れた。
宝箱は怪しく輝いている
宝箱を開いた。ものまねモンスターが襲ってきた！
```
  
## 開発環境
| 開発ツール |  |
|:-|:-|
| OS | Windows10 |
| 統合開発環境(IDE) | Eclipse 4.7.0 Oxygen |
| 開発言語 | Java8 |
