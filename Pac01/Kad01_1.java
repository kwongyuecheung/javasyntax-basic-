//**********************************
// 課題名 : Kad01_1
// クラス : SE1A
// 作成者 : Kwong Yue Cheungコウユウショウ
// 作成日 : 2020/09/29
//**********************************
class Kad01_1 {
 public static void main(String[] args) {
 	final int ARANK = 90;
	final int BRANK = 80;
	final int CRANK = 70;
	final int DRANK = 60;
	for(int i = 0; i <= 100; i += 10){
		if(i < DRANK){
			System.out.println(i + "点：F ランク");
		}else if(i < CRANK){
			System.out.println(i + "点：D ランク");
		}else if(i < BRANK){
			System.out.println(i + "点：C ランク");
		}else if(i < ARANK){
			System.out.println(i + "点：B ランク");
		}else{
		System.out.println(i + "点：A ランク");
		}
	}
 }
}