/**
* クラス変数・クラスメソッド
* @author yu-ishida
*/

/**
* Employee2クラス
* Employeeクラスを書き換えるクラス
* 社員の人数を格納するクラス変数、社員の人数を出力するクラスメソッドを追加するクラス
*/

class Employee2{
	//インスタンス変数
	String name;

	//クラス変数
	static int numbers;
    /**
    * namesメソッド
    * 名前を標準出力するメソッド
    */
    public void names(){
        System.out.println("私はシアトルコンサルティングの社員です。名前は"+this.name+"です。");
    }
    /**
    * numberメソッド
    * 社員の人数を出力するクラスメソッド
    */
    public static void number(){
    	System.out.println("社員は全部で"+numbers+"人です");
    }

    //コンストラクタ
    public Employee2(){
        this.name = "匿名希望";
        numbers++;
    }
    public Employee2(String x){
        this.name = x;
        if(10<x.length()){
            String s = name.substring(0,9);
        }
        numbers++;
    }

}
/**
* Practice_classクラス
* Employee2クラスを2つのコンストラクタによりそれぞれインスタンス化し、インスタンス毎に名前を出力するメソッドを呼び出すクラス
* 社員人数を表示するクラス
*/
public class Practice03_class{
    /**
    * mainメソッド
    * @param args コマンドライン引数
    *インスタンス毎に名前を出力するメソッド
    */
    public static void main(String[] args){
        //インスタンス生成
        Employee2 noname = new Employee2();

        Employee2 nams = new Employee2("pepper");

        noname.names();

        nams.names();

        Employee2.number();
    }
}