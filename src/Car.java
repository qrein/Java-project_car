import java.util.Scanner;

public class Car 
{
	
	private String brand;
	private String color;
	private String number;
	private int passengers;
	private float gasoline;
	private float mileage;
	
    
      
    Car()
    {
    	 Scanner in = new Scanner(System.in);
    	 
    	 System.out.println("Введите бренд:");
         brand=in.nextLine();
         
         System.out.println("Введите цвет:");
         color=in.nextLine();
         
         System.out.println("Введите номерной знак:");
         number=in.nextLine();
         
         try
         {
        	 System.out.println("Введите кол-во пассижиров:");
             passengers=in.nextInt();
             
             if (passengers>7 || passengers<=0) throw new Exception();
         }
         catch (Exception e) {
        	 System.err.println("Ошибка: в машине не может быть больше 7ми мест! Задано стандартное значение 5 мест");
        	 passengers = 5;
         }
         
         try {
        	 System.out.println("Введите кол-во бензина в литрах:");
             gasoline=in.nextFloat();
             if(gasoline<0) throw new Exception();
         }
         catch (Exception e) {
        	System.err.println("Ошибка: значение бензина не может быть меньше нуля! Задано стандартное значение 0 литра");
        	gasoline = 0;
         }
         
         try {
        	 System.out.println("Введите пробег в метрах:");
             mileage=in.nextFloat();
             if (mileage < 0) throw new Exception();
         }
         catch (Exception e){
        	System.err.println("Ошибка: значение пробега не может быть меньше нуля! Задано стандартное значение 0 метров");
 			mileage = 0;
         }   
         //mileage=mileage/1000; 
         in.close();
    }
    
    public String getBrand()
    {
        return brand;
    }
    
    public void setBrand(String brand){
        this.brand = brand;
    }

    public String getColor()
    {
        return color;
    }
    
    public void setColor(String color){
        this.color = color;
    }
    
    public String getNumber()
    {
        return number;
    }
    
    public void setNumber(String number){
       	this.number = number;
    }

    public int getPassengers()
	{
		 return passengers;
	}
    
    public void setPassengers(int passengers){
    	try {
    		if (passengers > 7 || passengers <=0) throw new Exception();
    	}
    	catch (Exception e) {
    		System.err.println("Ошибка: в машине не может быть больше 7ми мест! Задано стандартное значение 5 мест");
    		//passengers = 5;
	}	 
      	this.passengers = passengers;
    }
    
    
    public double getGasoline()
    {
        return gasoline;
    }
    
    public void setGasoline(float gasoline){
    	try {
    		if (gasoline < 0) throw new Exception();
		}
		catch (Exception e) {
			System.err.println("Ошибка: значение бензина не может быть меньше нуля! Задано стандартное значение 0 литра");
			//gasoline = 0;
		}
     	this.gasoline = gasoline;
    }


public double getMileage()
{
    return mileage;
}

public void setMileage(float mileage)
{
	try {
		if (mileage <= 0 ||this.mileage >mileage) throw new Exception();
	}
	catch (Exception e) 
	{
		System.err.println("Ошибка: значение пробега не может быть меньше нуля! Задано стандартное значение 0 метров");
		//mileage = 0;
	}	
	this.mileage = mileage;
}
}
