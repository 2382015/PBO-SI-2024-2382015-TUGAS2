import java.util.Scanner;

    public class Tugas2 {
        // Method untuk menghitung luas dan keliling persegi
        public static void persegi(double sisi) {
            double luas = sisi * sisi;
            double kelilig = 4 * sisi;
            System.out.println("luas persegi: " + luas);
            System.out.println("keliling persegi: " + kelilig);
        }

        // Method untuk menghitung luas luas dan keliling persegi panjang
        public static void persegiPanjang(double panjang, double lebar) {
            double luas = panjang * lebar;
            double keliling = 2 * (panjang + lebar);
            System.out.println("luas persegi panjang:" + luas);
            System.out.println("keliling persegi panjang: " + keliling);
        }

        // Method untuk menghitung luas dan keliling lingkaran
        public static void lingkaran(double jarijari) {
            double luas = Math.PI * jarijari * jarijari;
            double keliling = 2 * Math.PI * jarijari;
            System.out.println("luas lingkaran: " + luas);
            System.out.println("keliling lingkaran: " + keliling);

        }

        public static void main(String[] args) {
            Scanner Scanner = new Scanner(System.in);

            System.out.println("Pilih bangun datar:");
            System.out.println("1. persegi");
            System.out.println("2. Persegi Panjang");
            System.out.println("3. Lingkaran");
            System.out.println("Masukkan pilihan Anda: ");
            int pilihan = Scanner.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("Masukkan sisi persegi: ");
                    double sisi = Scanner.nextDouble();
                    persegi(sisi);
                    break;
                case 2:
                    System.out.println("Masukkan panjang persegi panjang: ");
                    double panjang = Scanner.nextDouble();
                    System.out.println("Masukkan lebar persegi panjang: ");
                    double lebar = Scanner.nextDouble();
                    persegiPanjang(panjang, lebar);
                    break;
                case 3:
                    System.out.println("Masukkan jari-jari lingkaran: ");
                    double jarijari = Scanner.nextDouble();
                    lingkaran(jarijari);
                    break;
                default:
                    System.out.println("pilihan tidak valid.");
            }

            Scanner.close();
        }
    }