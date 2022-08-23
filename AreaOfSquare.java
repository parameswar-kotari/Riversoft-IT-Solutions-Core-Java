package aofcir;

public class AreaOfSquare {
	int side;
	public AreaOfSquare() {
		
	}
	public AreaOfSquare(int i) {
		this.side=i;
	}
	public int  calcuate() {
		int area=side*side;
		//System.out.println("area"+area);
		return area;
		
		
	}
	public static void main(String [] args) {
		AreaOfSquare ar=new AreaOfSquare(5);
		int area=ar.calcuate();
		System.out.println("Area=" + area);
	}

}
