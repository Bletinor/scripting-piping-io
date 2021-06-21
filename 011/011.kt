fun main(args: Array<String>)
{
	try
	{
		Integer.parseInt(args[0])
	}
	catch(e: Exception)
	{
		System.err.println("Invalid input " + args[0])
	}

	var input = Integer.parseInt(args[0])

	if (input > 0)
	{
		var i: Int = 1
		while (i <= input)
		{
			println(i)
			i++
		}
	}
	else
	{
		System.err.println("Invalid input " + args[0])
	}
}