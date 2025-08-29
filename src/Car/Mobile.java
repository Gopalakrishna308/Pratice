package Car;

public class Mobile {
	int n1=21;

 
public Mobile(int n )
{
	n1*=n;
}
public static void main(String[] args) {
	Mobile m1=new Mobile(31);
	System.out.println(m1.n1);
	
}
}