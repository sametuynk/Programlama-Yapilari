package com.example.programlamayapilari;

import java.util.Scanner;

public class DizilerConsole {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Dizi uzunluğunu giriniz:");
        int uzunluk=scanner.nextInt();
        int sayi[]=new int[uzunluk];

        for (int i = 0; i < uzunluk; i++) {
            System.out.print((i+1)+".Sayıyı giriniz: \n");
            int gir=scanner.nextInt();
            sayi[i]=gir;
        }

        for (int i = 0; i < uzunluk; i++) {
            System.out.print(sayi[i]+" ");
        }
    }
}
