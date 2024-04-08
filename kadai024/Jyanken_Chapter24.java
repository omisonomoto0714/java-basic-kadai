package kadai024;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter24 {

	public String getMyChoice() {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("自分のじゃんけんの手を入力しましょう");
			System.out.println("グーはrockのrを入力しましょう");
			System.out.println("チョキはscissorsのsを入力しましょう");
			System.out.println("パーはpaperのpを入力しましょう");

			String input = scanner.next();

			if ((input.equals("r")) || (input.equals("s")) || (input.equals("p"))) {
				scanner.close();
				return input;

			} else {
				System.out.println("入力が正しくありません。再度入力してください");
				continue;
			}
		}
	}

	public String getRandom() {
		String[] challenger = { "r", "s", "p" };

		int c = (int) (Math.floor(Math.random() * 2));

		return challenger[c];

	}

	public void playGame() {
		HashMap<String, String> choice = new HashMap<String, String>();

		choice.put("r", "グー");
		choice.put("s", "チョキ");
		choice.put("p", "パー");

		String me = this.getMyChoice();
		String you = this.getRandom();

		System.out.println("自分の手は" + choice.get(me) + ",対戦相手は" + choice.get(you));

		//あいこ
		if ((me.equals("r") && you.equals("r")) || (me.equals("s") && you.equals("s"))
				|| (me.equals("p") && you.equals("p"))) {
			System.err.println("あいこです");
		}

		///自分が勝った場合
		if ((me.equals("r") && you.equals("s")) || (me.equals("s") && you.equals("p"))
				|| (me.equals("p") && you.equals("r"))) {
			System.out.println("自分の勝ちです");
		}
		//自分が負けた場合
		if ((me.equals("r") && you.equals("p")) || (me.equals("s") && you.equals("r"))
				|| (me.equals("p") && you.equals("s"))) {
			System.out.println("自分の負けです");
		}

	}

}
