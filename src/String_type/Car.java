package String_type;

import java.util.Arrays;

public class Car {
	public static void main(String[] args) {
		String []s1= {"bmw","volvo","maruthi","tesla"};
		String []s2= {"bmw","volvo","maruthi","tesla"};
		System.out.println(Arrays.compare(s1, s2));
		System.out.println(Arrays.equals(s1, s2));
		Arrays.sort(s1);
		System.out.println( s1);
		System.out.println(Arrays.equals(s1, s2));
		for (String string : s1) {
			System.out.print(string+" ");
			}
		//Arrays.fill("", false);
	}

}
