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
    * @param num 数値の0が引数
    */

    public void sameName(int num){
        System.out.println("int型の引き数を１つもつsameNameメソッドです。引き数:"+num);
    }
    /**
    *int型の引き数を２つ持つsameNameメソッド
    * @param nums
    * @param nums2
    */
    public void sameName(int nums,int nums2){
    	System.out.println("int型の引き数を２つ持つsameNameメソッドです。引き数:"+nums+","+nums2);
    }
    /**
    *String型の引数を1つ保持するsameNameメソッド
    *@param character
    */
    public void sameName(String character){
        System.out.println("String型の引き数を１つ持つsameNameメソッドです。引数:"+character);
    }
    /**
    *String型の引数を1つ保持するsameNameメソッド
    *@param characters
    *@param characters2
    */
    public void sameName(String characters,String characters2){
    	System.out.println("String型の２つ持つsameNameメソッドです。引数:"+characters+","+characters2);
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

		sameName datas=new sameName();

		datas.sameName();
        datas.sameName(0);
        datas.sameName(0,1);
        datas.sameName("str1");
        datas.sameName("str1","str2");

    }
}