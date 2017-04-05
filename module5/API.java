package module5;

/**
 * Created by Свят on 12.03.2017.
 */
public interface API {
    Room[] findRoom(int price, int person, String city,String hotel);
    Room [] getAll();
}
