package main;

public class OfflineExercises {

//	 Given a string, return a string where
//	 for every char in the original string,
//	 there are three chars.

	// multChar("The") returns "TTThhheee"
	// multChar("AAbb") returns "AAAAAAbbbbbb"
	// multChar("Hi-There") returns "HHHiii---TTThhheeerrreee"

//	 str.substring(i, i + 1) + str.substring(i, i + 1);

	public String multChar(String input) {

		String result = "";
		for (int i = 0; i < input.length(); i++) {
//			char c = input.charAt(i);
//			result += c + c; - tries this method and do not understand why it does not work??
//			System.out.println(c); 

			result += input.substring(i, i + 1) + input.substring(i, i + 1) + input.substring(i, i + 1);
			String result2 = null;
			result2 = result;

		}

		return result;
	}

	// Return the string (backwards) that is between the first and last appearance
	// of "bert"
	// in the given string, or return the empty string "" if there is not 2
	// occurances of "bert" - Ignore Case

	// getBert("bertclivebert") returns "evilc"
	// getBert("xxbertfridgebertyy") returns "egdirf"
	// getBert("xxBertfridgebERtyy") returns "egdirf"
	// getBert("xxbertyy") returns ""
	// getBert("xxbeRTyy") returns ""

	public String getBert(String input) {

		return "";
	}

	// Given three ints, a b c, one of them is small, one is medium and one is
	// large. Return true if the three values are evenly spaced, so the
	// difference between small and medium is the same as the difference between
	// medium and large. Do not assume the ints will come to you in a reasonable
	// order.

	// evenlySpaced(2, 4, 6) returns true
	// evenlySpaced(4, 6, 2) returns true
	// evenlySpaced(4, 6, 3) returns false
	// evenlySpaced(4, 60, 9) returns false

	public boolean evenlySpaced(int a, int b, int c) {

//		int[] num_array = {a, b, c};
//		Arrays.sort(num_array);
//		
//		return false;

		return (a - b == b - c) || (a - c == c - b) || (a - b == c - a);

	}

	// Given a string and an int n, return a string that removes n letters from the
	// 'middle' of the string.
	// The string length will be at least n, and be odd when the length of the input
	// is odd.

	// nMid("Hello", 3) returns "Ho"
	// nMid("Chocolate", 3) returns "Choate"
	// nMid("Chocolate", 1) returns "Choclate"

	public String nMid(String input, int a) {

		return "";
	}

	// Given a string, return true if it ends in "dev". Ignore Case

	// endsDev("ihatedev") returns true
	// endsDev("wehateDev") returns true
	// endsDev("everoyonehatesdevforreal") returns false
	// endsDev("devisnotcool") returns false

	public boolean endsDev(String input) {

		String substr = input.substring(input.length() - 3);

		System.out.println(substr);

		if (substr == "dev" || substr == "Dev") {
			return true;
		} else {
			return false;
		}

	}

	// Given a string, return the length of the largest "block" in the string.
	// A block is a run of adjacent chars that are the same.
	//
	// superBlock("hoopplla") returns 2
	// superBlock("abbCCCddDDDeeEEE") returns 3
	// superBlock("") returns 0

	public int superBlock(String input) {
		return -1;

	}

	// given a string - return the number of times "am" appears in the String
	// ignoring case -
	// BUT ONLY WHEN the word "am" appears without being followed or proceeded by
	// other letters
	//
	// amISearch("Am I in Amsterdam") returns 1
	// amISearch("I am in Amsterdam am I?") returns 2
	// amISearch("I have been in Amsterdam") returns 0

	public int amISearch(String arg1) {

		String[] search = arg1.split(" ");

		int counter = 0;

		for (int i = 0; i < search.length; i++) {

			if (search[i] == "am" || search[i] == "Am") {
				counter += 1;
			}

			int counter2 = counter;

		}

		return counter;

	}

	// DONE
	// given a number
	// if this number is divisible by 3 return "fizz"
	// if this number is divisible by 5 return "buzz"
	// if this number is divisible by both 3 and 5return "fizzbuzz"
	//
	// fizzBuzz(3) returns "fizz"
	// fizzBuzz(10) returns "buzz"
	// fizzBuzz(15) returns "fizzbuzz"

	public String fizzBuzz(int arg1) {

		if (arg1 % 3 == 0 && arg1 % 5 == 0) {
			return "fizzbuzz";
		} else if (arg1 % 3 == 0) {
			return "fizz";
		} else if (arg1 % 5 == 0) {
			return "buzz";
		} else {
			return "you lose";
		}

	}

	// Given a string split the string into the individual numbers present
	// then add each digit of each number to get a final value for each number
	// String example = "55 72 86"
	//
	// "55" will = the integer 10
	// "72" will = the integer 9
	// "86" will = the integer 14
	//
	// You then need to return the highest vale
	//
	// largest("55 72 86") returns 14
	// largest("15 72 80 164") returns 11
	// largest("555 72 86 45 10") returns 15

	public int largest(String arg1) {

//		

		String[] arg2 = arg1.split(" ");

		for (int i = 0; i < arg2.length; i++) {

			int number = Integer.parseInt(arg2[i]);
			int first_digit = number / 10;
			int second_digit = number % 10;
			int value = first_digit + second_digit;
			System.out.println(value);

		}

		return 0;

	}

}
