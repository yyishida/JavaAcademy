/**
* while文基礎
* @author yu-ishida
*/

//文字入力に必要なパッケージをインポートする
import java.util.Scanner;
/**
* Nomal02クラス
* for文で繰り返し処理を行うクラス
*/
public class Nomal02{
       
      
    
	/**
	* mainメソッド
	* @param args コマンドライン引数
	*/
	public static void main(String[] args){
      
      // 文字入力の読み込み
      Scanner scan = new Scanner(System.in);

      
      System.out.println("1~100の整数を入力してください。");

      // 入力の読み込み
      int i = scan.nextInt();

        // 繰り返し処理
      while(!(i%7==0)){
        System.out.println("1~100の整数を入力してください。");

        i = scan.nextInt();
        }
        System.out.println("処理を終了しました。");

        

        
       
   }
      }


