/**
* if文基礎
* @author yu-ishida
*/

//文字入力に必要なパッケージをインポートする
import java.io.*;
/**
* Practice_ifクラス
* if文で状況に応じた処理を行うクラス
*/
public class Practice_if{

	/**
	* mainメソッド
    * キーボードから整数値(1〜10)を入力され、入力された数値によりメッセージを変更して出力するメソッド
	* @param args コマンドライン引数
	*/
	public static void main(String[] args)throws Exception{
        //文字入力の準備
	    InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(input);

        System.out.println("1~10の整数を入力してください");

        //入力を読み込む
        String number = br.readLine();

        //文字列を数値に変えiに代入
        int i = Integer.parseInt(number);

        //if文を使い条件分岐
        if (i > 0 && i <= 10){
            if (i > 0 && i < 5){
            	System.out.println("5未満の整数" + i + "が入力されました。");
            }else if (i == 5){
                System.out.println("5が入力されました。");
            }else{
            	System.out.println("6以上の整数" + i + "が入力されました。");
            }
        }else{
            System.out.println("1~10の整数を入力してください！！");
        }

	}
}