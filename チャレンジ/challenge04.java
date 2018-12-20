/**
* チャレンジ問題＿場合に応じた処理
* @author yu-ishida
*/
//ランダムさせるクラスをインポート
import java.util.Random;
 // コンピュータによる擬似プレイヤー2人によるじゃんけんを一回行うクラス.
public class challenge04{

	public static void main(String args[]){

		//Playerクラスをインスタンス化して呼び出して変数player1に情報を格納
		//("京和さん")の部分はコンストラクタ
		Player player1 = new Player("京和さん");
		//player1が出す手を決めたいのでsethandメソッドを使う
		player1.sethand();

        //Playerクラスをインスタンス化して呼び出して変数player2に情報を格納
		//("Peperさん")の部分はコンストラクタ
        Player player2 = new Player("Peperさん");

        //player2が出す手を決めたいのでsethandメソッドを使う
    	player2.sethand();

        //Jadgeクラスをインスタンス化して呼び出して変数resultに代入
        Judge result = new Judge(player1,player2);

        // judgmentメソッドを使い勝者を出力する準備
        result.judgment();


	    //ゲームの開始を出力
	    //名前をコンストラクタから
    	System.out.println(player1.name + "対" + player2.name + "のじゃんけんを開始します。");
        //ジャンケンで出した手を出力
    	System.out.println(player1.name + ":" + player1.hand_type + " " + player2.name + ":" + player2.hand_type);
	    //勝者を出力する
		System.out.println(result.judge);
	}
}

class Player{
	//名前を格納するインスタンス変数nameを定義
	public String name;

	//コンストラクタでnameに名前をセット
	Player(String name){
		this.name = name;
	}
	//ジャンケンの手を格納するインスタンス変数handをもつ
	public int hand;

	//変数hand_typeを定義
	public String hand_type;


	// ジャンケンの手を設定するインスタンスメソッドを持つ
    public void sethand(){


    	//1~3のランダムな数字がでてくるそれをint型の変数に代入している
		hand = new java.util.Random().nextInt(3) + 1;

        //ジャンケンの手は定数化する
		final String GUU = "グー";
		final String CHOKI = "チョキ";
		final String PAA = "パー";

		// ジャンケンの手とランダム数値を紐づける
		// handにはhand_numberが入っておりインスタンス化により使えるようになる
	    if(hand == 1){
	    	hand_type = GUU;
	    }else if (hand == 2){
	    	hand_type = CHOKI;
	    }else{
	    	hand_type = PAA;
	    }

	}
}

class Judge{

	public int player1_handNumber;
	public int player2_handNumber;
	public String player1_name;
	public String player2_name;



	//プレイヤー型の引き数を2人分指定して情報を勝敗処理の判定に利用
	//コンストラクタ
	Judge(Player player1,Player player2){
		player1_handNumber = player1.hand;
		player2_handNumber = player2.hand;

		player1_name = player1.name;
		player2_name = player2.name;
	}
	    //jadgeを初期化
		String judge = "";

	// ジャンケンの勝敗判定をして変数
	public void judgment(){


		//ジャンケンの勝敗判定をして変数judgeに代入
 		if(player1_handNumber == player2_handNumber){
 			judge = "あいこです。";
 		}else{
 			if(player1_handNumber == 1){
 				switch(player2_handNumber){
 				    case 2:
 				       	judge = player1_name + "の勝ちです。";
 				        break;
 				    case 3:
 				       	judge = player2_name + "の勝ちです。";
 			            break;
 	            }
 			}else if(player1_handNumber == 2){
 				switch(player2_handNumber){
 					case 1:
 				       	judge = player2_name + "の勝ちです。";
 				        break;
 				    case 3:
 				       	judge = player1_name + "の勝ちです。";
 			            break;
 				}
 			}else if(player1_handNumber == 3){
 				switch(player2_handNumber){
 					case 1:
 			       	judge = player1_name + "の勝ちです。";
 			        break;
 			    case 2:
 			       	judge = player2_name + "の勝ちです。";
 			        break;
 		    	}
 			}
 	    }

	}

}