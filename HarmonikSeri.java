
package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


    Scanner scanner=new Scanner(System.in);
        System.out.print(" lütfen bir sayý giriniz : ");
        int n=scanner.nextInt();
        double result = 0.0;


        for (int i=1; i<=n; i++){
            result +=(1.0/i);

        }
        System.out.println("Girilen Sayýnýn Harmonik Serileri Toplamý =  " + result);
    }
}
