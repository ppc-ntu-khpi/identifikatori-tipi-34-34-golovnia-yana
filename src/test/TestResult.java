package test;

import domain.Exercise;

public class TestResult {

    public static void main(String[] args) {
    	Integer number = 10900;
    	String[] convert = Exercise.Calculate(number);
    	System.out.println("Число " + number +  " в інших системах числення:"
    			+ "\nДвійкова: " + convert[0]
    			+ "\nВісімкова: " + convert[1]
    			+ "\nШістнадцяткова: " + convert[2]);
    }
}
