import java.util.Scanner;

public class KafeDoWhile21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //DEKLARASI SEMUA VARIABEL
        int kopi, teh, roti;
        String nampel;
        int harkop = 12000;
        int harteh = 7000;
        int harti  = 20000;
        int totalHarga;

        //DO-WHILE
        do {
            System.out.print("Masukkan Nama Pelanggan (ketik 'BATAL' untuk keluar): ");
            nampel = sc.nextLine();
            if (nampel.equalsIgnoreCase("batal")){
                System.out.println( "Transaksi dibatalkan.");
                break;
            }
            System.out.print("Jumlah Kopi Susu Jaya : ");
            kopi= sc.nextInt();
            System.out.print("Jumlah Teh tarik : ");
            teh = sc.nextInt();
            System.out.print("Jumlah Roti : ");
            roti = sc.nextInt();

            totalHarga = (kopi*harkop) + (teh*harteh) + (roti*harti);
            System.out.println("Total yang harus dibayar: Rp." + totalHarga);
            sc.nextLine();
        }while (true);

            System.out.println("Semua Transaksi selesai.");
    }
    
}
