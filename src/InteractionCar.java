public class InteractionCar 
{
	public static void main(String[] args) {
		Car myCar = new Car();
		printCar(myCar);
		
		 myCar.setPassengers(-5); printCar(myCar); 
		 myCar.setPassengers(23);printCar(myCar); 
		 myCar.setMileage(2000); printCar(myCar);
		 

	}
	public static void printCar(Car myCar) {
		System.out.println("\n�������� ������: " + "�" + myCar.getBrand() 
		+ "�" + "\n���� ������: " + "�" + myCar.getColor() + "�" 
		+ "\n����� ������: " + "�" + myCar.getNumber() + "�" 
		+ "\n���-�� ���� � ������: " + "�" + myCar.getPassengers() + " ����(a)" + "�" 
	    + "\n������� ��������: " + "�" + myCar.getGasoline() + " ������" 
		+ "�" + "\n������: " + "�" + myCar.getMileage()/1000 + " ��" + "�");
	}
}
