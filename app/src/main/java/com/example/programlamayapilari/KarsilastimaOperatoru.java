package com.example.programlamayapilari;

public class KarsilastimaOperatoru {

    public static void main(String[] args) {

        int sayi1=60;
        int sayi2=50;
        int sayi3=50;

        System.out.println(sayi1==sayi2);

        System.out.println(sayi1>sayi2);

        System.out.println("sayi 1, sayı 2 eşit değilse True döner --> "+(sayi1 != sayi2)); //sayılar birbirine eşit değilse true döner.

        System.out.println("sayi 2, sayı 3 eşitse False döner --> "+(sayi2 != sayi3)); //sayılar birbirine eşitse false döner.

        System.out.println("'VE'-Sayi 1, sayi 2 ve sayi 3 den büyüktür.--> "+(sayi1>sayi2 && sayi1>sayi3)); // ve her iki şartda sağlanırsa true aksi halde false

        System.out.println("'VEYA-'"+(sayi1<sayi2 || sayi1>sayi3));// en az bir şart sağlanırsa true, her ikiside yanlış ise false döner.
    }
}
