//**********************************
// �ۑ薼 : Kad05_3
// �N���X : SE1A
// �쐬�� : Kwong Yue Cheung�R�E���E�V���E
// �쐬�� : 2020/10/08
//**********************************
import java.util.*;
public class Kad05_3{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		Account ac = new Account("ECC", "qwe123");
		System.out.println("*** ����F�� ***");
		while(true){
			System.out.println("�������[�U�[������͂��Ă��������F");
			String n1 = sc.next();
			System.out.println("�����p�X���[�h����͂��Ă��������F");
			String p1 = sc.next();
			if(ac.certify(n1,p1) == true){
				System.out.println("�F�ؐ���");
				break;
			}else{
				System.out.println("�F�؎��s\n");
			}
		}
		System.out.println("\n*** �A�J�E���g�o�^ ***");
		System.out.print("�V�������[�U�[������͂��Ă��������F");
		ac.setName(sc.next());
		System.out.print("�V�������p�X���[�h����͂��Ă��������F");
		ac.setPass(sc.next());
		System.out.println("*** �ĔF�� ***");
		while(true){
			System.out.println("���[�U�[������͂��Ă��������F");
			String n1 = sc.next();
			System.out.println("�p�X���[�h����͂��Ă��������F");
			String p1 = sc.next();
			if(ac.certify(n1,p1) == true){
				System.out.println("�F�ؐ���");
				break;
			}else{
				System.out.println("�F�؎��s\n");
			}
		}
	}
}