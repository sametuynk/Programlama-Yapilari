package com.example.programlamayapilari;

import java.util.Scanner;

public class IfAlanHesaplama {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Alan Hesabına Hoş Geldiniz");
        System.out.println("(1) Dikdörtgen Alan Hesapla");
        System.out.println("(2) Çember Alan Hesapla");
        
        int tercih=scanner.nextInt();
        
        if (tercih==1){
            System.out.println("Dikdörtgenin kısa kenarını giriniz:");
            double kisaKenar=scanner.nextDouble();
            System.out.println("Dikdörtgenin uzun kenarını giriniz:");
            double uzunKenar=scanner.nextDouble();
            double alan= kisaKenar * uzunKenar;
            System.out.println("Dikdörtgenin Alanı: "+alan);

        } else if (tercih==2) {
            double PI=3.14;
            System.out.println("Çemberin yarıçapını giriniz:");
            double yariCap=scanner.nextDouble();
            double alan=PI*(yariCap*yariCap);
            System.out.println("Çemberin Alanı: "+alan);

        }else{
            System.out.println("Doğru seçim yapınız:");
        }
    }
}
