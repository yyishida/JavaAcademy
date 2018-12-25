/**
* 「私の名前は[自分の名前]です」をコンソール上に表示するプログラム
* @author yu-ishida
*/
import java.io.*;
/**
* クラス名 practice01
*/
public class Practice01{

 public static void main(String[] args)throws Exception{

  InputStreamReader input = new InputStreamReader(System.in);
  BufferedReader br = new BufferedReader(input); 

  System.out.println("名前を入力してください");

  String str = br.readLine(); 

  System.out.println("私の名前は" + str + "です");
 }
}
