//**********************************
// �ۑ薼 : Kad03_3
// �N���X : SE1A
// �쐬�� : Kwong Yue Cheung�R�E���E�V���E
// �쐬�� : 2020/10/01
//**********************************
import java.util.*;
class Kad03_3{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		Bank bank = new Bank();
		int s;
		System.out.println("*** ECC ��s ***");
		while(true){
			System.out.println("\n\n--- MENU ---");
			System.out.print("1:�a����\n2:���o��\n3:�I��\n");
			try{
				s = sc.nextInt();
				if(s == 1){
					System.out.print("���~�a����܂����H�F");
					bank.deposite(sc.nextInt());
				}else if(s == 2){
					System.out.print("���~���o���܂����H�F");
					bank.drawer(sc.nextInt());
				}else if(s < 1 || s > 3){
					System.out.println("���̔ԍ��͑��݂��܂���B\n");
				}else{
					break;
				}
			}catch(InputMismatchException e){
				System.out.println("���͒l���s���ł��B\n");
				sc.next();
			}
		}
		System.out.println("�I�����܂��B");
	}
}