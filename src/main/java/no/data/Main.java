package no.data;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double celsius = scanner.nextDouble();
        System.out.println(UnitConverter.convertCelsiusToFahrenheit(celsius));
    }
}