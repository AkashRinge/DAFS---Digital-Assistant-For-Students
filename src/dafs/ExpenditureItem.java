package dafs;
import java.util.Date;
public class ExpenditureItem implements java.io.Serializable
{
    double amountSpent;
    String reason;
    Date dateOfExpenditure;
    
    ExpenditureItem()
    {}
}
