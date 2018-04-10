package praktek02;
public class perhitunganAksi {
    public static void main(String [] args){
        
        perhitungan r1 = new perhitungan();
        r1.p = 9;
        r1.l = 3;
        
        r1.cetakInfo();
        System.out.println("Luas Rectangle = "+r1.hitungLuas()); 
        r1.cetakLuas();
        
        perhitungan r2 = new perhitungan();
        r2.cetakInfo();
        
        perhitungan r3 = new perhitungan();
        r3.cetakInfo();
}
}
