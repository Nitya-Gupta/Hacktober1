class Cars{  
float getPriceOfCar(){return 0;}  
}  
class Verna extends Cars{  
float getPriceOfCar(){return 11.5f;}  
}  
class Dezire extends Cars{  
float getPriceOfCar(){return 8.2f;}  
}  
class SUV extends Cars{  
float getPriceOfCar(){return 12.5f;}  
}  
public class Polymorphism{  
	public static void main(String args[]){  
	Cars newcar;  
	newcar=new Verna();  
	System.out.println("Verna price in Lakhs is  "+newcar.getPriceOfCar());  
	newcar=new Dezire ();  
	System.out.println("Dezire price in Lakhs is "+newcar.getPriceOfCar());  
	newcar=new SUV();  
	System.out.println("SUV price in Lakhs is "+newcar.getPriceOfCar());  
}  
}  