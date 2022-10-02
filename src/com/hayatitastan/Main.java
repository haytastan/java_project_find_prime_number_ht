package com.hayatitastan;

/**
 * Created by Dr. Hayati TAŞTAN on 2.10.2022
 */
public class Main {
    public static void main(String[] args) {

        int number = 11; // Bu sayı asal mı? Asal Sayı : Sadece kendisine ve 1'e bölünen sayı
        int remainder;

        boolean isPrime = true; //başlangıçta sayı asal değil diyelim

        if (number<1){
            System.out.println(number + " GEÇERSİZDİR. SAYI SIFIRDAN BÜYÜK OLMALI.");
            return; //Terminate Java Virtual Maschine (JVM)
        }

        if (number==1){
            System.out.println(number + " ASAL SAYIDIR.");
            return;
        }

        for(int i = 2; i<number; i++) {
            remainder = number % i; //number, başka sayıya bölününce kalan değer
            if (remainder==0) {
                isPrime =false;
            }
        }

        if (isPrime){
            System.out.println(number + " ASAL SAYIDIR.");
        }else{
            System.out.println(number + " ASAL SAYI DEĞİLDİR.");
        }


    }
}
