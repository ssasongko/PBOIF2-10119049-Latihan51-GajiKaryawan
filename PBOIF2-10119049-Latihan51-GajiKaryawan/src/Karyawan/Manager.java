package Karyawan;

public class Manager extends Karyawan {
    // prop
    public int kehadiran;
    public float tunjanganGolongan;
    public float tunjanganJabatan;
    public float tunjanganKehadiran;
    
    // method
    public int getKehadiran() {
        return kehadiran;
    }

    public void setKehadiran(int kehadiran) {
        this.kehadiran = kehadiran;
    }
    
    public float tunjanganKehadiran(int hadir){
        return tunjanganKehadiran = hadir * 10000;
    }
    
    public float tunjanganJabatan(String jabatan){
        jabatan = jabatan.toUpperCase();
        switch (jabatan) {
            case "MANAGER":
                return tunjanganJabatan =  2000000;
            case "KABAG":
                return tunjanganJabatan = 1000000;
            default:
                return tunjanganJabatan = 0;
        }
    }
    
    public float tunjanganGolongan(int golongan){
        switch (golongan) {
            case 1:
                return tunjanganGolongan = 500000;
            case 2:
                return tunjanganGolongan = 1000000;
            case 3:
                return tunjanganGolongan = 1500000;
            default:
                return tunjanganGolongan = 0;
        }
    }
    
    public float gajiTotal(){
        return tunjanganJabatan + tunjanganGolongan + tunjanganKehadiran;
    }
}
