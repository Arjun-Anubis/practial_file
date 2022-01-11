class escapeSequence 
{
	private static final String Escape = "\033[";
	private static final String Black = Escape + "30m";
	private static final String Red = Escape + "31m";
	private static final String Green = Escape + "32m";
	private static final String Brown = Escape + "33m";
	private static final String Blue = Escape + "34m";
	private static final String Magenta = Escape + "35m";
	private static final String Cyan = Escape + "36m";
	private static final String White = Escape + "37m";

	private static final String Clear = Escape + "00m";

	private static final String Bold = Escape + "01m";
	private static final String Italic = Escape + "03m";
	private static final String UnderLine = Escape + "04m";
	private static final String Blink = Escape + "05m";
	private static final String Encircled = Escape + "51m";

	public static void main (String [] args)
	{
		System.out.println( "8 bit: " );
		System.out.printf( "%s White %s Red %s Green %s Brown %s Blue %s Magenta %s Cyan %s Black %s\n", White, Red, Green, Brown, Blue, Magenta, Cyan, Black,  Clear );
		System.out.printf( "%s%s White %s Red %s Green %s Brown %s Blue %s Magenta %s Cyan %s Black %s\n", UnderLine, White, Red, Green, Brown, Blue, Magenta, Cyan, Black,  Clear );
		System.out.printf( "%s%s White %s Red %s Green %s Brown %s Blue %s Magenta %s Cyan %s Black %s\n", Bold, White, Red, Green, Brown, Blue, Magenta, Cyan, Black,  Clear );
		System.out.printf( "%s%s White %s Red %s Green %s Brown %s Blue %s Magenta %s Cyan %s Black %s\n", Italic, White, Red, Green, Brown, Blue, Magenta, Cyan, Black,  Clear );
		System.out.printf( "%s%s White %s Red %s Green %s Brown %s Blue %s Magenta %s Cyan %s Black %s\n", Blink, White, Red, Green, Brown, Blue, Magenta, Cyan, Black,  Clear );
		System.out.printf( "%s%s White %s Red %s Green %s Brown %s Blue %s Magenta %s Cyan %s Black %s\n", Encircled, White, Red, Green, Brown, Blue, Magenta, Cyan, Black,  Clear );

	}
}
