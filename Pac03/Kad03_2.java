//**********************************
// 課題名 : Kad03_2
// クラス : SE1A
// 作成者 : Kwong Yue Cheungコウユウショウ
// 作成日 : 2020/10/01
//**********************************
import java.util.*;
class Kad03_2{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		Bank bank = new Bank();
		System.out.println("*** ECC 銀行 ***");
		System.out.print("何円預入れますか？：");
		try{
			bank.deposite(sc.nextInt());
			System.out.print("何円引出しますか？：");
			bank.drawer(sc.nextInt());
			}catch(InputMismatchException e){
				System.out.println("入力値が不正です。\n");
				sc.next();
			}
	}
}