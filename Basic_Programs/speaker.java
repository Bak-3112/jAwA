class Speaker
{
	public static String volume(int level)
	{
		if(level<=0)
		{
			System.out.println("On it first");
		}
		else if(level<=3)
		{
			System.out.println("OK");
		}
		else if(level>3)
		{
			System.out.println("Loud");
		}
		else if(level>5)
		{
			System.out.println("too loud");
		}
		else(level>9)
		{
			System.out.println("call police");
		}
		return this;
	}
}