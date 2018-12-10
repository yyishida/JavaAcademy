/**
* チーム石田紹介
* @author yu-ishida
*/

//文字入力に必要なパッケージをインポートする
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/**
* Nomal0３クラス
* ArrayList
*/
public class Nomal03{


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

		  // 追加した順にリストに入る
		  System.out.println(strList1);

		}
}

