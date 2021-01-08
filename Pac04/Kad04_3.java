//**********************************
// 課題名 : Kad04_3
// クラス : SE1A
// 作成者 : Kwong Yue Cheungコウユウショウ
// 作成日 : 2020/10/06
//**********************************
public class Kad04_3{
	public static void main(String[]args){
		System.out.println("*** プロフィール *** \n");
		String[] name = {"鈴木一朗","本田圭佑","北島康介"};
		int [] age = {46,33,37};
		String [] from = {"愛知県","大阪府","東京都"};
		for(int i = 0; i < 3; i++){
			Profile profile = new Profile(name[i], age[i], from[i]);
			profile.show();
		}
	}
}