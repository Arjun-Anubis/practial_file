import java.lang.Math;
class ifelse 
{
	public static void main (String [] args)
	{
		int count = 0;
		double total = 10000000;
		for	( int i = 0; i < total; i++ ) 
		{
			if ( Math.random() < 0.5 ) 
			{
				count++;
			}
			else 
			{
			}

		}
		System.out.printf( "Results: \nTrue: %d\nFalse: %d\nRatio: %f\n", count, ( int ) (total - count ), count/total );
	}
}
