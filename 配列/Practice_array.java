/**
* 配列基礎
* @author yu-ishida
*/

/**
* Practice_arrayクラス
* 配列に格納を行うクラス
*/
public class Practice_array{

  /**
  * mainメソッド
  *社員の点数を一次元配列に格納し、その配列を用いて社員の点数、過去問を解いた社員の人数を出力するクラス
  * @param args コマンドライン引数
  */
  public static void main(String[] args){
    //配列に格納
    int[] num= {20,30,45,35};

  	int number = 1;

    // 繰り返し処理
    for(int result : num){
      System.out.println(number+"番目の社員の点数は"+result+"点です。");
      number++;
    }
    System.out.println("過去問を解いた社員の人数は全部で"+num.length+"人です。");
  }
}


