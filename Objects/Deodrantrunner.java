class Deodrantrunner
{
	public static void main(String[] args)
	{	
		Deodrant deodrant=new Deodrant();
		
		String brand="Brut";
		int price=290;
		int quantity=1;
		String color="Green";
		
		String dbrand=deodrant.brand;
		int dp=deodrant.price;
		int dquan=deodrant.quantity;
		String dcolor=deodrant.color;
		
		System.out.println("******************************");	
		System.out.println(brand);
		System.out.println(price);
		System.out.println(quantity);
		System.out.println(color);
		
		System.out.println("******************************");
		System.out.println(dbrand);
		System.out.println(dp);
		System.out.println(dquan);
		System.out.println(dcolor);
	}
}
	