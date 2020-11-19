package pboif2.pkg10119049.latihan51.gajikaryawan;
/**
 * @author
 * Nama  : Nur Sasongko
 * Kelas : PBOIF2
 * NIM   : 10119049
 * Deskripsi Program : Menghitung Gaji Karyawan
**/

//import class
import Karyawan.Manager;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;

public class PBOIF210119049Latihan51GajiKaryawan {
    public static void main(String[] args) {

        Manager manager = new Manager();
        Scanner scan = new Scanner(System.in); // object scanner
        
        DecimalFormat kursID = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
        
        formatRp.setCurrencySymbol(" Rp. ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');
        kursID.setDecimalFormatSymbols(formatRp);
                
        // inputan
        System.out.printf("=====Program Perhitungan Gaji Karyawan=====\n");
        System.out.printf("Masukkan NIK : "); manager.setNik(scan.nextLine());
        System.out.printf("Masukkan Nama : ");  manager.setNama(scan.nextLine());
        System.out.printf("Masukkan Golongan (1/2/3) : "); manager.setGolongan(scan.nextInt());
        System.out.printf("Masukkan Jabatan (Manager/Kabag) : "); manager.setJabatan(scan.next());
        System.out.printf("Masukkan Jumlah Kehadiran : "); manager.kehadiran = scan.nextInt();
        
        // outpur
        System.out.printf("\n=====Hasil Perhitungan=====\n");
        System.out.printf("NIK : %s\n",manager.getNik()); 
        System.out.printf("Nama : %s\n",manager.getNama());
        System.out.printf("Golongan : %d\n",manager.getGolongan());
        System.out.printf("Jabatan : %s\n\n",manager.getJabatan());
        
        System.out.printf("TUNJANGAN GOLONGAN : %s\n",kursID.format(manager.tunjanganGolongan(manager.getGolongan())));
        System.out.printf("TUNJANGAN JABATAN  : %s\n",kursID.format(manager.tunjanganJabatan(manager.getJabatan())));
        System.out.printf("TUNJANGAN KEHADIRAN  : %s\n",kursID.format(manager.tunjanganKehadiran(manager.kehadiran)));
        
        System.out.printf("GAJI TOTAL  : %s\n",kursID.format(manager.gajiTotal()));
    }
}