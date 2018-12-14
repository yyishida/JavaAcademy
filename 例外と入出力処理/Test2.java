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
      int num1 = 0;
      //引き算した値を入れる変数
      int num2 = 0;
      //掛け算した値を入れる変数
      int num3 = 1;
      //割り算した値を入れる変数
      int num4 = 0;

      //ファイルを読み込み計算する
      while(scan.hasNext()){
        numbers = scan.nextInt();

        num1 += numbers;

        if(num2 == 0){
          num2 = numbers;
        }else{
          num2 -= numbers;
        }

        num3 *= numbers;

        if(num4 == 0){
          num4 = numbers;
        }else{
          num4 /= numbers;
        }
      }
      //ファイルを書き込み
      File file2 = new File("./file/output/TestOutput.txt");

      PrintWriter pw = new PrintWriter(new FileWriter(file2));

      pw.println(num1);

      pw.println(num2);

      pw.println(num3);

      pw.println(num4);

      pw.close();

    }catch(FileNotFoundException e){
      System.out.println("ファイルが存在しません");

    }catch(IOException e){
      System.out.println(e);
    }
  }
}