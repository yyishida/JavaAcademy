/**
* swich文基礎
* @author yu-ishida
*/

//文字入力に必要なパッケージをインポートする
import java.io.*;
/**
* Nomal0２クラス
* switch文で状況に応じた処理を行うクラス
*/
public class Nomal02 {

	/**
	* mainメソッド
	* 実行時引数を用いて整数値(1〜10)を指定し、場合に応じてメッセージを出力するメソッド
	* @param args コマンドライン引数
	*/
	public static void main(String[] args){

      int i = Integer.parseInt(args[0]);


		switch (i){
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
		    System.out.println("あきらめたらそこで試合終了ですよ");
		    break;
		  case 7:
		    System.out.println("あきらめたらそこで試合終了ですよ");
		    break;
		  case 8:
		    System.out.println("あきらめたらそこで試合終了ですよ");
		    break;
		  case 9:
		    System.out.println("あきらめたらそこで試合終了ですよ");
		    break;
		  case 10:
		    System.out.println("あきらめたらそこで試合終了ですよ");
		    break;

	}

	}
}