/**ジャンケンプログラム
* @author yu-ishida
*/

/**
* challenge06クラス
* 多次元配列で格納を行うクラス.
*/
public class challenge06{

	/**
	* mainメソッド
	* プレイヤーを定義し行動を定義するクラス.
	* @param args コマンドライン引数
	*/
	public static void main(String[] args){

		System.out.println("京和さん対pepperさんのジャンケンを開始します。");
		// プレーヤー１
		Player player1 = new Player("京和さん");
		player1.sethand(Judge.PA); //  何を出す？

		// プレーヤー２
		CrazyPlayer player2 = new CrazyPlayer("pepper");
		player2.sethand(Judge.PA); //  何を出す？

		// ジャンケンを行う
		Judge.judgment(player1,player2);

    }

}

/**
* コンストラクタを定義するクラス.
*/
class Player{
	//名前を格納するインスタンス変数
    public String name;

    /**
    * nameに任意の名前をセットするコンストラクタ
    * @param name プレイヤーの名前
    */
    public Player(String name){
        this.name = name;
    }

    //手を格納するインスタンス変数
    public int hand;


    /**
    * 手を設定するインスタンスメソッド.
    * @param handtype 手の種類
    */
    public void sethand(int handtype){
    	hand = handtype;
    }
}
/**
* Playerクラスを継承したクラス.
*/

class CrazyPlayer extends Player{
	public CrazyPlayer(String name){
        super(name);
        //this.name = name;
    }

	public void sethand(int handtype){
		hand = 1;


	}
}

/**
*出力する内容を定義するクラス.
*/
class Judge{

	//定数化
    public static final int GUU = 1;
    public static final int CHOKI = 2;
    public static final int PA = 3;

    /**
    *勝敗判定メソッド.
    *@param player1 プレイヤー１の情報
    *@param player2 プレイヤー2の情報
    */
	public static void judgment(Player player1, Player player2){
		 if(player1.hand == GUU){
			switch(player2.hand){
				case GUU:
			       	System.out.println(player1.name + ":グー");
			       	System.out.println(player2.name + ":グー");
			       	System.out.println("あいこです。");
			    break;
			    case CHOKI:
			    	System.out.println(player1.name + ":グー");
			       	System.out.println(player2.name + ":チョキ");
			       	System.out.println(player1.name + "の勝ちです。");
			    break;
			    case PA:
			    	System.out.println(player1.name + ":グー");
			       	System.out.println(player2.name + ":パー");
			       	System.out.println(player2.name + "の勝ちです。");
		        break;
		    }
		}else if(player1.hand == CHOKI){
			switch(player2.hand){
				case GUU:
			       	System.out.println(player1.name + ":チョキ");
			       	System.out.println(player2.name + ":グー");
			       	System.out.println(player2.name + "の勝ちです。");
			    break;
			    case CHOKI:
			    	System.out.println(player1.name + ":チョキ");
			       	System.out.println(player2.name + ":チョキ");
			       	System.out.println("あいこです。");
			    break;
			    case PA:
			    	System.out.println(player1.name + ":チョキ");
			       	System.out.println(player2.name + ":パー");
			       	System.out.println(player1.name + "の勝ちです。");
		        break;
		    }
		}else if(player1.hand == PA){
			switch(player2.hand){
				case GUU:
			       	System.out.println(player1.name + ":パー");
			       	System.out.println(player2.name + ":グー");
			       	System.out.println(player1.name + "の勝ちです。");
			    break;
			    case CHOKI:
			    	System.out.println(player1.name + ":パー");
			       	System.out.println(player2.name + ":チョキ");
			       	System.out.println(player2.name + "の勝ちです。");
			    break;
			    case PA:
			    	System.out.println(player1.name + ":パー");
			       	System.out.println(player2.name + ":パー");
			       	System.out.println("あいこです。");
		        break;
		    }
		}
	}
}