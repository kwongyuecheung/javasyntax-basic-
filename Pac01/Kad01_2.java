//**********************************
// 課題名 : Kad01_2
// クラス : SE1A
// 作成者 : Kwong Yue Cheungコウユウショウ
// 作成日 : 2020/09/29
//**********************************
class Kad01_2 {
 public static void main(String[] args) {
 	final int SUM = 1333;
	for (int i = 0; i < 10; i++){
		for(int j = 0; j < 10; j++){
			for (int k = 0; k < 10; k++){
				int a = (i * 100 + j * 10 + k);
				int b = (k * 100 + j * 10 + i);
				if(a + b == SUM){
					System.out.println(a + " + " + b + " = " + SUM );
				}
			}
		}
	}
 }
}