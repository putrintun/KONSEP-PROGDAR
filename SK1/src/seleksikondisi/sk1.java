package seleksikondisi;
import java.util.Scanner;
public class sk1 {
    public static void main(String[] args) {
        int IDPelanggan [] = {1,2,3,4,5};
        String namaPelanggan [] = {"Galuh","Indro","Jedi","Kanu"};
        int golPelanggan [] = {1,3,2,3};
        String alamat [] = {"Sawojajar","KedungKandang","Ijen","Dinoyo"};
       
        System.out.println("====================");
        System.out.println("Masukkan Data");
        System.out.println("====================");
        
        Scanner input = new Scanner (System.in);
        System.out.print("Masukkan Id Pelanggan    =");
        String ID = input.nextLine();
        int a = Integer.valueOf(ID);
        
        System.out.print("Masukkan Jumlah Tagihan  =");
        String Jumlah = input.nextLine();
        int b = Integer.valueOf(Jumlah); 
        int tagihan = hitung(golPelanggan[a-1], b);
        
        System.out.println("====================");
        System.out.println("Print Out Tagihan ");
        System.out.println("====================");
        System.out.println("ID\t: " + a);
        System.out.println("Nama\t: " + namaPelanggan[a-1]);
        System.out.println("Alamat\t: " + alamat[a-1]);
        System.out.println("golongan\t: " + golPelanggan[a-1]);
        System.out.println("Total Kwh\t: " + b);
        System.out.println("Tagihan\t: Rp " + tagihan + ".");
    }
    static int hitung (int gol, int jumlah){
        int hasil = 0;
        if (gol == 1 ){
            hasil = jumlah*1000;
        }
        else if (gol == 2){
            hasil = jumlah*1300;
        }
        else if (gol == 3){
            hasil = jumlah*1500;
        }
        else {
            System.out.println("Salah Input Golongan");
        }
        if (hasil < 50000) {
            hasil = 50000;
        }
        int hasilakhir = hasil + 13000;
        return hasilakhir;
    }    
}
