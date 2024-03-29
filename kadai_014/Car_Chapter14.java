package kadai_014;

public class Car_Chapter14 {

	//クラスのフィールド(内部データ)
	private int gear = 1; //1～5のギアを表す
	private int speed = 10; //ギアチェンジ後の速度を表す
	
	
	//コンストラクタ(初期化)
	public Car_Chapter14 (int gear, int speed ) {
		this.gear =gear;
		this.speed =speed;
	}
	
	public int getGear() {
		return this.gear;
	}
	
	public int getSpeed() {
		return this.speed;
	}

	//車クラスのメソッド
	public void gearChange(int afterGear) {
		System.out.println("ギア" + this.gear + "から" + afterGear + "に切り替えました");
		this.gear = afterGear;
	
		this.speed = switch(this.gear) {
		case 1  -> 10;
		case 2  -> 20;
		case 3  -> 30;
		case 4  -> 40;
		case 5  -> 50;
		default -> 10;
		};
		
	}
	
		
	public void run() {
		//System.out.println("ギア" + beforeGear + "から" + afterGear + "に切り替えました");
		System.out.println("速度は時速" + this.getSpeed() + "kmです");
	
	
	}
}
