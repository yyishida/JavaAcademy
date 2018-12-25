package seattle;

  class SeattleEmployee {

   	/**
    * 社員氏名
    */
    	private String empName;

   	/**
	    * 社員氏名を取得する
	    * @return empName
	    */
    	public String getEmpName() {
        return empName;

    	}

   	/**
    * 社員氏名をセットする
    * @param empName
    */
    	public void setEmpName(String empName) {
       		this.empName = empName;
    	}
      /**
      * 所属部署を取得する
      */
      public String getDept(){
        return "無所属";
      }
  }

  class SeattleSSEmployee extends SeattleEmployee{

  /**
  * getDeptメソッドをオーバーライドするメソッド
  */
  @Override
  public String getDept(){
    return "TemeTech推進室";
  }


}
/**
* Practice02_overrideクラス
* インスタンスを作成し社員名をセットするクラス
*/
public class Practice02_override{
  /**
  * mainメソッド
  * @param args コマンドライン引数
  * インスタンスを作成し社員名をセットするメソッド
  */
  public static void main(String[] args){

    //インスタンス化
    SeattleEmployee pepper = new SeattleEmployee();

    SeattleSSEmployee ishida = new SeattleSSEmployee();

    pepper.setEmpName("Pepper");

    ishida.setEmpName("石田　友");

    System.out.println("社員氏名:"+ishida.getEmpName());

    System.out.println("所属部署:"+ishida.getDept());

    System.out.println("社員氏名:"+pepper.getEmpName());

    System.out.println("所属部署:"+pepper.getDept());



  }
}