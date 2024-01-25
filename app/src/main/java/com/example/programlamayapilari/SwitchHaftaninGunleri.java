package com.example.programlamayapilari;

import java.util.Scanner;

public class SwitchHaftaninGunleri {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("HAFTANIN GÜNLERİ " +
                "\n(1)Pazartesi" +
                "\n(2)Salı" +
                "\n(3)Çarşamba" +
                "\n(4)Perşambe" +
                "\n(5)Cuma" +
                "\n(6)Cumartesi" +
                "\n(7)Pazar");

        System.out.print("Bir gün seçiniz:");

        int gun=scanner.nextInt();
        switch (gun){
            case 1 : System.out.println("Bugün Pazatesi, yapmanız gereken sorumluluklar:" +
                    "\n(1) 4 Saat ders Çalışılacak" +
                    "\n(2) 30 Dakika kitap okunacak" +
                    "\n(3) 100 Soru çözülecek");
            break;
            case 2 : System.out.println("Bugün Salı, yapmanız gereken sorumluluklar:" +
                    "\n(1) 4 Saat ders Çalışılacak" +
                    "\n(2) 30 Dakika kitap okunacak" +
                    "\n(3) 100 Soru çözülecek");
            break;
            case 3 : System.out.println("Bugün Çarşamba, yapmanız gereken sorumluluklar:" +
                    "\n(1) 4 Saat ders Çalışılacak" +
                    "\n(2) 30 Dakika kitap okunacak" +
                    "\n(3) 200 Soru çözülecek");
            break;
            case 4 : System.out.println("Bugün Perşembe, yapmanız gereken sorumluluklar:" +
                    "\n(1) 4 Saat ders Çalışılacak" +
                    "\n(2) 30 Dakika kitap okunacak" +
                    "\n(3) 100 Soru çözülecek");
            break;
            case 5 : System.out.println("Bugün Cuma, yapmanız gereken sorumluluklar:" +
                    "\n(1) 4 Saat ders Çalışılacak" +
                    "\n(2) 30 Dakika kitap okunacak" +
                    "\n(3) 300 Soru çözülecek");
            break;
            case 6 : System.out.println("Bugün Cumartesi,yapmanız gereken sorumluluklar:" +
                    "\n(1) 6 Saat ders Çalışılacak" +
                    "\n(2) 60 Dakika kitap okunacak" +
                    "\n(3) 90 Dakika spor yapılacak" +
                    "\n(4) 200 Soru çözülecek");
            break;
            case 7 : System.out.println("Bugün Pazar, yapmanız gereken sorumluluklar:" +
                    "\n(1) 6 Saat ders Çalışılacak" +
                    "\n(2) 60 Dakika kitap okunacak" +
                    "\n(3) 90 Dakika spor yapılacak" +
                    "\n(4) 200 Soru çözülecek");
            break;
            default:
                System.out.println("Yalnış gün seçtiniz!");
        }
    }
}
