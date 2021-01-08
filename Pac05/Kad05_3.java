//**********************************
// 課題名 : Kad05_3
// クラス : SE1A
// 作成者 : Kwong Yue Cheungコウユウショウ
// 作成日 : 2020/10/08
//**********************************
import java.util.*;
public class Kad05_3{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		Account ac = new Account("ECC", "qwe123");
		System.out.println("*** 初回認証 ***");
		while(true){
			System.out.println("初期ユーザー名を入力してください：");
			String n1 = sc.next();
			System.out.println("初期パスワードを入力してください：");
			String p1 = sc.next();
			if(ac.certify(n1,p1) == true){
				System.out.println("認証成功");
				break;
			}else{
				System.out.println("認証失敗\n");
			}
		}
		System.out.println("\n*** アカウント登録 ***");
		System.out.print("新しいユーザー名を入力してください：");
		ac.setName(sc.next());
		System.out.print("新しいいパスワードを入力してください：");
		ac.setPass(sc.next());
		System.out.println("*** 再認証 ***");
		while(true){
			System.out.println("ユーザー名を入力してください：");
			String n1 = sc.next();
			System.out.println("パスワードを入力してください：");
			String p1 = sc.next();
			if(ac.certify(n1,p1) == true){
				System.out.println("認証成功");
				break;
			}else{
				System.out.println("認証失敗\n");
			}
		}
	}
}