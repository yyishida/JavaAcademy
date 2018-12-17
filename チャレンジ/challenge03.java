/**
* 多次元配列基礎
* @author yu-ishida
*/
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/**
* challenge03クラス
* 多次元配列で格納を行いfor文で出力するクラス.
*/
public class challenge03{

	/**
	* mainメソッド
	*4人の成績を格納する二次元配列を定義し、それぞれの社員の1回目から3回目までの結果を出力するクラス.
	* @param args コマンドライン引数
	*/
	public static void main(String[] args){

		List<Integer> intList1 = new ArrayList<Integer>();




		//宣言と初期化
		int[][] seiseki={{20,50,60,},
                         {30,60,70,},
                         {45,60,80,},
                         {35,40,50,}};
　　　　　
		for(int i = 0; i<seiseki.length; i++){

			for(int j = 0; j<seiseki[i].length; j++){

				System.out.println("社員"+(i+1)+"の"+(j+1)+"回目の点数は"+seiseki[i][j]+"です。");

			}

		}

        int average = 0;
		for(int i = 0; i<seiseki.length; i++){

			for(int j = 0; j<seiseki[i].length; j++){
				average += seiseki[i][j];


			}

		average /= 3;
        System.out.println("社員" + (i+1) + "平均点は"+average);

        intList1.add(average);


        average = 0;

		}
		int i = 1;
        for(int a : intList1){
			if(a<60){
				System.out.println("社員"+i+"はもう少し勉強しましょう。");


		    }i++;


		}

	}

}


