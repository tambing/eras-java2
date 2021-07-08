import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean menu = true;
        while (menu) {
            System.out.println("Silahkan Pilih Menu");
            System.out.println("1 => Segitiga");
            System.out.println("2 => Prisma");
            System.out.println("3 => Lingkaran");
            System.out.println("4 => Bola");
            System.out.println("5 => Persegi");
            System.out.println("6 => Kubus");
            
            System.out.print("Masukkan Menu : ");
            int getMenu = scan.nextInt();
            switch (getMenu) {
                case 1:
                    System.out.println("Menghitung Luas dan Keliling Segitiga");
                    Segitiga segitiga = new Segitiga();
                    segitiga.getInput();
                    segitiga.cetakLuas();
                    segitiga.cetakKeliling();
                    break;
                case 2:
                    System.out.println("Menghitung Volume Prisma");
                    Prisma prisma = new Prisma();
                    prisma.getVolume();
                    break;
                case 3:
                    System.out.println("Menghitung Luas dan Keliling Lingkaran");
                    Lingkaran lingkaran = new Lingkaran();
                    lingkaran.getInput();
                    lingkaran.cetakLuas();
                    lingkaran.cetakKeliling();
                    break;
                case 4:
                    System.out.println("Menghitung Volume Bola");
                    Bola bola = new Bola();
                    System.out.println("Volume Bola : "+bola.volume()+" cm^3");
                    break;
                case 5:
                    System.out.println("Menghitung Luas dan Keliling Persegi");
                    Persegi persegi = new Persegi();
                    persegi.getInput();
                    persegi.cetakLuas();
                    persegi.cetakKeliling();
                    break;
                case 6:
                    System.out.println("Menghitung Volume Kubus");
                    Kubus kubus = new Kubus();
                    kubus.getInput();
                    System.out.print("Tinggi : ");
                    double getTinggi = scan.nextDouble();
                    kubus.setTinggi(getTinggi);
                    System.out.println("Volume Kubus = "+kubus.volume()+" cm^3");
                    break;
                default:
                    System.out.println("Menu tidak tersedia !!!!");
                    continue;
            }
            System.out.print("Apakah Anda ingin menghitung Luas, keliling dan Volume lagi (Y/N) ?");
            String cekMenu = scan.next();
            if (cekMenu.equalsIgnoreCase("Y")) {
                menu = true;
            }else{
                System.out.println("Terimakasih Telah berselancar !");
                menu = false;
                System.exit(0);
                scan.close();
            }

        }
        // System.out.print("Masukkan Alas segitiga: ");
        // double alas = scan.nextDouble();
        // System.out.print("Masukkan Tinggi segitiga: ");
        // double tinggi = scan.nextDouble();
        // System.out.print("Masukkan tinggi prisma : ");
        // double tinggiPrisma = scan.nextDouble();

        
        // segitiga.setAlas(alas);
        // segitiga.setTinggi(tinggi);
        // segitiga.getLuas();
        // segitiga.getKeliling();
        // System.out.println(segitiga.luasSegitiga());
        // System.out.println(segitiga.kelilingSegitiga());

        // Prisma prisma = new Prisma();
        // prisma.setAlas(alas);
        // prisma.setTinggi(tinggi);
        // prisma.setTinggiPrisma(tinggiPrisma);
        // prisma.getVolume();
        
        

    }
}
