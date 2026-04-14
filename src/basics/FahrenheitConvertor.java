package basics;

import java.util.Scanner;

public class FahrenheitConvertor {
    static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Fahrenheit Convertor!!\n");

        System.out.print("Please Enter Your Fahrenheit: ");
        float fah = input.nextFloat();

        float conCelsius = (fah -32) * 5.0f / 9.0f;

        System.out.print("\n\tYour Fahrenheit Converted Into Celsius: " + conCelsius + "°C");


    }
}
