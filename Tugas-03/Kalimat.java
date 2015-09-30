
public class Kalimat
{
   Kata [] kalimat;
   int jumlah,unit;
   
   public Kalimat(Kata[] kalimat){
       this.kalimat=kalimat;
   }
   
   public String tampilkan(){
       String kalimat="";
       return kalimat;
    }
    
     public int tampilkanUnit(String kalimat[]){
        return unit;
        
    }
    
    public int jumlahUnit(){
        jumlah=kalimat.length;
        return jumlah;
    }
}
