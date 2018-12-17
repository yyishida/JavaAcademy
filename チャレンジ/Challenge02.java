/**
* チャレンジ問題＿ピラミッド作成
* @author yu-ishida
*/

// 図を作るクラス.
public class Challenge02{
	/**
	* mainメソッド
	* @param args コマンドライン引数
	*図を作るメソッド.
	*/
	public static void main(String args[]){
        System.out.println("      "+"◻️");
        System.out.println("    "+"◻️"+"  "+" "+"◻️");
		System.out.println("  "+"◻️"+" "+"◻️"+" "+"◻️"+" "+"◻️"+" "+"◻️");
		System.out.println("◻️"+" "+"◻️"+" "+"◻️"+" "+"◻️"+" "+"◻️"+" "+"◻️"+" "+"◻️");

		for(int i = 4; i < 8; i ++){
			for(int j = 3; j > 0; j --){
				System.out.println("  ");
			}

		}

	}
}