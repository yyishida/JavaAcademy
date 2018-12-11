 /**
* コンストラクタ基礎
* @author yu-ishida
*/


/**
* Employeeクラス
*
*/
 class Employee{

    String name;

    public void names(){
        System.out.println("私はシアトルコンサルティングの社員です。名前は"+this.name+"です。");
    }


        //コンストラクタ
        public Employee(){
            this.name="匿名希望";
        }
        public Employee(String x){
            this.name=x;
            if(10<x.length()){
            String s = name.substring(0,9);
    }
}
}

/**
* Nomal02クラス
* クラス
*/
public class Normal02{
    /**
    * mainメソッド
    * @param args コマンドライン引数
    */
    public static void main(String[] args){
        //インスタンス生成
        Employee nnn=new Employee();

        Employee sss=new Employee("pepper");

        nnn.names();

        sss.names();
}
}