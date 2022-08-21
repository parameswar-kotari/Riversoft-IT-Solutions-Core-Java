 package Amar;

public class Pointer {
	 float x1,x2,y1,y2;
	 public Pointer()
	 {
		 //default constructor
	 }
	 public Pointer(int x1,int x2,int y1,int y2)
	 {
		 //Parameterised constructor
		 this.x1=x1;
		 this.x2=x2;
		 this.y1=y1;
		 this.y2=y2;
	 }
	 static float distance=0;
	 public void distance()
	 {
		 float x=(this.x2-this.x1)*(this.x2-this.x1);
		 float y=(this.y2-this.y1)*(this.y2-this.y1);
			distance=(float) Math.sqrt(x+y);
			System.out.printf("Distance = %.2f",distance);
	 }
	 
}
