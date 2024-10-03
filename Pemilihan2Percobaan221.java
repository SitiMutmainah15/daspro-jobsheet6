import java.util.Scanner;

public class Pemilihan2Percobaan221 {
    public static void main(String[] args) {
    Scanner input21 = new Scanner(System.in);

       String member;
       int jumlahBeli, pilihanMenu;
       double diskon, totalBayar, harga;

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
       System.out.println("-------------------------------------");

       if (member.equalsIgnoreCase("y")) { // Menggunakan equalsIgnoreCase untuk membandingkan string 
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
        return; // Menghentikan eksekusi lebih lanjut jika pilihan salah
       }

// Menghitung total bayar setelah diskn
totalBayar = harga - (harga * diskon);
System.out.println ("Total bayar setelah diskon = " + totalBayar);
}
else if (member.equalsIgnoreCase("n")) { // Menggunakan equalsIgnoreCase untuk membandingkan string 
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
    return; // Menghentikan eksekusi lebih lanjut jika pilihan salah
   }

// Menghitung total bayar
System.out.println ("Total bayar = " + harga);

} else {
    System.out.println("Member tidak valid");
}
System.out.println("-------------------------------------");
}
}