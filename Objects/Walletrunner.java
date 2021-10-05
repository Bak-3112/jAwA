class Walletrunner
{
	public static void main(String[] args)
	{	
		Wallet wallet=new Wallet();
		
		int price=599;
		String color="ANTIQUE BROWN";
		String countrymade="INDIA";
		
		int wprice=wallet.price;
		String wcolor=wallet.color;
		String wcountrtymade=wallet.countrymade;		
		
		System.out.println("******************************");
		System.out.println(price);
		System.out.println(color);
		System.out.println(countrymade);
		
		System.out.println("******************************");
		System.out.println(wprice);
		System.out.println(wcolor);
		System.out.println(wcountrtymade);
	}
}
	