//**********************************
// Ûè¼ : Kad04_3
// NX : SE1A
// ì¬Ò : Kwong Yue CheungREEVE
// ì¬ú : 2020/10/06
//**********************************
public class Kad04_3{
	public static void main(String[]args){
		System.out.println("*** vtB[ *** \n");
		String[] name = {"éØêN","{c\C","kNî"};
		int [] age = {46,33,37};
		String [] from = {"¤m§","åã{","s"};
		for(int i = 0; i < 3; i++){
			Profile profile = new Profile(name[i], age[i], from[i]);
			profile.show();
		}
	}
}