 abstract class Bank {
	   abstract int money();

}
class Hdfc extends Bank{
	int money() {
		return 5;}
	}
class Cbse extends Bank{
	int money()
	{return 4;}
}

class TestBank{    
public static void main(String args[]){    
Bank g =new Hdfc();  
 
System.out.println("Rate of Interest is: "+g.money()+" %");    
Bank h =new Cbse();
System.out.println("Rate of Interest is: "+h.money()+" %");    
}}    

