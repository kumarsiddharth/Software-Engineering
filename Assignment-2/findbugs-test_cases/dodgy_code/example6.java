/*Check the following error
DMI: Invocation of substring(0), which returns the original value (DMI_USELESS_SUBSTRING)

This code invokes substring(0) on a String, which returns the original value. */
class MainsClass
{
	public statix void main(String args[])
	{
		String name="Sayak Haldar";
		String title=name.substring(0);
	}
}
