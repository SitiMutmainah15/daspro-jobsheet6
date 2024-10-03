import java.util.Scanner;

public class Pemilihan2Percobaan221 {
    public static void main(String[] args) {
        Scanner input21 = new Scanner(System.in);

        String member, jenisPembayaran;
        int jumlahBeli, pilihanMenu;
        double diskon, totalBayar, harga, totalBayarQRIS;

        System.out.println("-----------------------");
        System.out.println("==== MENU KAFE JTI ====");
        System.out.println("-----------------------");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bunding (Ricebowl + Ice Tea)");
        System.out.println("-------------------------------------");
        System.out.print("masukkan angka dari menu yang dipilih = ");

        pilihanMenu = input21.nextInt();
        input21.nextLine();
        System.out.print("Apakah punya member (y/n) ? = ");
        member = input21.nextLine();
        System.out.print("Apakah bayar pakai QRIS(y/n) ? = ");
        jenisPembayaran = input21.nextLine();
        System.out.println("-------------------------------------");

        totalBayar = 0;

        if (member.equalsIgnoreCase("y")) { 
            diskon = 0.10;
            System.out.println ("Besar diskon = 10%");

            if (pilihanMenu == 1) {
                harga = 14000;
                System.out.println ("Harga ricebowl = " + harga);

            } else if (pilihanMenu == 2) {
                harga = 3000;
                System.out.println ("Harga ricebowl = " + harga);
            
            } else if (pilihanMenu == 3) {
                harga = 15000;
                System.out.println ("Harga bundling = " + harga);

           } else {
            System.out.println ("Masukkan pilihan menu dengan benar");
            return; 
           }

            totalBayar = harga - (harga * diskon);
            System.out.println ("Total bayar setelah diskon = " + totalBayar);
        } else if (member.equalsIgnoreCase("n")) { 
            if (pilihanMenu == 1) {
                harga = 14000;
                System.out.println ("Harga ricebowl = " + harga);

            } else if (pilihanMenu == 2) {
                harga = 3000;
                System.out.println ("Harga ricebowl = " + harga);
            
            } else if (pilihanMenu == 3) {
                harga = 15000;
                System.out.println ("Harga bundling = " + harga);

           } else {
            System.out.println ("Masukkan pilihan menu dengan benar");
            return; 
           }

            totalBayar = harga;
            System.out.println ("Total bayar = " + totalBayar);
        } else {
            System.out.println("Member tidak valid");
        }

        System.out.println("-------------------------------------");

        if (jenisPembayaran.equalsIgnoreCase("y")) {
            totalBayar -= 1000;
            System.out.println("Selamat! Anda mendapatkan potongan harga sebesar Rp. 1000 karena melakukan pembayaran menggunakan QRIS.");
            System.out.println("Total Pembayaran akhir = Rp. " + totalBayar);
        } else {
            System.out.println("Total Pembayaran akhir = Rp. " + totalBayar);
        }
    }
}