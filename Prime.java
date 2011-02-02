public class Prime
{ 
	public int methodtofindprime()
	{
		long numberOfPrimes = 0;
		int number=0;
		for(int i =2;i<100000000; i++)
		{
			if(isPrime(i))
			{
				System.out.println(i);
				numberOfPrimes++;
			}
			if(numberOfPrimes ==1001)
			{
				number=i;
				break;
			}
		}
		
		return number;
		
	}

	public static boolean isPrime(int N)
	{
		if (N <= 1) return false;
		else return Prim(N,N-1);
	}
	public static boolean Prim(int X,int Y)
	{
		if (Y == 1) return true;
		else if (X % Y == 0) return false;
		else return Prim(X,Y-1);
	} 
	public static void main(String args[])
	{
		Prime p=new Prime();
		int num=p.methodtofindprime();
	}
}



