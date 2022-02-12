package perulangan;
public class loopempat {
    public static void main(String[] args) {
        int a=19;   //suku pertama
        int b=3;    //selisih yang berdekatan
        int u=a;
        int s=a;    //nilai total optiona;
        // UNTUK B KEDALAM
        System.out.println("Deret Aritmatikanya adalah");
        for(int i=0;i<4;i++){          //4 baris
            for(int j=0;j<4-i;j++){    //4 kolom
                System.out.print(u+"\t");
                u=u+b;
                s=s+u; 
            }
            System.out.println();
        }
        for(int i=0;i<3;i++){          //3 baris
            for(int j=0;j<2+i;j++){    //mulai dari kolom 2
                System.out.print(u+"\t");
                u=u+b;
                s=s+u; 
            }
            System.out.println();
        }
        s=s-u; 
        System.out.println("Jumlah Deret Aritmatikanya adalah "+s);
        // UNTUK A LANCIP
        System.out.println("Deret Aritmatikanya adalah");
        for(int i=0;i<=4;i++){       //4 baris
            for(int j=0;j<i;j++){    //4 kolom
                System.out.print(u+"\t");
                u=u+b;
                s=s+u; 
            }
            System.out.println();
        }
        for(int i=0;i<3;i++){        //3 baris
            for(int j=0;j<3-i;j++){  // mu;ai dari kolom 3
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