package Car;

public class ThisMethod {
	int x;
	public ThisMethod(int x)
	{
		this.x=x;
		 
		
	}
	public static void main(String[] args) {
		ThisMethod n1=new ThisMethod(21);
		System.out.println( n1.x);
		System.out.println("ThisMethod.main()");
	}

}
