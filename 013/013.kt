fun main(args: Array<String>)
{
	var input = readLine()!!.toString()

	while (input != "")
	{
		try
		{
			Integer.parseInt(input)
		}
		catch(e: NumberFormatException)
		{
			System.err.println("Invalid input " + input)
			input = readLine()!!.toString()
			continue
		}

		var inputInt = Integer.parseInt(input)
		var result = inputInt * inputInt
		println(result)
		try
		{
			input = readLine()!!.toString()
		}
		catch(e: Exception)
		{
			break
		}
	}
}