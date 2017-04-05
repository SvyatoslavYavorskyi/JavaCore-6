package module5;

/**
 * Created by Свят on 12.03.2017.
 */
public interface DAO {
    Room []save(Room room);
    boolean delete (Room room);
    Room update(Room room);
    Room findById (Room room);

    Room [] getAll();
}
