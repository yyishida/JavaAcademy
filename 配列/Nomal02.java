/**
* 多次元配列基礎
* @author yu-ishida
*/

//文字入力に必要なパッケージをインポートする
import java.util.Scanner;
/**
* Nomal02クラス
* 多次元配列で格納を行うクラス
*/
public class Nomal02{
       
      
    
	/**
	* mainメソッド
	* @param args コマンドライン引数
	*/
	public static void main(String[] args){
    //宣言
	int[][] seiseki=new int[4][];

	// インスタンスの生成と初期化
	seiseki[0]=new int[]{20,50,60};
	seiseki[1]=new int[]{30,60,70};
	seiseki[2]=new int[]{45,60,80};
	seiseki[3]=new int[]{35,40,50};

      int x = 1;
      int y = 1;
	for(int i = 0; i<seiseki.length; i++){
		for(int j = 0; j<seiseki[0].length; j++){

			System.out.println("社員"+x+"の"+y+"回目の点数は"+seiseki[i][j]+"です。");
         y++;
		}x++;y=1;
	}


}


}