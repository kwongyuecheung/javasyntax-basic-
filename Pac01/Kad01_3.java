//**********************************
// �ۑ薼 : Kad01_3
// �N���X : SE1A
// �쐬�� : Kwong Yue Cheung�R�E���E�V���E
// �쐬�� : 2020/09/29
//**********************************
import java.util.*;
class Kad01_3 {
 public static void main(String[] args) {
 	//���z��
	final String[] QUIZ = {"���[�v�𔲂��镶�́H","�z��̒������擾���镶�́H","��O�����̍\���� try-���H"};
	//�I�����z��
	final String[][] CHOICE = {{"continue", "return", "break"},{".length", ".height", ".count"},{"get", "catch", "exception"}};
	//�e���̉𓚔ԍ�
	final int[] ANSWER = {3,1,2};
	int count = 0;
	int i = 0;
	int j;
	Scanner sc = new Scanner(System.in);
	System.out.println("Java �N�C�Y�I\n\n");
	while(true){
		try{
			while(i <= 2){
				System.out.println("��"+ (i + 1) +"��F" + QUIZ[i]);
				for (j = 0; j <= 2 ; j++){
					System.out.println(j + 1 + ":" + CHOICE[i][j]  );
				}
				int k = sc.nextInt();
				if(k == ANSWER[i]){
					System.out.println("�����I\n");
					i++;
					count++;
				}else if(k <= 0 || k >= 4){
					System.out.println("���̑I�����͑��݂��܂���B\n");
				}else{
					System.out.println("�s�����I������"+ ANSWER[i] + "�ł��B\n");
					i++;
				}
			}	
			System.out.println("�I���I"+ i + "�⒆�A" + count +  "�␳���ł����B");
			break;
		}catch(InputMismatchException e){
			System.out.println("���͒l���s���ł��B\n");
			sc.next();
		}
	}
	
 }
}