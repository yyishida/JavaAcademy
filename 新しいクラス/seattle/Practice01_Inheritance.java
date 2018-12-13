package seattle;

public class SeattleEmployee {

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

public class SeattleSSEmployee extends SeattleEmployee{

}