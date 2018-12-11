/**
* オーバーロード基礎
* @author yu-ishida
*/



/**
* sameNameクラス
* 5つのインスタンスメソッドを作るクラス
*/
 class sameName{


	 // 引き数を保持しないsameNameメソッド
	public void sameName(){
        System.out.println("引き数を保持しないsameNameメソッドです");
    }
    /**
    * int型の引数を１つ持つsameNameメソッド
    * @param name
    */

    public void sameName(int n){
        System.out.println("int型の引き数を１つもつsameNameメソッドです。引き数:"+n);
    }
    /**
    *int型の引き数を２つ持つsameNameメソッド
    * @param a
    * @param b
    */
    public void sameName(int a,int b){
    	System.out.println("int型の引き数を２つ持つsameNameメソッドです。引き数:"+a+","+b);
    }
    /**
    *String型の引数を1つ保持するsameNameメソッド
    *@param x
    */
    public void sameName(String x){
    	System.out.println("String型の引き数を１つ持つsameNameメソッドです。引数:"+x);
    }
    /**
    *String型の引数を1つ保持するsameNameメソッド
    *@param y
    *@param z
    */
    public void sameName(String y,String z){
    	System.out.println("String型の２つ持つsameNameメソッドです。引数:"+y+","+z);
    }

}
/**
* Nomal0１クラス
* オーバーロードを使い、samNameクラスからインスタンスメソッドを呼び出すクラス
*/
public class Nomal01{
	/**
	* mainメソッド
	* @param args コマンドライン引数
	*/
	public static void main(String[] args){

		sameName aaa=new sameName();

		aaa.sameName();
        aaa.sameName(0);
        aaa.sameName(0,1);
        aaa.sameName("str1");
        aaa.sameName("str1","str2");

}
}