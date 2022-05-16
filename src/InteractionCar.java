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
		System.out.println("\nНазвание Машины: " + "«" + myCar.getBrand() 
		+ "»" + "\nЦвет Машины: " + "«" + myCar.getColor() + "»" 
		+ "\nНомер Машины: " + "«" + myCar.getNumber() + "»" 
		+ "\nКол-во мест в машине: " + "«" + myCar.getPassengers() + " мест(a)" + "»" 
	    + "\nБензина осталось: " + "«" + myCar.getGasoline() + " литров" 
		+ "»" + "\nПробег: " + "«" + myCar.getMileage()/1000 + " км" + "»");
	}
}
