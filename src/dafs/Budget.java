package dafs;
import java.io.Serializable;
import java.util.Date;
public class Budget implements Serializable
{
    double monthlyBudget, crucialPoint, budgetRemaining;
    int count;
    ExpenditureItem[] expenditure;
    Budget()
    {
        count = 0;
        expenditure = new ExpenditureItem[100];
        for(int i=0; i<100; i++)
            expenditure[i] = new ExpenditureItem();
    }
    void updateAmountRemaining()
    {
        for(int i=0; i<count; i++)
            budgetRemaining = monthlyBudget - expenditure[i].amountSpent;
    }
}
