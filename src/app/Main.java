package app;

public class Main {
    public static void main(String[] args) {
        System.out.println("Converter App - Version 1.0");

        double fahrenheit = 98.6;
        double celsius = convertFahrenheitToCelsius(fahrenheit);
        System.out.println(fahrenheit + "°F is " + celsius + "°C");

        double celsiusValue = 37;
        double fahrenheitConverted = convertCelsiusToFahrenheit(celsiusValue);
        System.out.println(celsiusValue + "°C is " + fahrenheitConverted + "°F");
    }

    private static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    private static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
}
