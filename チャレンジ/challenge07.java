//ファイルに書き込むクラスをインポート
import java.io.FileWriter;
//例外処理をするクラスをインポート
import java.io.IOException;
//ファイルを読み込むクラスをインポート
import java.io.PrintWriter;
//ファイルを読み込むクラスをインポート
import java.io.File;
//例外処理をするクラスをインポート
import java.io.IOException;
//日付フォーマットを作成するクラスをインポート
import java.text.SimpleDateFormat;
//日時を
import java.util.Calendar;
//ランダムさせるクラスをインポート
import java.util.Random;

// Playerクラス、Judgeクラスをインスタンス化して出力するクラス
public class challenge07{
	/**
    * mainメソッド
    * @param args コマンドライン引き数
    */
	public static void main(String args[]){

		//Playerクラスをインスタンス化して呼び出して変数player1に情報を格納
		//("京和さん")の部分はコンストラクタ
		Player player1 = new Player("ランダム戦略さん");

		//戦略メソッドを使用
		player1.setRondomTactics();
		//player1が出す手を決めたいのでsethandメソッドを使う
		player1.sethand();

        //Playerクラスをインスタンス化して呼び出して変数player2に情報を格納
		//("Peperさん")の部分はコンストラクタ
        Player player2 = new Player("グーだけ戦略さん");

        //戦略メソッドを使用
        player2.setCrazyTactics();

        //player2が出す手を決めたいのでsethandメソッドを使う
    	player2.sethand();

        //Jadgeクラスをインスタンス化して呼び出して変数resultに代入
        Judge result = new Judge(player1,player2);

        // judgmentメソッドを使い勝者を出力する準備
        result.judgment();


		try{
			//Calendarクラスのオブジェクトを生成する
            Calendar cl = Calendar.getInstance();
	    	//SimpleDateFormatクラスでフォーマットパターンを設定する
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
            //ファイル名用フォーマットをインスタンス化
            SimpleDateFormat filename = new SimpleDateFormat("yyyyMMdd");


			//ファイルを読み込み
	    	File file = new File("./file/result/OutputJanken_日付" + filename.format(cl.getTime()) + ".txt");

	    	//ファイルを書き込むクラスをインスタンス化
	    	PrintWriter pw = new PrintWriter(new FileWriter(file));
            //書き込み
			pw.println("【日付】");

			pw.println(sdf.format(cl.getTime()));

            pw.println("\n");

            pw.println("【対戦者】");

            pw.println(player1.name + "," + player2.name);

            pw.println("\n");

            pw.println("【結果】");

            pw.println(player1.name + ":" + player1.hand_type);

            pw.println(player2.name + ":" + player2.hand_type);

            pw.println("\n");

            pw.println(result.judge);

			//書き込み終了
			pw.close();

		}catch(IOException e){
			System.out.println(e);
		}
	}
}
//名前とじゃんけんの手を定義するクラス
class Player{
	//名前を格納するインスタンス変数nameを定義
	public String name;

	/**コンストラクタでnameに名前をセット
	*@param name インスタンス化される際に定義した名前が引数
	*/
	Player(String name){
		this.name = name;
	}
	//ジャンケンの手を格納するインスタンス変数handをもつ
	public int hand;

	//変数hand_typeを定義
	public String hand_type;




	//戦略を格納するTactics型（インターフェース）の変数を宣言する
    public Tactics tac;

    //tac変数にランダム戦略をセットするメソッド
    public void setRondomTactics(){
    	// 変数tacにセットするためのにRandomTactics抽象クラスをインスタンス化
    	this.tac = new RandomTactics();
    }

    //tac変数にグーだけ戦略をセットするメソッド
    public void setCrazyTactics(){
    	//変数tacにセットするためにCrazyTactics抽象クラスをインスタンス化
    	this.tac = new CrazyTactics();
    }



	// ジャンケンの手を設定するインスタンスメソッド
    public void sethand(){

    	//ランダムにジャンケンの手を返却する戦略,グーのみを出す戦略を変数handにセット
    	hand = tac.readTactics();



    	//1~3のランダムな数字がでてくるそれをint型の変数に代入している
		//hand = new java.util.Random().nextInt(3) + 1;

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
// ジャンケンの勝敗を決めるクラス
class Judge{
	//player型をint型に変えるために変数を定義
	public int player1_handNumber;
	public int player2_handNumber;
	//player型をString型に変えるために変数を定義
	public String player1_name;
	public String player2_name;

	//プレイヤー型の引き数を2人分指定して情報を勝敗処理の判定に利用
	/**
	* Judgeがインスタンス化された時に作成されるコンストラクタ
	* @param player1 Player型の変数player1が引数
	* @param player2 Player型の変数player2が引数
	*/
	Judge(Player player1,Player player2){
		player1_handNumber = player1.hand;
		player2_handNumber = player2.hand;

		player1_name = player1.name;
		player2_name = player2.name;
	}
	    //jadgeを初期化
		String judge = "";

	// ジャンケンの勝敗判定をするメソッド
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
/**
 * じゃんけん戦略インターフェース
 */
//抽象クラスの最上位
interface Tactics{
    /**
	* 戦略の通りにじゃんけんの手を返却するメソッド.
	* グー・チョキ・パーは以下の対応を取る整数で表す.
	* (1:グー　2:チョキ　3:パー)
	* @return
	*/
	//抽象メソッド
	//
    int readTactics();
}
/**
* インターフェースを継承したランダムに手を出す戦略クラス.
*/
class RandomTactics implements Tactics{
	//変数定義
	int hand;
	//ランダムにジャンケンの手を返却する戦略のメソッド
	//インターフェースを引き継いでいるのでpublic,static,abstractなメソッド
	public int readTactics(){
		//ランダム数値を作成　　
		hand = new java.util.Random().nextInt(3) + 1;
		//戻り値を設定
		return hand;
	}
}

/**
* インターフェースを継承した常にグーを出す戦略クラス.
*/
class CrazyTactics implements Tactics{
	//グーのみを出す戦略のメソッド
	//インターフェースを引き継いでいるのでpublic,static,abstractなメソッド
	public int readTactics(){
		//handに１（グー）を用意
		//hand = 1;
		//常にグーを出す処理
		return 1;
		//hand_type = GUU;
	}

}

