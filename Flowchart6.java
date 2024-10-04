import java.util.Scanner;

public class Flowchart6 {
    public static void main(String[] args) {
        Scanner input21 = new Scanner(System.in);

        String jenisBuku;
        int jumlahBuku, harga = 20000;
        double hargaTotal, diskon = 0.0, totalDiskon, hargaBayar;

        System.out.println("-----------------------");
        System.out.println("==== TOKO BUKU PASTA ====");
        System.out.println("-----------------------");

        System.out.print("Masukkan Jenis Buku: ");
        jenisBuku = input21.nextLine();
        System.out.print("Masukkan Jumlah Buku: ");
        jumlahBuku = input21.nextInt();

        if (jenisBuku.equalsIgnoreCase("kamus")) {
            if (jumlahBuku > 2) {
                diskon = 0.12;
            } else {
                diskon = 0.10;
            }
        } else if (jenisBuku.equalsIgnoreCase("novel")) {
            if (jumlahBuku > 3) {
                diskon = 0.09;
            } else {
                diskon = 0.08;
            }
        } else if (jenisBuku.equalsIgnoreCase("buku lain")) {
            if (jumlahBuku > 5) {
                diskon = 0.05; 
            }
        }

        hargaTotal = harga * jumlahBuku;
        totalDiskon = hargaTotal * diskon;
        hargaBayar = hargaTotal - totalDiskon;

        System.out.println("Total harga sebelum diskon: " + hargaTotal);
        System.out.println("Diskon yang didapat: " + totalDiskon);
        System.out.println("Total harga yang harus dibayar: " + hargaBayar);
    }
}
