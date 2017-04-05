package module5;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by Свят on 12.03.2017.
 */
public class TipAdvisorAPI extends AbstractAPI {
    Room [] rooms = new Room[5];

    public TipAdvisorAPI() {

        Calendar cal = Calendar.getInstance();

        cal.set(2017, Calendar.MAY, 25);
        Date date1 = cal.getTime();

        cal.set(2017, Calendar.MAY, 28);
        Date date2 = cal.getTime();

        cal.set(2017, Calendar.MAY,31);
        Date date3 = cal.getTime();

        cal.set(2017, Calendar.MAY, 26);
        Date date4 = cal.getTime();

        cal.set(2017, Calendar.MAY, 29);
        Date date5 = cal.getTime();

        rooms[0]= new Room(2001,1580,2,date1,"Grand", "Kyiv");
        rooms[1]= new Room(2002,1850,1,date2,"Rivera", "Chernigiv");
        rooms[2]= new Room(2003,3200,3,date3,"GoHome", "Kyiv");
        rooms[3]= new Room(2004,2000,2,date4,"Swit", "Kyiv");
        rooms[4]= new Room(2005,1600,1,date5,"Bruger", "Lvov");

    }

    @Override
    Room[] getArray() {
        return rooms;
    }

    @Override
    public Room[] getAll() {
        return rooms;
    }
}
