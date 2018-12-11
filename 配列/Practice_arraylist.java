/**
* チーム石田紹介
* @author yu-ishida
*/

//文字入力に必要なパッケージをインポートする
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/**
* Practice_arraylistクラス
* ArrayListを使い要素を追加し、拡張for文を使い出力するクラス
*/
public class Practice_arraylist{


	/**
	* mainメソッド
	* @param args コマンドライン引数
	*/
	public static void main(String[] args){

       // Stringの要素を格納するためのリストを用意
		  List<String> strList1 = new ArrayList<String>();

		  strList1.add("石田　信一");
		  strList1.add("石田　美和");
		  strList1.add("石田　友");
		  strList1.add("石田　結");

		  System.out.println("チーム石田のメンバーを紹介します。");

		  for(String member : strList1){
		  	System.out.println(member);
		  }

		  System.out.println("以上"+strList1.size()+"名。よろしくお願い致します。");



		}
}

