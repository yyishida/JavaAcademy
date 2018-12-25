/**
* 多次元配列基礎
* @author yu-ishida
*/

/**
* Practice_array2クラス
* 多次元配列で格納を行うクラス
*/
public class Practice_array2{

	/**
	* mainメソッド
	*4人の成績を格納する二次元配列を定義し、それぞれの社員の1回目から3回目までの結果を出力するクラス
	* @param args コマンドライン引数
	*/
	public static void main(String[] args){
		//宣言と初期化
		int[][] seiseki={{20,50,60,},
                         {30,60,70,},
                         {45,60,80,},
                         {35,40,50,}};

		for(int i = 0; i<seiseki.length; i++){
			for(int j = 0; j<seiseki[i].length; j++){

				System.out.println("社員"+(i+1)+"の"+(j+1)+"回目の点数は"+seiseki[i][j]+"です。");

			}
		}
	}
}
