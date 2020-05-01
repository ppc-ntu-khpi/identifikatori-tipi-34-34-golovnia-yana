package domain;
/**
 * The class that calculates
 * @author Asus
 *
 */

public class Exercise {
	/**
	 * Calculates values in different numerals
	 * @param number
	 * @return String
	 */
    public static String[] Calculate(int number){
        return new String[] {
        		/**
        		 * Binary number system
        		 */
        		Integer.toBinaryString(number),
        		/**
        		 * Octal number system
        		 */
        		Integer.toOctalString(number),
        		/**
        		 * Hexadecimal number system
        		 */
        		Integer.toHexString(number).toUpperCase()
        };
    }
}
