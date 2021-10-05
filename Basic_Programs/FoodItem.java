class FoodItem
{
	public static String menu(String[] item)
	{
		System.out.println("Invoked items");
		int size=item.length;
		for(int index=1;index<size;index++)
		{
			System.out.println("First item");
			return item[index];
		}
		return "NA";
	}
}
		

