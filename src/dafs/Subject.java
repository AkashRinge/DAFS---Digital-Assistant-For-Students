package dafs;
import java.io.Serializable;
public class Subject implements Serializable
{
    String name;
    int lecturesAttended;
    int totalLecturesTillDate;
    int totalLectures;
    int attendance;
    Subject(){}
    void calculateAttendance()
    {attendance = (int)((float)lecturesAttended/totalLecturesTillDate*100);}
    int calculateMoreBunksAllowed(int necessaryAttendance)
    {
        int bunksAllowed = totalLectures - (int)(necessaryAttendance/100.0*totalLectures);
        int bunks = totalLecturesTillDate - lecturesAttended;
        if(bunks>bunksAllowed)
            return -1;
        return bunksAllowed - bunks;
    }
}
