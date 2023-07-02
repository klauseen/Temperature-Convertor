import java.util.InputMismatchException;
import java.util.Scanner;

public class TemperatureConvertor {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            boolean statement;
            System.out.println("PLease choose the unit of the temperature you measured. Press 1 for Celsius," +
                    "2 for Fahrenheit, 3 for Kelvin");
            int unitForMeasuredTemperature = 0;

            do {
                unitForMeasuredTemperature = scanner.nextInt();
                if ( unitForMeasuredTemperature == 1 || unitForMeasuredTemperature == 2 || unitForMeasuredTemperature == 3){
                    statement = false;
                }else {
                    statement = true;
                    System.out.println("PLease choose the unit of the temperature you measured. Press 1 for Celsius," +
                            " 2 for Fahrenheit, 3 for Kelvin");
                }

            }while(statement);

            System.out.println("Enter the value: ");
            int value = 0;

            do{
                try {
                    statement = false;
                    value = scanner.nextInt();
                }catch (InputMismatchException e) {
                    System.out.println("Please enter a number");
                    statement = true;
                    scanner.next();
                }
            } while(statement);

            if (unitForMeasuredTemperature == 1) {
                System.out.println("To convert in Fahrenheit press 1. To convert in Kelvin press 2. ");
                int unitForConvertedTemperature = 0;

                do {
                    unitForConvertedTemperature = scanner.nextInt();
                    if (unitForConvertedTemperature == 1 || unitForConvertedTemperature == 2) {
                        statement = false;
                    }else {
                        System.out.println( "To convert in Fahrenheit press 1. To convert in Kelvin press 2. " );
                        statement = true;
                    }
                } while(statement);

                if (unitForConvertedTemperature == 1) {
                    double convertedTemperature = (value * 1.8) + 32;
                    System.out.println(convertedTemperature);
                } else if (unitForConvertedTemperature == 2) {
                    double convertedTemperature = value + 273.15;
                    System.out.println(convertedTemperature);
                }
            } else if (unitForMeasuredTemperature == 2) {
                System.out.println("To convert in Celsius press 1 or press 2 to convert in Kelvin");
                int unitForConvertedTemperature = 0;

                do {
                    unitForConvertedTemperature = scanner.nextInt();
                    if (unitForConvertedTemperature == 1 || unitForConvertedTemperature == 2) {
                        statement = false;
                    }else {
                        System.out.println( "To convert in Celsius press 1 or press 2 to convert in Kelvin. " );
                        statement = true;
                    }
                } while(statement);

                if (unitForConvertedTemperature == 1) {
                    double convertedTemperature = (value - 32) * 0.555555556;
                    System.out.println("In Celsius the temperature that you have is: " + convertedTemperature);
                } else if (unitForConvertedTemperature == 2) {
                    double convertedTemperature = (value - 32) * 0.555555556 + 273.15;
                    System.out.println("In Kelvin the temperature that you have is: " + convertedTemperature);
                }
            } else if (unitForMeasuredTemperature == 3) {
                System.out.println("To convert in Celsius press 1 or press 2 to convert in Fahrenheit");
                int unitForConvertedTemperature = 0;

                do {
                    unitForConvertedTemperature = scanner.nextInt();
                    if (unitForConvertedTemperature == 1 || unitForConvertedTemperature == 2) {
                        statement = false;
                    }else {
                        System.out.println( "To convert in Celsius press 1 or press 2 to convert in Kelvin. " );
                        statement = true;
                    }
                } while(statement);

                if (unitForConvertedTemperature == 1) {
                    double convertedTemperature = value - 273.15;
                    System.out.println("In Kelvin the temperature that you have is: " + convertedTemperature);
                } else if (unitForConvertedTemperature == 2) {
                    double convertedTemperature = (value - 273.15) * 1.8 + 32;
                    System.out.println("In Kelvin the temperature that you have is: " + convertedTemperature);
                }
            }
        }
    }

