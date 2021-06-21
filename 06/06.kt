fun main(args: Array<String>)
{
	var param = Integer.parseInt(args[0])
	if (param <= 0)
	{
		System.err.println("Invalid input " + param)
	}
	else
	{
		println("Good one " + param)
	}
}