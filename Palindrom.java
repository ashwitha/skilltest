public class Palindrom
{
	int product=0;
	int upperlimit,lowerlimit;
	public Palindrom(int upperlimit,int lowerlimit)
	{
		this.upperlimit=upperlimit;
		this.lowerlimit=lowerlimit;
	}
	public int findlargestpalindrom()
	{
		int tempproduct=0;
		for(int i=upperlimit;i>lowerlimit;i--)
		{
			for(int j=upperlimit;j>lowerlimit;j--)
			{
				product=j*i;
				if(itisapalindrome(product))
				{
					product = j*i;
					if(tempproduct<product)
					{
						tempproduct=product;
					}
				}
			}
		}
		return tempproduct;
	}
	public boolean itisapalindrome(int product)
	{

		String s=Integer.toString(product);
		StringBuffer s1=new StringBuffer(s);
		String s2=(s1.reverse()).toString();
		if(s.equals(s2))
		{
			return true;
		}

		return false;
	}
	
	
}







