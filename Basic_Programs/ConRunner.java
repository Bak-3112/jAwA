class ConRunner
{
	public static void main(String[] args)
	{
		String Mobilecurrency="100";
		byte currencyvalue=Byte.parseByte(Mobilecurrency);
		System.out.println("Currency in mobile="+currencyvalue+"rs");
		
		String Mobileprice="10000";
		short Mobilepricevalue=Short.parseShort(Mobileprice);
		System.out.println("Price of mobile="+Mobilepricevalue+"rs");

		String QuantityofPetrol="5";
		int petrolvalue=Integer.parseInt(QuantityofPetrol);
		System.out.println("Quantity of petrol="+petrolvalue+"Litres");
		
		String Surname="B";
		char surnamevalue=Surname.charAt(0);
		System.out.println("Surname is="+surnamevalue);
		
		String Phonenumber="9886698080";
		long pnvalue=Long.parseLong(Phonenumber);
		System.out.println("My contact number="+pnvalue);
		
		String Petrolprice="106.17";
		float PPvalue=Float.parseFloat(Petrolprice);
		System.out.println("Price of pertol in INDIA="+PPvalue+"rs");
		
		String goldrate="47470.00";
		double goldratevalue=Double.parseDouble(goldrate);
		System.out.println("Gold rate for today="+goldratevalue+"rs");
		
		String ignition="OFF";
		boolean bvalue=Boolean.parseBoolean(ignition);
		System.out.println("Bike Ignition="+bvalue);

	}
}