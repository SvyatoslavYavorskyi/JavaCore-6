package module5;

/**
 * Created by Свят on 05.04.2017.
 */
public abstract class AbstractAPI implements API {
    abstract Room[] getArray();



    @ Override
    public Room[] findRoom(int price, int persons, String city, String hotel) {

        Room [] findrooms= new Room[getArray().length];

        for(int i=0; i < getArray().length; i++){
            if((getArray()[i].getPrice()<=price)&&(getArray()[i].getPerson()==persons)&&
                    (getArray()[i].getCityName().equals(city)&&getArray()[i].getHotelName().equals(hotel)))
                findrooms[i]=getArray()[i];
        }
        return  findrooms;
    }

    @Override
    abstract public Room[] getAll() ;
}
