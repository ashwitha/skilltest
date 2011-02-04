QUESTION:    A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
a2 + b2 = c2
For example, 32 + 42 = 9 + 16 = 25 = 52.
There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.



public class Pythagorustriplet
{
	public int toFindPythagorusTriplet(int sumofnum)
	{
		int squareofa=0;
		int squareofb=0;
		int squareofc=0;
		int productOfNumbers=0;
		for(int a=1;a<1000;a++)
		{
			for(int b=1;b<1000;b++)
			{
				for(int c=1;c<1000;c++)
				{
					squareofa=a*a;
					squareofb=b*b;
					squareofc=c*c;
					int sum=a+b+c;
					if((squareofb+squareofa ==squareofc)&&(sum==sumofnum))
					{
						productOfNumbers = a * b * c;
					}
				}

			}
		}
		return productOfNumbers;
	}

}
