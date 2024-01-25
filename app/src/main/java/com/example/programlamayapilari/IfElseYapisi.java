package com.example.programlamayapilari;

public class IfElseYapisi {
    public static void main(String[] args) {
        int yas=17;
        String name="Mehmet";

        if (yas>18){
            System.out.println("Reşit");
        }else {
            System.out.println("Reşit değil.");
        }

        if (name.equals("Ahmet")){
            System.out.println("Merhaba Ahmet :)");
        }else{
            System.out.println("Adım Ahmet değil.");
        }


        int sifre =1234;
        String kullaniciAdi="admin";

        if (sifre==1234&& kullaniciAdi.equals("admin")){
            System.out.println("Giriş başarılı :)");
        }else{
            System.out.println("Giriş başarısız :(");
        }

    }
}
