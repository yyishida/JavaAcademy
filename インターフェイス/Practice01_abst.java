/**
* インターフェース-抽象クラス
* @author yu-ishida
*/

/**
* Faceクラス
* 抽象クラスを持つクラス
*/
abstract class Face{
	/**
	* noseメソッド
	* 抽象メソッド
	*/
	abstract void nose();
}

class Face2 extends Face{
	/**
	* noseメソッドをオーバーライドするメソッド
	*/
	@Override
	public void nose(){

		System.out.println("鼻を取ります。");
	}
}

/**
* Practice01_abstractクラス
* noseメソッドを実行するためのクラス
*/
public class Practice01_abst{
	/**
	* mainメソッド
	* noseメソッドを実行するメソッド
	* @param args コマンドライン引数
	*/
	public static void main(String[] args){
		//インスタンス化
		Face2 action = new Face2();

		action.nose();

	}

}