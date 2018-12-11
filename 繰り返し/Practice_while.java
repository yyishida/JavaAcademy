/**
* while文基礎
* @author yu-ishida
*/

//文字入力に必要なパッケージをインポートする
import java.util.Scanner;
/**
* Practice_whileクラス
* while文で繰り返し処理を行うクラス
*/
public class Practice_while{

  /**
  * mainメソッド
  *整数値(1〜100)が入力され、while文を使って、7の倍数が入力されると処理が終了するクラス
  * @param args コマンドライン引数
  */
  public static void main(String[] args){

    // 文字入力の読み込み
    Scanner scan = new Scanner(System.in);

    System.out.println("1~100の整数を入力してください。");

    // 入力の読み込み
    int number = scan.nextInt();

    // 繰り返し処理
    while (number % 7 != 0){
      System.out.println("1~100の整数を入力してください。");

      number = scan.nextInt();
    }
    System.out.println("処理を終了しました。");


  }
}


