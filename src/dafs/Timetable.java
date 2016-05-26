package dafs;
public class Timetable implements java.io.Serializable
{
    String [] Monday;
    String [] Tuesday; 
    String [] Wednesday;
    String [] Thursday;
    String [] Friday;
    String [] Saturday;
    
    Timetable(int x)
    {
        Monday = new String[x];
        Tuesday = new String[x];
        Wednesday = new String[x];
        Thursday = new String[x];
        Friday = new String[x];
        Saturday = new String[x];
    }
}
