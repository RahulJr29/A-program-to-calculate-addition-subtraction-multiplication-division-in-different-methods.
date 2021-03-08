class X
{
	static int add(int a,int b)
	{
		return a+b;
	}
	static int sub(int a,int b)
	{
		return a-b;
	}
	static int mul(int a,int b)
	{
		return a*b;
	}
	static float div(float a,float b)
	{
		return a/b;
	}
}
class Calculator
{
	public static void main(String args[])
	{
		System.out.println("Addition result is: "+X.add(Integer.parseInt(args[0]),Integer.parseInt(args[1])));
		System.out.println("Subtraction result is: "+X.sub(Integer.parseInt(args[0]),Integer.parseInt(args[1])));
		System.out.println("Multiplication result is: "+X.mul(Integer.parseInt(args[0]),Integer.parseInt(args[1])));
		System.out.println("Division result is: "+X.div(Float.parseFloat(args[0]),Float.parseFloat(args[1])));
	}
}