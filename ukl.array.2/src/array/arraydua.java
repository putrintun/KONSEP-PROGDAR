package array;
public class arraydua {
    public static void main(String[] args) {
        int a[][]={{2,4,3},{4,6,5}};
        int b[][]={{2,5},{7,6}};
        int h[][]={{0},{0}};
        System.out.println("Hasil AxB");
        //proses perhitungan
        for(int i=0;i<2;i++){
            for(int j=0;j<1;j++){ 
                for(int k=0;k<2;k++){ 
                    h[i][j]=h[i][j]+a[i][k]*b[k][j];
                }
            }
        }
        //menampilkan hasil
        for(int i=0;i<2;i++){
            for(int j=0;j<1;j++){
                System.out.print(h[i][j]+"\t");
            }
            System.out.println();
        }
    }
}