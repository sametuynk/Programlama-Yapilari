package com.example.programlamayapilari;

import java.util.Scanner;

public class ElseIfDortIslem {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Hesap Seçiniz");
        System.out.println("(1) Toplama");
        System.out.println("(2) Çıkartma");
        System.out.println("(3) Bölme");
        System.out.println("(4) Çarpma");

        int tercih=scanner.nextInt();

        System.out.print("Birinci sayıyı giriniz:");
        double birinciSayi=scanner.nextInt();

        System.out.print("İkinci sayıyı giriniz:");
        double ikinciSayi=scanner.nextInt();

        if (tercih==1){
            System.out.println("Toplama :"+(birinciSayi+ikinciSayi));
        } else if (tercih==2) {
            System.out.println("Çıkartma :"+(birinciSayi-ikinciSayi));
        } else if (tercih==3) {
            if (ikinciSayi>0){
                System.out.println("Bölme :"+(birinciSayi/ikinciSayi));
            }else {
                System.out.println("Bölme işleminde payda 0 olamaz işlem gerçekleştirilemedi.");
            }
        } else if (tercih==4) {
                System.out.println("Çarpma :"+(birinciSayi*ikinciSayi));
        }else {
            System.out.println("Yanlış tercih yaptınız lütfen doğru tercih yapınız.");
        }

    }
}
