package praktek02;
public class perhitungan {
    double p ;
    double l ;
    
    public perhitungan(){
     p =5;
     l=2;
    }
    public perhitungan( double panjang,double lebar){
    this.p = p;
    this.l = l;
    }
    
    void cetakInfo (){
        System.out.println("|-|-|-|-|-|-|-|-|-|-|-");
        System.out.println("panjang : "+p);
        System.out.println("lebar : "+l);
        System.out.println("|-|-|-|-|-|-|-|-|-|-|-");
    }
        double hitungLuas(){
          double luas;
          luas=p*l;
          return luas ;
    }
        void cetakLuas(){
        System.out.println("Luas nya adalah = "+hitungLuas());
        }
   }

