public class Difference
{
	public int  methodtofindthedifference(int range)
	{
		int diff=0;
		int sumofnum=0;
		int squareofsum=0;
		int sumofsquares=0;
        
        for(int i=0;i<=range;i++)
        {
        	sumofnum=sumofnum+i;
        	sumofsquares=sumofsquares+i*i;;
        }
        
        squareofsum=sumofnum*sumofnum;
        diff=squareofsum-sumofsquares;
        return diff;
	}
	
}


