import java.util.Scanner;
/**
 *
 * @author User
 * Nama : Silky Afina Saly
 * NIM  : 22166017
 * Prodi: Sistem Informasi
 * Deskripsi Program: Program untuk menampilkan perhitungan lingkaran yang inputannya
 * berasal dari user
 */
public class SI_RegPagi22166017Latihan22ProgramPerhitunganLingkaran {
    public static void main(String[] args) {
        // scanner
        Scanner input = new Scanner(System.in);
        // deklarasi variabel
        double diameter, jari_jari, luas, keliling;
        
        System.out.println("========== Perhitungan Lingkaran ==========");
        // pengkondisian jika nilai diameter bukan angka maka tidak valid dan harus menginputkan nilai diameter lagi
        while(true){
        System.out.print("Masukkan nilai diameter Lingkaran: "); 
        if (input.hasNextDouble()) {
            diameter = input.nextDouble();
            jari_jari = diameter / 2;
            luas = Math.PI * jari_jari * jari_jari;
            keliling = Math.PI *2* jari_jari*jari_jari;
            
        // output
        System.out.println("========== Hasil Perhitungan Lingkaran ==========");
            System.out.println("Jari-Jari Lingkaran = "+jari_jari+" cm");
            System.out.println("Luas lingkaran = "+luas+" cm");
            System.out.println("Keliling Lingkaran = "+keliling+" cm");
        System.out.println("(Developed by: Silky Afina Saly)");
        break;   
        } else { // jika diamter bukan angka akan menampilkan
            System.out.println("Nilai Diameter Tidak Sesuai.");
            input.next();
 

        
    }
    
}
    }
}
