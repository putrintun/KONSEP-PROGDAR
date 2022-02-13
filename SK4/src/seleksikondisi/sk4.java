package seleksikondisi;
import java.util.Scanner;
public class sk4 {
    public static void main(String[] args) {  
        int IDs[]={1,2,3,4,5};
        String nama[]={"Ali","Budi","Dani","Edi","Umar"};
        int harga [] [] = {{915, 1025, 1225}, {915, 1025, 1225}, {575, 695, 895}, {575, 695, 895}, 
            {595, 715, 915}, {595, 715, 915},{495, 575, 755}, {495, 575, 755}, {495, 575, 755}, {25, 25, 35}};
        String cottageS [ ] = {"Duku","Jeruk","Alpukat","Jambu air","Durian","Melon","Belimbing","Mangga","Kedondong","Barrack"};
        System.out.println("Pilihan Cottage");
        for (int i =0; i<cottageS.length;i++){
            System.out.println(i+1+". "+cottageS[i]);
        }
        System.out.println("Anda masuk hari");
        String hariS[ ] = {"Weekday","Weekend","Holiday"};
        for (int i =0; i<hariS.length;i++){
            System.out.println(i+1+". "+hariS[i]);
        }
        Scanner in = new Scanner(System.in);
        System.out.print("Input ID = ");
        int id = in.nextInt();
        System.out.print("Pilih Cottage : ");
        int cottage = in.nextInt();
        System.out.print("Pilih Hari : ");
        int hari = in.nextInt();
        System.out.print("Lama menginap : ");
        int lama = in.nextInt();
        if (lama>0){
            System.out.println("------------------------");
            System.out.println("ID Pelanggan : "+id);
            System.out.println("Nama Pelanggan : "+nama[id-1]);
            System.out.println("Jumlah Hari : "+hari);
            System.out.println("Tipe Cottage : "+cottageS[cottage-1]);
            System.out.println("Total Rp" + harga[cottage-1][hari-1]*lama+".000");
            System.out.println("------------------------");
        }else{
            System.out.println("tidak ada pilihan");
        }
    }
}
