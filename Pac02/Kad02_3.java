//**********************************
// �ۑ薼 : Kad02_3
// �N���X : SE1A
// �쐬�� : Kwong Yue Cheung�R�E���E�V���E
// �쐬�� : 2020/10/01
//**********************************
class Kad02_3{
	public static void main(String[]args){
		final String[] TYPS = {"�y������", "�X�|�[�c�J�["};
		final double[] GASS = {25.0, 70.0};
		final int[] SPEEDS = {100, 300};
		
		Car lightCar = new Car();
		Car sportsCar = new Car();
		
		Car[] cars = {lightCar, sportsCar};
		for(int i = 0; i < cars.length; i++){
			cars[i].type = TYPS[i];
			cars[i].gasoline = GASS[i];
			cars[i].maxSpeed = SPEEDS[i];
		}
		for(Car a :cars){
			System.out.println("���ށF" + a.type);
			System.out.println("�K�\����(L)�F" + a.gasoline);
			System.out.println("�ō����x(km)�F" + a.maxSpeed);
		}
	}
}