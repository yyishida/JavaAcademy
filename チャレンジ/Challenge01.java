/**
* チャレンジ問題＿場合に応じた処理
* @author yu-ishida
*/

// コンピュータによる擬似プレイヤー2人によるじゃんけんを一回行うクラス.
public class challenge01{
	/**
	* mainメソッド
	* @param args コマンドライン引数
	*ジャンケンをして結果を出力するメソッド
	*/
	public static void main(String args[]){
		//ジャンケン
		System.out.println("ジャンケンを開始します。");

		int player1 = new java.util.Random().nextInt(3)+1;

		int player2 = new java.util.Random().nextInt(3)+1;

	if(player1 == 1){
			switch(player2){
				case 1:
			       	System.out.println("player1:グー");
			       	System.out.println("player2:グー");
			       	System.out.println("あいこです。");
			    break;
			    case 2:
			    	System.out.println("player1:グー");
			       	System.out.println("player2:チョキ");
			       	System.out.println("player1の勝ちです。");
			    break;
			    case 3:
			    	System.out.println("player1:グー");
			       	System.out.println("player2:パー");
			       	System.out.println("player2の勝ちです。");
		        break;
		    }
		}else if(player1 == 2){
			switch(player2){
				case 1:
			       	System.out.println("player1:チョキ");
			       	System.out.println("player2:グー");
			       	System.out.println("player2の勝ち。");
			    break;
			    case 2:
			    	System.out.println("player1:チョキ");
			       	System.out.println("player2:チョキ");
			       	System.out.println("あいこです。");
			    break;
			    case 3:
			    	System.out.println("player1:チョキ");
			       	System.out.println("player2:パー");
			       	System.out.println("player1の勝ちです。");
		        break;
		    }
		}else if(player1 == 3){
			switch(player2){
				case 1:
			       	System.out.println("player1:パー");
			       	System.out.println("player2:グー");
			       	System.out.println("player1の勝ちです。");
			    break;
			    case 2:
			    	System.out.println("player1:パー");
			       	System.out.println("player2:チョキ");
			       	System.out.println("player2の勝ちです。");
			    break;
			    case 3:
			    	System.out.println("player1:パー");
			       	System.out.println("player2:パー");
			       	System.out.println("あいこです。");
		        break;
		    }
		}
    }
}

