/**
* 配列基礎
* @author yu-ishida
*/

//文字入力に必要なパッケージをインポートする
import java.util.Scanner;
/**
* Practice_arrayクラス
* 配列に格納を行うクラス
*/
public class Practice_array{

  /**
  * mainメソッド
  * @param args コマンドライン引数
  */
  public static void main(String[] args){
    //配列に格納
    int[]num= {20,30,45,35};

  	int x = 1;

    // 繰り返し処理
    for(int a : num){
      System.out.println(x+"番目の社員の点数は"+a+"点です。");
      x++;
    }
    System.out.println("過去問を解いた社員の人数は全部で"+num.length+"人です。");
  }
}


