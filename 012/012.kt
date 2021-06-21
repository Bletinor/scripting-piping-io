fun main(args: Array<String>)
{
	var input = readLine()!!.toString()
	var inputValues = mutableListOf(0)

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

		inputValues.add(Integer.parseInt(input))

		try
		{
			input = readLine()!!.toString()
		}
		catch(e: Exception)
		{
			break
		}
	}
	println(inputValues.sum())
}