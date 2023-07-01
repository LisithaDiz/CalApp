public class car {
	private String color;
	private String brand;
	private int capasity;
	private int noOfSeates;
	private int noOfWheels;


	public boolean drive(){
		return true;
}

	void setColor(String carColor){
	color=carColor;
}

public static void main (String arg[]){
	Car myCar = new car();
	myCar.SetColor("Red");
}

}