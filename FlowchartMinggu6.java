import java.util.Scanner;

public class FlowchartMinggu6 {
    public static void main(String[] args) {
        Scanner input21 = new Scanner(System.in);

        String jenisBuku;
        int jumlahBuku, harga=20000;
        double hargaTotal, diskon, totalDiskon, hargaBayar;

        System.out.println("-----------------------");
        System.out.println("==== TOKO BUKU PASTA ====");
        System.out.println("-----------------------");

        System.out.print("Masukkan Jenis Buku : ");
        jenisBuku = input21.nextLine();
        System.out.print("Masukkan Jumlah Buku : ");
        jumlahBuku = input21.nextInt();

        if (jenisBuku.equalsIgnoreCase("kamus")) {
            diskon = 0.1;
           }if (jumlahBuku > 2) {
                diskon = 0.12; 

           } else if (jenisBuku.equalsIgnoreCase("novel")) {
            diskon = 0.08;
            }if (jumlahBuku > 3) {
                        diskon = 0.09; 

            } if (jenisBuku.equalsIgnoreCase("buku lain")) {
            } if (jumlahBuku > 5) {
                diskon = 0.05;

            hargaTotal = harga * jumlahBuku;
            totalDiskon = hargaTotal * diskon;
            hargaBayar = hargaTotal - totalDiskon;

            System.out.println("Anda mendapat diskon sebesar : " + totalDiskon);
            System.out.println("Anda membayar buku sebesar : " + hargaBayar);
        }
    }

}