package perulangan;
public class looptiga {
    public static void main(String[] args) {
        int a=19;  //suku pertama
        int b=3;   //selisih suku
        int u=a;   
        int s=a;   //nilai total optional
        // UNTUK A
        System.out.println("Deret Aritmatikanya adalah");
        for(int i=0;i<5;i++){        //5 baris
            for(int j=0;j<1+i;j++){  //5 kolom
                System.out.print(u+"\t"); 
                u=u+b; 
                s=s+u; 
            }
            System.out.println();
        }
        s=s-u;
        System.out.println("Jumlah Deret Aritmatikanya adalah "+s);
        // UNTUK  B
        System.out.println("Deret Aritmatikanya adalah");
        for(int i=0;i<5;i++){        //5 baris
            for(int j=0;j<5-i;j++){  //5 kolom
                System.out.print(u+"\t");
                u=u+b;
                s=s+u; 
            }
            System.out.println();
        }
        s=s-u;
        System.out.println("Jumlah Deret Aritmatikanya adalah "+s);
    }
}