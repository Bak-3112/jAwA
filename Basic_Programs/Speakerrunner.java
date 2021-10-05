class Speakerrunner
{
	public static void main(String[] args)
	{
		System.out.println("Invoked msg");
		System.out.println("--------------------------------");
		int level=0;
		String spk=Speaker.volume(level);
		System.out.println(spk);	
	}
}