package perulangan;
public class loopdua {
    public static void main(String[] args) {
        int a=19;   //suku pertama
        int b=3;    //selisih suku suku yang berdekatan
        int u=a;    
        int s=a;    //hasil total optional
        System.out.println("Deret Aritmatikanya adalah");
        for(int i=0;i<5;i++){      //<5 berarti 5 baris
            for(int j=0;j<2;j++){  //<2 berarti 2 kolom
                System.out.print(u+"\t");
                u=u+b;  //supaya bilangan tetap bertambah
                s=s+u;  //hasil akhir
            }
            System.out.println();
        }
        s=s-u;  //hasil akhir sesuai
        System.out.println("Jumlah Deret Aritmatikanya adalah "+s);
    }
}