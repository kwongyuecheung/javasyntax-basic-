//**********************************
// 課題名 : Kad01_3
// クラス : SE1A
// 作成者 : Kwong Yue Cheungコウユウショウ
// 作成日 : 2020/09/29
//**********************************
import java.util.*;
class Kad01_3 {
 public static void main(String[] args) {
 	//問題配列
	final String[] QUIZ = {"ループを抜ける文は？","配列の長さを取得する文は？","例外処理の構文は try-何？"};
	//選択肢配列
	final String[][] CHOICE = {{"continue", "return", "break"},{".length", ".height", ".count"},{"get", "catch", "exception"}};
	//各問題の解答番号
	final int[] ANSWER = {3,1,2};
	int count = 0;
	int i = 0;
	int j;
	Scanner sc = new Scanner(System.in);
	System.out.println("Java クイズ！\n\n");
	while(true){
		try{
			while(i <= 2){
				System.out.println("第"+ (i + 1) +"問：" + QUIZ[i]);
				for (j = 0; j <= 2 ; j++){
					System.out.println(j + 1 + ":" + CHOICE[i][j]  );
				}
				int k = sc.nextInt();
				if(k == ANSWER[i]){
					System.out.println("正解！\n");
					i++;
					count++;
				}else if(k <= 0 || k >= 4){
					System.out.println("その選択肢は存在しません。\n");
				}else{
					System.out.println("不正解！答えは"+ ANSWER[i] + "です。\n");
					i++;
				}
			}	
			System.out.println("終了！"+ i + "問中、" + count +  "問正解でした。");
			break;
		}catch(InputMismatchException e){
			System.out.println("入力値が不正です。\n");
			sc.next();
		}
	}
	
 }
}