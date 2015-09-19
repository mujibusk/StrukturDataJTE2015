
public class FiniteElement
{
    // instance variables - replace the example below with your own
    private Gaya[] gaya;

    public FiniteElement(){
       
    }

    public FiniteElement(Gaya[] gaya){
         this.gaya = gaya;
        }
    
    public Gaya[] daftarGaya(){
        return gaya;
    }
}
