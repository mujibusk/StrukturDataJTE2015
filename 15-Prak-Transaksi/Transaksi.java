import java.util.Date;
import java.math.BigInteger;
import java.lang.String;
public class Transaksi {
   public Transaksi() {
        this.kapan = new Date();
        this.debit = new BigInteger("0");
        this.kredit = new BigInteger("0");
        this.debitStr=new String("0");
        this.kreditStr=new String("0");
        
        }
   public Transaksi(Date kapan,String debit, String kredit) {
        this.kapan = kapan;
        this.debit = new BigInteger(debit.toString());
        this.kredit = new BigInteger(kredit.toString());
        
        
    }
    public Transaksi(Date kapan, long debit, long kredit) {
        this.kapan = kapan;
        this.debit = new BigInteger(Long.toString(debit));
        this.kredit = new BigInteger(Long.toString(kredit));
        
    }
    
    public Date kapan() {
        return kapan;
    }
    
    public BigInteger debit() {
        return debit;
    }
    
    public BigInteger kredit() {
        return kredit;
    }
     public String debitStr(){
     
         return debit.toString();
         
        }
        public String kreditStr(){
            return kredit.toString();
        }
    
    
    private Date kapan;
    private BigInteger debit;
    private BigInteger kredit;
    private String debitStr;
    private String kreditStr;
    
    
}