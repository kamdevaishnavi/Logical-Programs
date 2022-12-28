package com.bridgelabz.logicalproblems;

public class ConvertTemperature {
        public static void tempCelsiusToFahrenheit() {
            float tempInFahrenheit = 100;
            float tempInCelsius = (tempInFahrenheit - 32) * 5 / 9;
            System.out.println("Temprature in Celsius= " + tempInCelsius);
        }

        public static void tempFahrenheitToCelsius() {
            float tempInCelsius = 80;
            float tempInFahrenheit = tempInCelsius * 9 / 5 + 32;
            System.out.println("Temprature in Fahrenheit = " + tempInFahrenheit);
        }

    public static void main(String[] args) {
        ConvertTemperature.tempCelsiusToFahrenheit();
        ConvertTemperature.tempFahrenheitToCelsius();
    }
}
