class Fishrunner
{
	public static void main(String[] args)
	{
		Fish fish=new Fish();
		
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		
		System.out.println(fish.color);
		System.out.println(fish.price);
		System.out.println(fish.size);
		System.out.println(fish.name);
		System.out.println(fish.weight);
		
		fish.name="Gold fish";
		fish.price=525;
		fish.weight=59.0f;

		System.out.println("#############################");
		
		System.out.println(fish.color);
		System.out.println(fish.price);
		System.out.println(fish.size);
		System.out.println(fish.name);
		System.out.println(fish.weight);
	}
}