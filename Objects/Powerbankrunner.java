class Powerbankrunner
{
	public static void main(String[] args)
	{	
		Powerbank powerbank=new Powerbank();
		
		String company="1+";
		int price=999;
		int capacity=10000;
		
		String pcompany=powerbank.company;
		int pprice=powerbank.price;
		int pcapacity=powerbank.capacity;
		
		
		System.out.println("******************************");
		System.out.println(company);
		System.out.println(price);
		System.out.println(capacity);
		
		System.out.println("******************************");
		System.out.println(pcompany);
		System.out.println(pprice);
		System.out.println(pcapacity);
	}
}
	