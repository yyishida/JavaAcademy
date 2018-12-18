//12/18 これが最新です

/**
* チャレンジ問題＿ピラミッド作成
* @author yu-ishida
*/

// 図を作るクラス.
public class Challenge02{
	/**
	* mainメソッド
	* @param args コマンドライン引数
	* 図を作るメソッド.
	*/
	public static void main(String args[]){


		// 縦
		int row = 4;

		// ループ
		for(int i = 1; i < 5; i++){

			int element = (row + (i - 1));
			int block = (2 * i - 1);
			int space = (row - i);
            //スペースをスペース変数の数だけ表示される
			for(int j = 1; j <= space; j++){
				System.out.print(" ");
			}
            for(int k = 1; k <= block; k++){
            	if(i == 2 && k == 2){
            		System.out.print(" ");

            	}else{
            	System.out.print("◻️");
            	}
            }

			System.out.println("");



		}
	}
}