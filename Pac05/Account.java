//**********************************
// 課題名 : Account
// クラス : SE1A
// 作成者 : Kwong Yue Cheungコウユウショウ
// 作成日 : 2020/10/08
//**********************************
class Account{
	private String name;
	private String pass;
	Account(String name, String pass){
		this.name = name;
		this.pass = pass;
	}
	public String getName(){
		return this.name;
	}
	public String getPass(){
		return this.pass;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setPass(String pass){
		this.pass = pass;
	}
	public boolean certify(String name, String pass){
		if((this.name.compareTo(name)) == 0 && (this.pass.compareTo(pass)) == 0){
			return true;
		}else{
			return false;
		}
	}
}