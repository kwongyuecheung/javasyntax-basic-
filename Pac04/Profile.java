//**********************************
// 課題名 : Profile
// クラス : SE1A
// 作成者 : Kwong Yue Cheungコウユウショウ
// 作成日 : 2020/10/06
//**********************************
class Profile{
	String name;
	int age;
	String from;
	String job;
	
	
	public Profile(String name, int age, String from){
		this();
		this.name = name;
		this.age = age;
		this.from = from;
	}
	public Profile(){
		job = "スポーツ選手";
	}
	void show(){
		System.out.println("氏名：" + name);
		System.out.println("年齢：" + age);
		System.out.println("出身：" + from);
		System.out.println("職業：" + job + "\n");
	}
}