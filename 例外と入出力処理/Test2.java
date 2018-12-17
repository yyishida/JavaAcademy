/**
* 入出力
* @author yu-ishida
*/
//ファイルを読み込むクラスをインポート
import java.util.Scanner;
//ファイルがない場合に例外処理をするクラスをインポート
import java.io.FileNotFoundException;
//ファイルを読み込むクラスをインポート
import java.io.File;
//ファイルに書き込むクラスをインポート
import java.io.FileWriter;
//例外処理をするクラスをインポート
import java.io.IOException;
//ファイルを読み込むクラスをインポート
import java.io.PrintWriter;

//csvファイルを読み込み、四則演算をしてtxtファイルに出力するクラス
class Test2{
  /**
  * @param args コマンドライン引数
  * mainメソッド
  */
  public static void main(String args[]){
    try{
      //ファイルを読み込み
      File file = new File("./file/input/Test.csv");
      Scanner scan = new Scanner(file);
      //カンマで区切って読み込む
      scan.useDelimiter(",");

      // 取り出した値を入れる変数
      int numbers = 0;
      //足し算した値を入れる変数
      int plus = 0;
      //引き算した値を入れる変数
      int minus = 20;
      //掛け算した値を入れる変数
      int multiplied = 1;
      //割り算した値を入れる変数
      int divided = 100;



      //ファイルを読み込み計算する
      while(scan.hasNext()){
        numbers = scan.nextInt();

        plus += numbers;

        //if(minus == 0){
         // minus = numbers;
        // }else{
        minus -= numbers;
        //}

        multiplied *= numbers;

        //if(divided == 0){
        //  divided = numbers;
        //}else{
        divided /= numbers;
        //}
      }
      //ファイルを書き込み
      File file2 = new File("./file/output/TestOutput.txt");

      PrintWriter pw = new PrintWriter(new FileWriter(file2));

      pw.println(plus);

      pw.println(minus);

      pw.println(multiplied);

      pw.println(divided);

      pw.close();

    }catch(FileNotFoundException e){
      System.out.println("ファイルが存在しません");

    }catch(IOException e){
      System.out.println(e);
    }
  }
}