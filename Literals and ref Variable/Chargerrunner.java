class Chargerrunner
{
	public static void main(String[] args)
	{
		Charger charger=new Charger();
		
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		
		System.out.println(charger.name);
		System.out.println(charger.price);
		System.out.println(charger.numberofwatts);
		System.out.println(charger.chargertype);
		System.out.println(charger.asinnumber);
		
		charger.name="Apple Power Adapter";
		charger.price=1020;
		charger.asinnumber="B09GB7ZBVT";

		System.out.println("#############################");
		
		System.out.println(charger.name);
		System.out.println(charger.price);
		System.out.println(charger.numberofwatts);
		System.out.println(charger.chargertype);
		System.out.println(charger.asinnumber);
	}
}
	