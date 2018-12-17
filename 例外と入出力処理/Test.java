/**
* 例外
* @author yu-ishida
*/

/**
* Testクラス
* コマンドライン引数で入力された数字を処理して返すクラス
*/
public class Test {

    /**
    * mainメソッド
    * コマンドライン引数を受け取り例外処理するメソッド
    * @param args コマンドライン引数
    */
	public static void main(String args[]) {
	 	try{
			int i = Integer.parseInt(args[0]);
			int j = Integer.parseInt(args[1]);

			System.out.println(i/j);

			System.out.println("「正常」");

		}catch(NumberFormatException e){

				System.out.println("「数字を入力してください」");
		}catch(ArrayIndexOutOfBoundsException e){
				System.out.println("「引数は2つ設定してください」");
		}finally{
				System.out.println("「終了」");
		}

	}
}