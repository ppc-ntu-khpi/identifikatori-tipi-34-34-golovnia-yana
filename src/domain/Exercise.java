package domain;

public class Exercise {
    public static String[] Calculate(int number){
        return new String[] {
        		Integer.toBinaryString(number),
        		Integer.toOctalString(number),
        		Integer.toHexString(number).toUpperCase()
        };
    }
}
