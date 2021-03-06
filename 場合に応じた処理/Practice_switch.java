/**
* swich文基礎
* @author yu-ishida
*/

//文字入力に必要なパッケージをインポートする
import java.io.*;
/**
* Practice_switchクラス
* switch文で状況に応じた処理を行うクラス
*/
public class Practice_switch{

	/**
	* mainメソッド
	* 実行時引数を用いて整数値(1〜10)を指定し、場合に応じてメッセージを出力するメソッド
	* @param args コマンドライン引数
	*/
	public static void main(String[] args){

    	int grading = Integer.parseInt(args[0]);


		switch (grading){
		case 1:
			System.out.println("もっとがんばりましょう");
			break;
		case 2:
			System.out.println("もう少し頑張りましょう");
			break;
		case 3:
			System.out.println("さらに上を目指しましょう");
			break;
		case 4:
			System.out.println("大変よくできました");
			break;
		case 5:
			System.out.println("大変優秀です");
			break;
		case 6:
		case 7:
		case 8:
		case 9:
		case 10:
			System.out.println("あきらめたらそこで試合終了ですよ");
			break;

		}

	}
}