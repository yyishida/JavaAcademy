/**
* for文基礎
* @author yu-ishida
*/

/**
* Practice_forクラス
* for文で繰り返し処理を行うクラス
*/
public class Practice_for{

	/**
	* mainメソッド
  *1〜実行時引数で渡された値の和を計算するメソッド
	* @param args コマンドライン引数
	*/
	public static void main(String[] args){

    //argsに受け取ったコマンドライン引数をiに代入
    int number = Integer.parseInt(args[0]);

    int total =0;

    for(int j = 1; j <= number; j++){
      total += j;
    }

    System.out.println("1から" + number + "の和は、" + total + "です。");

  }

}
