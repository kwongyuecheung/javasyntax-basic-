//**********************************
// �ۑ薼 : Bank
// �N���X : SE1A
// �쐬�� : Kwong Yue Cheung�R�E���E�V���E
// �쐬�� : 2020/10/01
//**********************************
class Bank{
	int balance = 1000;
	
	void showBalance(){
		System.out.println("�c��:" + balance + "�~");
	}
	void deposite(int money){
		balance += money;
		showBalance();
	}
	void drawer(int money){
		boolean check = checkBalance(money);
		if(check == true){
			balance -= money;
			showBalance();
		}else{
			System.out.println("�c��������܂���B");
			showBalance();
		}
	}
	boolean checkBalance(int money){
		if(money > balance){
			return false;
		}else{
			return true;
		}
	}
}