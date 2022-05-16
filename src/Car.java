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
    	 
    	 System.out.println("������� �����:");
         brand=in.nextLine();
         
         System.out.println("������� ����:");
         color=in.nextLine();
         
         System.out.println("������� �������� ����:");
         number=in.nextLine();
         
         try
         {
        	 System.out.println("������� ���-�� ����������:");
             passengers=in.nextInt();
             
             if (passengers>7 || passengers<=0) throw new Exception();
         }
         catch (Exception e) {
        	 System.err.println("������: � ������ �� ����� ���� ������ 7�� ����! ������ ����������� �������� 5 ����");
        	 passengers = 5;
         }
         
         try {
        	 System.out.println("������� ���-�� ������� � ������:");
             gasoline=in.nextFloat();
             if(gasoline<0) throw new Exception();
         }
         catch (Exception e) {
        	System.err.println("������: �������� ������� �� ����� ���� ������ ����! ������ ����������� �������� 0 �����");
        	gasoline = 0;
         }
         
         try {
        	 System.out.println("������� ������ � ������:");
             mileage=in.nextFloat();
             if (mileage < 0) throw new Exception();
         }
         catch (Exception e){
        	System.err.println("������: �������� ������� �� ����� ���� ������ ����! ������ ����������� �������� 0 ������");
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
    		System.err.println("������: � ������ �� ����� ���� ������ 7�� ����! ������ ����������� �������� 5 ����");
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
			System.err.println("������: �������� ������� �� ����� ���� ������ ����! ������ ����������� �������� 0 �����");
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
		System.err.println("������: �������� ������� �� ����� ���� ������ ����! ������ ����������� �������� 0 ������");
		//mileage = 0;
	}	
	this.mileage = mileage;
}
}
