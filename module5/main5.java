package module5;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by Свят on 19.03.2017.
 */
public class main5 {
    public static void main(String[] args) {
        Controller controller =new Controller();
        System.out.println("Find in BookingComAPI: "+  Arrays.toString(controller.apis[0].findRoom(2000, 2, "Kyiv", "Grand")));
        System.out.println("Find in TripAdvisorAPI: " + Arrays.toString(controller.apis[1].findRoom(2000, 1,"Chernigiv", "Rivera")));
        System.out.println("Find in GoogleAPI: "+  Arrays.toString(controller.apis[2].findRoom(2000, 2,"Brovary" ,"Privet")));

        System.out.println("Method requstRooms1: " + Arrays.toString(controller.requstRooms(2000, 2, "Kyiv", "Grand")));
        System.out.println("Method requstRooms2: " + Arrays.toString(controller.requstRooms(1900, 1, "Chernigiv", "Rivera")));
        System.out.println("Method requstRooms3: " + Arrays.toString(controller.requstRooms(3000, 2, "Brovary" ,"Privet")));

        API book = controller.apis[0];
        API trip = controller.apis[1];
        API google = controller.apis[2];

        System.out.println(Arrays.toString(controller.check(book, trip)));
        System.out.println(Arrays.toString(controller.check(google, trip)));
        System.out.println(Arrays.toString(controller.check(book, google)));


        System.out.println("All rooms BD: " + Arrays.toString(controller.dao.getAll()));

        Calendar cal = Calendar.getInstance();
        cal.set(2017, Calendar.MAY, 25);
        Date date1 = cal.getTime();
        Room room1 = new Room(4001,0,0,date1,null, null);
        System.out.println(controller.dao.findById(room1));


        Room rooms = new Room(4001,1500,1,date1,"Nowyi", "Kyiv");
        System.out.println("Add number: "+Arrays.toString(controller.dao.save(rooms)));

        Room room2 = new Room(4001,1500,3,date1,"Big", "Cherkasy");
        System.out.println(controller.dao.update(room2));

        System.out.println(controller.dao.delete(room2));


    }

    }

