package seleksikondisi;
import java.util.Scanner;
public class sk3 {
    public static void main(String[] args) {
        int Idarea[]={1,2,3};
        String asal[]={"waru","sidoarjo","porong"};
        double tarif[][]={
            {6000,9000,9000,},
            {9000,14000,14000,},
            {6000,9000,9000,},
            {5500,8500,8500},
            {5500,14000,14000},
            {9000,8500,8500}
        };
        int pintu[][]={
            {1,2},
            {1,3},
            {2,1},
            {2,3},
            {3,1},
            {3,2}
        };
        Scanner scan= new Scanner(System.in);
        System.out.println("1. Waru");
        System.out.println("2. Sidoarjo");
        System.out.println("3. Porong");
        System.out.println("Masukkan ID DAERAH : ");
        int masuk=scan.nextInt();
        System.out.println("Masukkan Tujuan : ");
        int keluar=scan.nextInt();
        System.out.println("1. Sedan, Jip, Pickup");
        System.out.println("2. Truk dengan 2 sumbu roda");
        System.out.println("3. Truk dengan 3 sumbu roda");
        System.out.println("Golongan Kendaraan : ");
        int gol=scan.nextInt();
        
        for (int i=0; i<pintu.length; i++){
            if((pintu[i][0]==masuk)&&(pintu[i][1]==keluar)){
                int g = gol - 1;
                double bayar = tarif[i][g];
                System.out.println("Bayar = "+bayar);
            }
        }
    }  
}