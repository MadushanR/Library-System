
import java.util.Date;


public class TLog {
    private String TType;
    Date TDate = new Date();
   
    public Date getTDate() {
        return TDate;
    }

    public void setTDate(Date TDate) {
        this.TDate = TDate;
    }

    public String getTType() {
        return TType;
    }

    public void setTType(String TType) {
        this.TType = TType;
    }
    
}
