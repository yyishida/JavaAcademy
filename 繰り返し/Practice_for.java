/**
* for文基礎
* @author yu-ishida
*/

//文字入力に必要なパッケージをインポートする
import java.io.*;
/**
* Nomal01クラス
* for文で繰り返し処理を行うクラス
*/
public class Practice_for{

	/**
	* mainメソッド
	* @param args コマンドライン引数
	*/
	public static void main(String[] args)throws Exception{

      //argsに受け取ったコマンドライン引数をiに代入
       int i = Integer.parseInt(args[0]);

       int k =0;

       for(int j = 1; j <= i; j++){
       		k += j;
       }

       System.out.println("1から" + i + "の和は、" + k + "です。");

   }

}
