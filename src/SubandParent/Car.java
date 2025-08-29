package SubandParent;

public class Car extends Vechicle {
	private String modelName="Mustang";
	public static void main(String[] args) {
		Car mycar=new Car();
		mycar.honk();
		System.out.println(mycar.brand+"  "+mycar.modelName);
	}

}
