//**********************************
// 課題名 : Kad02_2
// クラス : SE1A
// 作成者 : Kwong Yue Cheungコウユウショウ
// 作成日 : 2020/10/01
//**********************************
class Kad02_2{
	public static void main(String[]args){
		Car bigCar = new Car();
		bigCar.type = "大型自動車";
		bigCar.gasoline = 350.0;
		bigCar.maxSpeed = 60;
		System.out.println("分類：" + bigCar.type);
		System.out.println("ガソリン(L)：" + bigCar.gasoline);
		System.out.println("最高速度(km)：" + bigCar.maxSpeed);
	}
}