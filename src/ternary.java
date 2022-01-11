class ternary 
{
	public static boolean isEven( int x )
	{
		/* This function Returns True if the number is even else False */
		return ( x % 2 == 0 ) ? true : false;
	}

	public static void main (String [] args)
	{
		/* This is a demonstration of the ternary operator in java 
		 It is sometimes called shorthand if 
		 Syntax ( condition ) ? ( statement if true ) : ( statement if false ) */

		for ( int i = 0; i < 100; i++ ) 
		{
			System.out.println( isEven( i ) ? "Cat🐈" : "Dog🐕" );
		}
	}
}
