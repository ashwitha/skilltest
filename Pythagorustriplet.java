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
