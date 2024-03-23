package kadai_008;

public class price_Chapter08 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//変数の宣言と代入
		int userAge =30;
		int serviceCost =0;
		
		 switch(userAge) {
		 case 10  -> serviceCost = 1000;
		 case 20  -> serviceCost = 2000;
		 case 30  -> serviceCost = 3000;
		 case 40  -> serviceCost = 4000;
		 case 50  -> serviceCost = 5000;
		 case 60  -> serviceCost = 6000;
		 case 70  -> serviceCost = 7000;
		 default  -> serviceCost =  500;
		};
		
		System.out.println(userAge + "代の料金は" + serviceCost + "円");
		}
		
	}


