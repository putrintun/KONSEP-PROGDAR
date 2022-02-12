package array;
public class arraytiga {
    public static void main(String[] args) {
        int a[][]={{2,2,2,},{2,2,2,},{2,2,2,},{2,2,2,},{2,2,2,}};
        int b[][]={{3,3,3,3,3},{3,3,3,3,3},{3,3,3,3,3}};
        int h[][]= new int[a.length][b[0].length];
        System.out.println("Hasil AxB");
        //proses perhitungan
        for(int i=0; i<a.length; i++){
            for(int j=0; j<b[0].length; j++){ 
                for(int k=0; k<b.length; k++){ 
                    h[i][j]+=a[i][k]*b[k][j];
                }
                System.out.print(h[i][j]+"\t");
            }
            System.out.println("");
        }
    }
}