class Strtodt
{
	public static void main(String[] args)
	{
		String chewinggum="1";
		byte chewinggumvalue=Byte.parseByte(chewinggum);
		System.out.println("Chewinggum price is ="+chewinggumvalue+ "Rupee");
		
		String Deoprice="300";
		short Deopricevalue=Short.parseShort(Deoprice);
		System.out.println("Deodrant price is="+Deopricevalue+ "Rs");
			
		String Speedlimit="60";
		int SLvalue=Integer.parseInt(Speedlimit);
		System.out.println("Speedlimit for bike in this road is="+SLvalue+"KMPH");
		
		String gender="M";
		char sex=gender.charAt(0);
		System.out.println("Gender of person="+sex);
		
		String Bikespeedometerreading="23519";
		long bsmvalue=Long.parseLong(Bikespeedometerreading);
		System.out.println("My Bike Reading="+bsmvalue+"Kms");
		
		String PFdeduction="1600.00";
		float Pfvalue=Float.parseFloat(PFdeduction);
		System.out.println("PF deduction="+Pfvalue+"rs");
		
		String NIFTY50="17661.95";
		double NIFTY50value=Double.parseDouble(NIFTY50);
		System.out.println("NIFTY Value="+NIFTY50value);
		
		String Switch="True";
		boolean svalue=Boolean.parseBoolean(Switch);
		System.out.println("Fan switch="+svalue);
			
	}
}