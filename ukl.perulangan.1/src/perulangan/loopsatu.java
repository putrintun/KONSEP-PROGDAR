package perulangan;
public class loopsatu {
    public static void main(String[] args) {
        int a=19;     //suku pertama
        int b=3;      //selisih suku suku yang berdekatan
        int n=17;     //suku terakhir ditampilkan
        int u;
        int s=0;      //nilai total
        System.out.println("Deret Aritmatikanya adalah");
        for(int i=4;i<=n;i++){ // i=4 adl suku pertama dutampilkan
            u=a+(4-1)*b;       // suku pertama -1 
            a+=b;              // bertambah terus
            System.out.println("suku ke-"+i+" = "+u+"\t");
            s+=u;              // menambah jumlah u
        }
        System.out.println("Jumlah Deret Aritmatikanya adalah "+s); 
//        int a=5;   //suku pertama
//        int b=3;   //selisih
//        int n=10;  //deret terakhir
//        int u=a;
//        int s=a;
//        System.out.println("Deret Aritmatikanya adalah");
//        for(int i=1;i<=n;i++){ 
//            System.out.println("suku ke-"+i+"="+u+"\t");
//            u=u+b;  //supaya selalu bertambah
//            s=s+u;  //nilai total
//        }
//        s=s-u;      //supaya dapat hasil yang benar
//        System.out.println("Jumlah Deret Aritmatikanya adalah "+s);
    }
}