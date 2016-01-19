package com.sethspace.training;

/**
 * Given a (decimal - e.g. 3.72) number that is passed in as a string, print the
 * binary representation. If the number can not be represented accurately in
 * binary, print “ERROR”
 * 
 * The value returned is an unsigned representation of a numbers. So the negative numbers
 * are not converted to 2's complement
 * 
 * @author Anirudh
 *
 */

public class ConvertToBinary {

	private static String binaryRepresentation = "";

	public static String convert(double n) {

		// Get the non-decimal part
		int nonDecimal = n > 0 ? (int) Math.floor(n) : (int) (Math.floor(n) + 1);

		// Get the decimal part
		double decimal = n > 0 ? (n - nonDecimal) : ((-1) * (n - nonDecimal));

		// Convert nonDecimal part
		int remainder = 0;
		do{
			remainder = nonDecimal % 2;
			binaryRepresentation = remainder + binaryRepresentation;
			nonDecimal /= 2;
		}while (nonDecimal!=0);

		// Convert decimal part

		binaryRepresentation += ".";

		while (decimal != 0) {

			if (binaryRepresentation.length() > 31) {
				return "ERROR";
			}

			decimal *= 2;
			if (decimal >=  1) {
				binaryRepresentation += "1";
				decimal -= 1;
			} else {
				binaryRepresentation += "0";
			}
		}

		return binaryRepresentation;

	}

}
