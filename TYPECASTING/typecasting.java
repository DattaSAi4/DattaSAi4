package TYPECASTING;

public class typecasting {
	public static void main(String[] args)
	{
		//widening---converting from small data type to large
		int a =10 ;
		System.out.println("The integer value is :"+a);
		long b =a;
		System.out.println("implicitconversion int to long"+b);
		float c =a;
		System.out.println("implicitconversion int to float"+c);
		double d =a;
		System.out.println("implicitconversion int to double"+d);
		//narrowing opposite of widening
		byte e =(byte)a;
		System.out.println("explicitconversion int to byte"+e);
		
		
	}

}
