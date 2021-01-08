//**********************************
// 課題名 : Kad05_2
// クラス : SE1A
// 作成者 : Kwong Yue Cheungコウユウショウ
// 作成日 : 2020/10/08
//**********************************
import java.util.*;
public class Kad05_2{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		Account ac = new Account("ECC", "qwe123");
		System.out.println("初期ユーザー名：" + ac.getName());
		System.out.println("初期パスワード：" + ac.getPass());
		System.out.println("\n*** アカウント登録 ***");
		System.out.print("新しいユーザー名を入力してください：");
		ac.setName(sc.next());
		System.out.print("新しいいパスワードを入力してください：");
		ac.setPass(sc.next());
		System.out.println("\n*** アカウント登録 ***");
		System.out.println("ユーザー名：" + ac.getName());
		System.out.println("パスワード：" + ac.getPass() + "\n");
	}
}