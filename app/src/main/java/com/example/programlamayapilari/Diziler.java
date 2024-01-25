package com.example.programlamayapilari;

import java.util.Arrays;

public class Diziler {

    public static void main(String[] args) {
        int[] plakalar=new int[5];
        plakalar[0]=1;
        plakalar[3]=10;
        plakalar[4]=34;

        System.out.println(Arrays.toString(plakalar));

        String [] meyveler={"elma","armut","vişne","karpuz","portakal"};
        double [] boylar={1.78,1.65,1.86};

        System.out.println(meyveler[3]);
        double boy=boylar[2];

        System.out.println(boy);
        System.out.println(Arrays.toString(meyveler));

        meyveler[1]="şeftali";

        System.out.println(Arrays.toString(meyveler));
        System.out.println();
        //DİZİ && DÖNGÜLER

        String markalar []={"apple","google","monster"};
        for (int i = 0; i < markalar.length; i++) {
            System.out.println(markalar[i]);
        }
        System.out.println();

        int sayilar[]={30,20,52,86,96};
        for (int s:sayilar){
            System.out.println(s);
        }

        //SIRALAMA İŞLEMLERİ

        String islemler[]={"zeynep","ali","ayhan","murat","yeşim"};

        for (String i:islemler){
            System.out.println(i);
        }
        System.out.println();
        Arrays.sort(islemler);

        for (String x:islemler){
            System.out.println(x);
        }
        System.out.println();
        int degerler[]={10,30,60,1,23,43,3};

        for (int d:degerler){
            System.out.print(d+" ");
        }

        Arrays.sort(degerler);

        System.out.println();
        for (int d1:degerler){
            System.out.print(d1+" ");
        }


    }
}
