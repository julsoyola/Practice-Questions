using System;

public class Program
{
	
	public static void Main()
	{
		String input_1 = "All-convoYs-9-be:Alert1.";
		int rotationFactor_1 = 4;
		String expected_1 = "Epp-gsrzsCw-3-fi:Epivx5.";
		String output_1 = rotationalCipher(input_1, rotationFactor_1);
		check(expected_1, output_1);
		String input_2 = "abcdZXYzxy-999.@";
		int rotationFactor_2 = 200;
		String expected_2 = "stuvRPQrpq-999.@";
		String output_2 = rotationalCipher(input_2, rotationFactor_2);
		check(expected_2, output_2);
	}

	private static string rotationalCipher(String input, int rotationFactor)
	{
		// Write your code here
		if (input.Length > 0)
		{
			//char [] origCharArray = new char[input.Length];
			char[] retCharArray = new char[input.Length];
			for (int i = 0; i < input.Length; i++)
			{
				char curChar = input[i];
				if (Char.IsLetter(curChar))
				{ // current Char is alphanumeric
					//System.Globalization.CharUnicodeInfo.GetNumericValue(curChar);
					int tempVal = (int)curChar + rotationFactor % 26;
					if (Char.IsLower(curChar))
					{ // check if the tempVal is greater than the value of 'z'
						if (tempVal > (int)'z')
						{
							tempVal = (int)'a' + (tempVal - (int)'z') - 1;
						}
					}
					else
					{ // upper case check if tempVal is greater than 'Z'
						if (tempVal > (int)'Z')
						{
							tempVal = (int)'A' + (tempVal - (int)'Z') - 1;
						}
					}

					retCharArray[i] = (char)(tempVal);
				}
				else if (Char.IsDigit(curChar))
				{ // current Char is digit
					int tempNum = Int32.Parse(Convert.ToString(curChar));
					tempNum = (tempNum + rotationFactor) % 10;
					retCharArray[i] = tempNum.ToString()[0];
				}
				else
				{
					retCharArray[i] = curChar;
				}
			}

			return string.Concat(retCharArray);
		}

		return "";
	}

	static int test_case_number = 1;
	static void check(String expected, String output)
	{
		bool result = (expected.Equals(output));
		char rightTick = '\u2713';
		char wrongTick = '\u2717';
		if (result)
		{
			Console.WriteLine(rightTick + " Test #" + test_case_number);
		}
		else
		{
			Console.Write(wrongTick + " Test #" + test_case_number + ": Expected ");
			printString(expected);
			Console.Write(" Your output: ");
			printString(output);
			Console.WriteLine();
		}

		test_case_number++;
	}

	static void printString(String str)
	{
		Console.Write("[\"" + str + "\"]");
	}
}
