//**********************************
// 課題名 : Kad03_3
// クラス : SE1A
// 作成者 : Kwong Yue Cheungコウユウショウ
// 作成日 : 2020/10/01
//**********************************
import java.util.*;
class Kad03_3{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		Bank bank = new Bank();
		int s;
		System.out.println("*** ECC 銀行 ***");
		while(true){
			System.out.println("\n\n--- MENU ---");
			System.out.print("1:預入れ\n2:引出し\n3:終了\n");
			try{
				s = sc.nextInt();
				if(s == 1){
					System.out.print("何円預入れますか？：");
					bank.deposite(sc.nextInt());
				}else if(s == 2){
					System.out.print("何円引出しますか？：");
					bank.drawer(sc.nextInt());
				}else if(s < 1 || s > 3){
					System.out.println("その番号は存在しません。\n");
				}else{
					break;
				}
			}catch(InputMismatchException e){
				System.out.println("入力値が不正です。\n");
				sc.next();
			}
		}
		System.out.println("終了します。");
	}
}