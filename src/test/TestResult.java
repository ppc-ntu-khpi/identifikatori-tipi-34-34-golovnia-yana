package test;

import domain.Exercise;

public class TestResult {

    public static void main(String[] args) {
    	Integer number = 10900;
    	String[] convert = Exercise.Calculate(number);
    	System.out.println("����� " + number +  " � ����� �������� ��������:"
    			+ "\n�������: " + convert[0]
    			+ "\n³������: " + convert[1]
    			+ "\nس������������: " + convert[2]);
    }
}
