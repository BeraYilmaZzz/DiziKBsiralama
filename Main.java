import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int value, arr;
        System.out.print("Dizinizin boyutunu giriniz = ");
        arr=inp.nextInt();

        int [] list = new int [arr]; // kullanıcının gireceği arr boyutu kadar list adında arr boyutlu dizi oluşturduk

        for(int i = 0 ; i < arr ; i++){ // i 0dan başlatarak sorduk, veri girdi bunu 0 ıncı diziye kaydettik , i 1 oldu bidaha sorduk bunuda 2 nci sıraya kaydettik
            System.out.print(i+1 + ".Elemanı giriniz = ");
            value = inp.nextInt();
            list[i] = value;
        }
        Arrays.sort(list); // list dizisini küçükten büyüğe sıraladık
        System.out.print("Sıralama = ");
        for(int i = 0 ; i < arr ; i++){
            System.out.print(list[i] + ",");
        }
    }
}