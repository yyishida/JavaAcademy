/**
*整数を2つ入力し、それぞれの数字を加算・減算・乗算・除算・除算の余りを出力するプログラムを作成
*@author yu-ishida
*/

//文字入力に必要なパッケージのインストール
import java.io.*;


/**
*クラス名 practice02
*計算を行うクラス
*/
public class Practice02{

   public static void main(String[] args) throws Exception { 

   InputStreamReader input = new InputStreamReader(System.in); 
   BufferedReader br = new BufferedReader(input);

   System.out.println("1つ目の数字を入力してください");

   String i = br.readLine();

   int one = Integer.parseInt(i);

   System.out.println("2つ目の数字を入力してください");

   String y = br.readLine();

   int two = Integer.parseInt(y); 

   System.out.println("加算の結果は" + (one + two) + "です");

   System.out.println("減算の結果は" + (one - two) + "です");

   System.out.println("乗算の結果は" + (one * two) + "です");

   System.out.println("除算の結果は" + (one / two) + "です");

   System.out.println("除算の結果は" + (one % two) + "です");
}
}
