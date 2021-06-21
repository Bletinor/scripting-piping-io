fun main(args: Array<String>)
{
	var input = readLine()!!.toInt()
	if (input <= 0)
	{
		System.err.println("Invalid input " + input)
	}
	else
	{
		println("Good one " + input)
	}
}