
/**
 * Write a description of class Gabung here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Gabung
{
    
    public int[] gabung (int[] pertama, int kedua[])
    {
        int gabung[] = new int[pertama.length+kedua.length];
        
        System.arraycopy(pertama, 0, gabung, 0, pertama.length);
        System.arraycopy(kedua, 0, gabung, pertama.length, kedua.length);
      return gabung;
    }

    
    }
