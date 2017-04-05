package module5;

import java.util.Date;

/**
 * Created by Свят on 12.03.2017.
 */
public class Room {
    private long id;
    private int price;
    private int person;
    private Date dateAvailableFrom;
    private String hotelName;
    private String cityName;

    public Room(long id, int price, int person, Date dateAvailableFrom, String hotelName, String cityName) {
        this.id = id;
        this.price = price;
        this.person = person;
        this.dateAvailableFrom = dateAvailableFrom;
        this.hotelName = hotelName;
        this.cityName = cityName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPerson() {
        return person;
    }

    public void setPerson(int person) {
        this.person = person;
    }

    public Date getDateAvailableFrom() {
        return dateAvailableFrom;
    }

    public void setDateAvailableFrom(Date dateAvailableFrom) {
        this.dateAvailableFrom = dateAvailableFrom;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Room room = (Room) o;

        if (getPrice() != room.getPrice()) return false;
        if (getPerson() != room.getPerson()) return false;
        return getCityName() != null ? getCityName().equals(room.getCityName()) : room.getCityName() == null;
    }

    @Override
    public int hashCode() {
        int result = getPrice();
        result = 31 * result + getPerson();
        result = 31 * result + (getCityName() != null ? getCityName().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Room{" +
                "id=" + id +
                ", hotelName='" + hotelName + '\'' +
                ", cityName='" + cityName + '\'' +
                '}';
    }
}
