package week_01;

import java.util.Scanner;

public class Answers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Yazmak istediğin kelimeyi tuşla");
        String metin = scan.nextLine();
        char firstCase = metin.charAt(0);
        char lastCase = metin.charAt(metin.length()-1);
        Scanner scan2 = new Scanner(System.in);
        System.out.println("Kaç tekrar :))");
        int tekrar = scan2.nextInt();
        String oku = (""+firstCase+lastCase).repeat(tekrar);
        System.out.println("oku = " + oku);
        //Cevap 3
        Scanner input = new Scanner(System.in);
        System.out.println("Birleşik kelimeye örnek veriniz");
        String space = input.nextLine();
        boolean isSpaced = space.contains(" ");
        System.out.println(isSpaced);
        //Cevap 4
        Scanner input2 = new Scanner(System.in);
        System.out.println("Ad ve Soyadınızı giriniz");
        String isim = input2.nextLine();
        String i1 = isim.split(" ")[0];
        String i2 = isim.split(" ")[1];
        System.out.println(i1 + "\n"+i2);
        //Cevap 5
        Scanner input3 = new Scanner(System.in);
        System.out.println("Ön adınız ile adınız ve soyadınız:");
        String i3 = input3.nextLine();
        char first = i3.split(" ")[0].charAt(0);
        char second = i3.split(" ")[1].charAt(0);
        char third = i3.split(" ")[2].charAt(0);
        System.out.println(first+"."+second+"."+third+".");
        //Versiyon 2 çalışmaları
        //Version 3
        //version
        //Git hub değişiklikleri









    }
}
