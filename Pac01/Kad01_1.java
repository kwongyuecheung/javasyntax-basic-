//**********************************
// �ۑ薼 : Kad01_1
// �N���X : SE1A
// �쐬�� : Kwong Yue Cheung�R�E���E�V���E
// �쐬�� : 2020/09/29
//**********************************
class Kad01_1 {
 public static void main(String[] args) {
 	final int ARANK = 90;
	final int BRANK = 80;
	final int CRANK = 70;
	final int DRANK = 60;
	for(int i = 0; i <= 100; i += 10){
		if(i < DRANK){
			System.out.println(i + "�_�FF �����N");
		}else if(i < CRANK){
			System.out.println(i + "�_�FD �����N");
		}else if(i < BRANK){
			System.out.println(i + "�_�FC �����N");
		}else if(i < ARANK){
			System.out.println(i + "�_�FB �����N");
		}else{
		System.out.println(i + "�_�FA �����N");
		}
	}
 }
}