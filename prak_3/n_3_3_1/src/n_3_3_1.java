package zadanie_3_3_1.prak_3;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class n_3_3_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number = 123.4567;

        Locale locFR = new Locale("fr");
        Locale.setDefault(Locale.CHINA);

        NumberFormat numberFormat1 = NumberFormat.getInstance();
        System.out.println("Число в текущей локали: " + numberFormat1.format(number));

        NumberFormat numberFormat2 = NumberFormat.getInstance(Locale.US);
        System.out.println("Число в китайской локали: " + numberFormat2.format(number));

        NumberFormat numberFormat3 = NumberFormat.getCurrencyInstance();
        System.out.println("Денежная единица в текущей локали: " + numberFormat3.format(number));

        NumberFormat numberFormat4 = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        System.out.println("Денежная единица во французской локали: " + numberFormat4.format(number));

        NumberFormat numberFormat5 = NumberFormat.getPercentInstance();

        System.out.println("Процент в текущей локали: " + numberFormat5.format(number));

        NumberFormat numberFormat6 = NumberFormat.getPercentInstance(locFR);
        System.out.println("Процент во французской локали: " + numberFormat6.format(number));
        double wer = 122.67;
        NumberFormat numberFormat7 = NumberFormat.getCurrencyInstance(Locale.ENGLISH);
        System.out.println(numberFormat7.format(wer));
    }
}