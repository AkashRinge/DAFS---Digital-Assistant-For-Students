package dafs;
import java.util.Date;
public class Student implements java.io.Serializable
{
    String name, email, password;
    Subject[] subject;
    Long phone;
    Budget budget;
    Event event[];
    int eventCount;
    int sem, subjectNumber, lectureNumber, minAttendance;
    Student()
    {
        subject = new Subject[10]; 
        for(int i=0; i<10; i++)
            subject[i] = new Subject();
        budget = new Budget();
        
        event = new Event[100];
        for(int i=0; i<100; i++)
            event[i] = new Event();
        
        eventCount = 0;
    }
    boolean setPhone(String ph)
    {
        if(ph.length()!=10)
            return false;
        else
        {
            try
            {
                phone = Long.parseLong(ph);
                return true;
            }
            catch(Exception e)
            {return false;}
        }   
    }
    boolean setPassword(String pass)
    {
        if(pass.length()!=4)
            return false;
        else
            password = pass;
        return true;
    }
    boolean setEmail(String em)
    {
        if(em.endsWith("@gmail.com"))
        {
            email = em;
            return true;
        }
        else
            return false;
    }
}
