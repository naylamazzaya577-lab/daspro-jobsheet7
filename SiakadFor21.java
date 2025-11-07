import java.util.Scanner;

public class SiakadFor21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //DATA NILAI
        double nilai;
        double niting = 0 ;
        double nindah = 100;
        for (int i = 1; i <=10; i++){
            System.out.print( "Masukkan nilai Mahasiswa ke- " + i + " : ");
            nilai = sc.nextDouble();
            if (nilai > niting ) {
                niting = nilai;
            }
            if (nilai < nindah) {
                nindah = nilai;
            }  
        }

            System.out.println("Nilai Tertinggi "+ niting);
            System.out.println("Nilai Terendah "+ nindah );
    }
}