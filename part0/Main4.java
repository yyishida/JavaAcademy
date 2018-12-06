/** 

* 入力した数字を計算するプログラム 

* @author yu-ishida 

*/ 

 

// 文字入力に必要なパッケージをインポートする 

// このようにパッケージを宣言すると他にも色々な追加機能が使えるようになります 

// ここでの*は「java.io」以下にあるすべてのパッケージを対象としています 

import java.io.*; 

 

 

/** 

* クラス名 Main4 

* 計算を行うクラス 

*/ 

public class Main4 { 

 

/** 

* mainメソッド 

* 値を入力して計算するメソッド 

* @param args コマンドライン引数 

*/ 

public static void main(String[] args) throws Exception { 

// throws Exceptionは入力する時に数字以外を入れたらエラーを返すという意味です。 

 

// 文字入力の準備を行う 

InputStreamReader input = new InputStreamReader(System.in); 

BufferedReader br = new BufferedReader(input); 

 

// ↑のこの2行で文字入力の準備は整いました！ 

 

System.out.println("文字を入力してください"); 

 

// 入力を待つ 

String str = br.readLine(); 

 

System.out.println("数字を入力してください"); 

 

// 入力を待つ 

String number = br.readLine(); 

 

// 文字列をint型に変換する 

// String型なのでこのままだと計算できないため、int型へ変換する 

// 変数宣言と文字入力を同時に行う場合はこのように書くことも出来ます！ 

int i = Integer.parseInt(number); 

 

System.out.println(str); 

System.out.println(i + 10); 

} 

} 