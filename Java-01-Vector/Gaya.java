public class Gaya
{
    // instance variables
    private Vector3D titikAcuan,arah;
    
    public Gaya(Vector3D titikAcuan, Vector3D arah)
    {
       this.titikAcuan = titikAcuan;
       this.arah = arah;
    }
    
    public Vector3D getTitikAcuan(){
        return titikAcuan;
    }
    
    public Vector3D getArah(){
        return arah;
    }
}
