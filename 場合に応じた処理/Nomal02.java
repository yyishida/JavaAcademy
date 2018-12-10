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
	* @param args コマンドライン引数
	*/
	public static void main(String[] args)throws Exception{

      int i = Integer.parseInt(args[0]);


		switch (i){
		  case 1:
		    System.out.println("非常に不満");
		    break;
		  case 2:
		    System.out.println("少し不満");
		    break;
		  case 3:
		    System.out.println("どちらとも言えない");
		    break;
		  case 4:
		    System.out.println("少し満足");
		    break;
		  case 5:
		    System.out.println("大変満足");
		    break;
	}

	}
}