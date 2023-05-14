package week_01;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner girdi1= new Scanner(System.in);
        System.out.println("Lutfen sifrenizi giriniz:");
        String sifre = girdi1.nextLine();
        Atm myAtm = new Atm();
        System.out.println("Hoşgeldiniz, bakiyeniz= "+myAtm.acilisBakiye);
        Scanner girdi2 = new Scanner(System.in);
        System.out.println("Para yatırmak için 1 i,para çekmek için 2 yi,cikmak icin 3 u tuslayınız");
        int secenek1 = girdi2.nextInt();
        if (secenek1==1){
            Scanner girdi3 = new Scanner(System.in);
            System.out.println("Yatırmak istediğiniz miktarı giriniz: ");
            int yatirilan = girdi3.nextInt();
            myAtm.total1();
            System.out.println(yatirilan + myAtm.acilisBakiye);
        }
        if (secenek1 == 2){
            Scanner girdi4 = new Scanner(System.in);
            System.out.println("Cekmek istediğiniz miktari giriniz: ");
            int cekilen = girdi4.nextInt();
            myAtm.total2();
            System.out.println(myAtm.acilisBakiye-cekilen);
        }
        if (secenek1==3){
            myAtm.son();
        }
    }
}
