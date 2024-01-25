package com.example.programlamayapilari;

import java.util.Scanner;

public class TekCiftSonsuzDongu {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);



        while(true){
            System.out.println("Bir sayı giriniz:");
            int sayi=scanner.nextInt();

            int sonuc=sayi % 2;
            switch (sonuc){
                case 0:
                    System.out.println("Girilen sayı ÇİFT sayıdır.");
                    break;
                case 1:
                    System.out.println("Girilen sayı Tek sayıdır.");
                    break;
            }
            System.out.println();
            System.out.println("Çıkmak için (1) Devam etmek için yeni bir sayı değeri giriniz");
            int secim=scanner.nextInt();
            if (secim==1){
                System.out.println("Çıkış yapıldı.");
                break;
            }

        }
    }
}
