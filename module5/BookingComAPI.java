package module5;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by Свят on 12.03.2017.
 */
public class BookingComAPI extends AbstractAPI {
    Room[] rooms = new Room[5];

    public BookingComAPI() {

        Calendar cal = Calendar.getInstance();

        cal.set(2017, Calendar.MAY, 30);
        Date date1 = cal.getTime();

        cal.set(2017, Calendar.MAY, 29);
        Date date2 = cal.getTime();

        cal.set(2017, Calendar.MAY,25);
        Date date3 = cal.getTime();

        cal.set(2017, Calendar.MAY, 28);
        Date date4 = cal.getTime();

        cal.set(2017, Calendar.MAY, 27);
        Date date5 = cal.getTime();

        rooms[0]= new Room(1001,2000,2,date1,"Grand", "Kyiv");
        rooms[1]= new Room(1002,1600,1,date2,"Slavutich", "Kyiv");
        rooms[2]= new Room(1003,2200,2,date3,"Yaroslav", "Kharkiv");
        rooms[3]= new Room(1004,4000,3,date4,"New", "Odessa");
        rooms[4]= new Room(1005,1500,1,date5,"Arena", "Donetsk");




}

    @Override
    Room[] getArray() {
        return new Room[0];
    }

    @Override
    public Room[] getAll() {
        return new Room[0];
    }
}

