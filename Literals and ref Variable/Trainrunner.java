class Trainrunner
{
	public static void main(String[] args)
	{
		Train train=new Train();
		
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		
		System.out.println(train.trainspeed);
		System.out.println(train.trainname);
		System.out.println(train.trainnumber);
		System.out.println(train.numberofcoaches);
		System.out.println(train.traindrivername);
		
		train.trainnumber=12050;
		train.numberofcoaches=12;
		train.traindrivername="Pankaj Garg and Sudesh Kumar";

		System.out.println("#############################");
		
		System.out.println(train.trainspeed);
		System.out.println(train.trainname);
		System.out.println(train.trainnumber);
		System.out.println(train.numberofcoaches);
		System.out.println(train.traindrivername);
	}
}
	