//**********************************
// �ۑ薼 : Kad05_2
// �N���X : SE1A
// �쐬�� : Kwong Yue Cheung�R�E���E�V���E
// �쐬�� : 2020/10/08
//**********************************
import java.util.*;
public class Kad05_2{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		Account ac = new Account("ECC", "qwe123");
		System.out.println("�������[�U�[���F" + ac.getName());
		System.out.println("�����p�X���[�h�F" + ac.getPass());
		System.out.println("\n*** �A�J�E���g�o�^ ***");
		System.out.print("�V�������[�U�[������͂��Ă��������F");
		ac.setName(sc.next());
		System.out.print("�V�������p�X���[�h����͂��Ă��������F");
		ac.setPass(sc.next());
		System.out.println("\n*** �A�J�E���g�o�^ ***");
		System.out.println("���[�U�[���F" + ac.getName());
		System.out.println("�p�X���[�h�F" + ac.getPass() + "\n");
	}
}