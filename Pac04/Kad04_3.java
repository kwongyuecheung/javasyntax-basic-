//**********************************
// �ۑ薼 : Kad04_3
// �N���X : SE1A
// �쐬�� : Kwong Yue Cheung�R�E���E�V���E
// �쐬�� : 2020/10/06
//**********************************
public class Kad04_3{
	public static void main(String[]args){
		System.out.println("*** �v���t�B�[�� *** \n");
		String[] name = {"��؈�N","�{�c�\�C","�k���N��"};
		int [] age = {46,33,37};
		String [] from = {"���m��","���{","�����s"};
		for(int i = 0; i < 3; i++){
			Profile profile = new Profile(name[i], age[i], from[i]);
			profile.show();
		}
	}
}