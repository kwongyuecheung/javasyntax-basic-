//**********************************
// �ۑ薼 : Kad03_2
// �N���X : SE1A
// �쐬�� : Kwong Yue Cheung�R�E���E�V���E
// �쐬�� : 2020/10/01
//**********************************
import java.util.*;
class Kad03_2{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		Bank bank = new Bank();
		System.out.println("*** ECC ��s ***");
		System.out.print("���~�a����܂����H�F");
		try{
			bank.deposite(sc.nextInt());
			System.out.print("���~���o���܂����H�F");
			bank.drawer(sc.nextInt());
			}catch(InputMismatchException e){
				System.out.println("���͒l���s���ł��B\n");
				sc.next();
			}
	}
}