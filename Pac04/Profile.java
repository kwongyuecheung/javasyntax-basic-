//**********************************
// �ۑ薼 : Profile
// �N���X : SE1A
// �쐬�� : Kwong Yue Cheung�R�E���E�V���E
// �쐬�� : 2020/10/06
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
		job = "�X�|�[�c�I��";
	}
	void show(){
		System.out.println("�����F" + name);
		System.out.println("�N��F" + age);
		System.out.println("�o�g�F" + from);
		System.out.println("�E�ƁF" + job + "\n");
	}
}