import junit.framework.Assert;
import junit.framework.TestCase;


public class testproblem10 extends TestCase 
{
		public void testShouldChecktherequiredPrimeNumber()
		{
			assertEquals(104743, new Problem10().sumOfAllPrime(2000000));
		}
}


