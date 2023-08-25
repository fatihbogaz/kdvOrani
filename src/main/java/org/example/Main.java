package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double price = getPrice();
        double taxRate = calculateTax(price);
        double priceWithTax = applyTax(price, taxRate);
        displayResult(price, priceWithTax, taxRate);
    }

    /**
     * KDV hesaplama metodu.
     * @param price Ana parayı temsil eder.
     * @return KDV miktarını döner.
     */

    public static double calculateTax(double price) {
        return ((price > 0) && (price < 1000)) ? 0.18 : 0.08;
    }

    public static void displayResult(double price, double priceWithTax, double taxRate) {
        System.out.println("KDV'siz fiyat:" + price);
        System.out.println("KDV'li fiyat:" + priceWithTax);
        System.out.println("KDV oranı:" + taxRate);
    }

    public static double applyTax(double inputValue, double taxRate) {
        double kdv = inputValue * taxRate;
        return inputValue + kdv;
    }

    public static double getPrice() {
        Scanner scannerObject = new Scanner(System.in);
        System.out.print("ürünün fiyatını giriniz.");

        return scannerObject.nextDouble();
    }

}