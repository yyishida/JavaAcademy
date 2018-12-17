 /**
* コンストラクタ基礎
* @author yu-ishida
*/

/**
* Employeeクラス
* 名前を格納する文字列型のインスタンス変数をもつ
* 名前を標準出力するインスタンスメソッドをもつ
* 引数無しのコンストラクタをもつ
* 文字列を引数にもつコンストラクタをもつ
*/
class Employee{

    String name;
    /**
    * namesメソッド
    * 名前を標準出力するメソッド
    */
    public void names(){
        System.out.println("私はシアトルコンサルティングの社員です。名前は" + this.name + "です。");
    }

    //コンストラクタ
    public Employee(){
        this.name = "匿名希望";
    }
    public Employee(String empname){
        if(11 < empname.length()){
            String shortname = empname.substring(0,10);
            this.name = shortname;
        }else{
            this.name = empname;

        }
    }
}

/**
* Practice_constructorクラス
* Employeeクラスを2つのコンストラクタにより
* それぞれインスタンス化し、インスタンス毎に名前を出力するメソッドを呼び出すクラス
*/
public class Practice02_constructor{
    /**
    * mainメソッド
    * @param args コマンドライン引数
    *インスタンス毎に名前を出力するメソッド
    */
    public static void main(String[] args){
        //インスタンス生成
        Employee noname = new Employee();

        Employee nams = new Employee("peper");

        noname.names();

        nams.names();
    }
}