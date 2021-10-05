class Ornament
{
	public static String name(String[] item)
	{
		System.out.println("Invoked items");
		
		for(int index=2;index<item.length;index++)
		{
			System.out.println("Last item="+index);
			return item[index-1];
		}
		return "NA";
	}
}
		

