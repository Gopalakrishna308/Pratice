package Car;

public class Method_overload {
	static int evenNumber(int n)
	{int n2 = 0;
		if(n%2==0)
			
		{  
			n2=n;
		}
		return n2;
		 
	}
		 

	public static void main(String[] args) {
		System.out.println( evenNumber(22));
		
	}
}