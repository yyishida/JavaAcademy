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
//リストを使うためのクラスをインポート
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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
      //listを宣言
      List<Integer> list = new ArrayList<Integer>();

      // 取り出した値を入れる変数
      int result = 0;

      //ファイルを読み込みlistに格納
      while(scan.hasNext()){
        result = scan.nextInt();

        list.add(result);

      }


      //足し算した値を入れる変数
      int plus = list.get(0);
      //引き算した値を入れる変数
      int minus = list.get(0);
      //掛け算した値を入れる変数
      int multiplied = list.get(0);
      //割り算した値を入れる変数
      int divided = list.get(0);

      for(int i = 1; i < list.size(); i ++){
        plus += list.get(i);
        minus -= list.get(i);
        multiplied *= list.get(i);
        divided /= list.get(i);



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