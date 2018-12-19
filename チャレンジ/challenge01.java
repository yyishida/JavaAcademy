//12/18 これが最新です

/**
* チャレンジ問題＿場合に応じた処理
* @author yu-ishida
*/
//ランダムさせるクラスをインポート
import java.util.Random;
// コンピュータによる擬似プレイヤー2人によるじゃんけんを一回行うクラス.
public class challenge01{


	public static void main(String args[]){

		//定数化
		final String GUU = "グー";
		final String CHOKI = "チョキ";
		final String PAA = "パー";

		//ランダムな値を作り、変数に値を入れる
	    int player1 = new java.util.Random().nextInt(3)+1;

		int player2 = new java.util.Random().nextInt(3)+1;

		//手を格納する変数の初期化
		String player1_hands = "";

		String player2_hands = "";




		if(player1 == 1){
			player1_hands = GUU;
		}else if(player1 == 2){
			player1_hands = CHOKI;
		}else{
			player1_hands = PAA;
        }

        if(player2 == 1){
			player2_hands = GUU;
		}else if(player2 == 2){
			player2_hands = CHOKI;
		}else{
			player2_hands = PAA;
        }


	    String jadge = "";


		if(player1 == player2){
			judge = "あいこです。";
		}else{
			if(player1 == 1){
				if(player2 == 2){
					judge = "player1の勝ちです。";
	        }else if(player1 == 2){
	        	if(player2 == 3){
                	judge = "player1の勝ちです。";
	        }else if(player1 == 3){
	        	if(player2 == 1){
	        		judge = "player1の勝ちです。";
	        }else{
	        	judge = "player2の勝ちです。";
	        }
	        }
	        }
		}
		//ジャンケン出力
		System.out.println("ジャンケンを開始します。");

		System.out.println("player1:" + player1_hands);

		System.out.println("player2:" + player2_hands);

		System.out.println(judge);
    }
}

