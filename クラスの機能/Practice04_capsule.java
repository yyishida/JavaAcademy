/**
* クラス変数・クラスメソッド
* @author yu-ishida
*/

/**
* Practice_capsuleクラス
*/
class Practice04_capsule{
	/**
	* mainメソッド
	* @param args コマンドライン引数
    * privateDataに200をセットし画面に出力するメソッド
    */
    public static void main(String[] args){

    	//インスタンス化
    	CapsuleationPractice capsule = new CapsuleationPractice();

    	capsule.setPrivateData(200);

    	int numbers = capsule.getPrivateData();

    	System.out.println("CapsulationData:"+numbers);
    }

}

/**
* CapsuleationPracticeクラス
*/
class CapsuleationPractice{

	private int privateData = 100;
	/**
	* getPrivateDataメソッド
	* privateDataを返却するメソッド
	* @return privateData
	*/
	public int getPrivateData(){
		return privateData;
	}
	/**
	* setPrivateDataメソッド
	* privateDataに値をセットするメソッド
	* @param number メインメソッドで設定されたPrivateDataが値
	*/
	public void setPrivateData(int number){
		privateData = number;
	}
}