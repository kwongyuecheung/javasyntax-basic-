//**********************************
// 課題名 : Bank
// クラス : SE1A
// 作成者 : Kwong Yue Cheungコウユウショウ
// 作成日 : 2020/10/01
//**********************************
class Bank{
	int balance = 1000;
	
	void showBalance(){
		System.out.println("残高:" + balance + "円");
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
			System.out.println("残高が足りません。");
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