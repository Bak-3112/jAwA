class Invertorrunner
{
	public static void main(String[] args)
	{
		Invertor invertor=new Invertor();
		
		System.out.println("*****************************");
		
		System.out.println(invertor.make);
		System.out.println(invertor.price);
		System.out.println(invertor.capacity);
		System.out.println(invertor.color);
		System.out.println(invertor.weight);
		
		invertor.make="Amaron";
		invertor.price=14000.0f;
		invertor.capacity=20.0f;
		invertor.color="Blue";
		invertor.weight=50;

		System.out.println("*****************************");
		
		System.out.println(invertor.make);
		System.out.println(invertor.price);
		System.out.println(invertor.capacity);
		System.out.println(invertor.color);
		System.out.println(invertor.weight);
	}
}