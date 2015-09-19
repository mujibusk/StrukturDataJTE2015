import java.util.Date;

public class Vector4D extends Vector3D
{
    private double x,y,z;
    private Date t;
    
    public Vector4D(double x, double y, double z, Date t){
       super (x,y,z);
       
       this.x = x;
       this.y = y;
       this.z = z; 
       this.t = t;
        
    }

    public Date getT(){
        return t;
    }
}