package laboratory30;

import java.util.ArrayList;
import java.util.List;

public class Parking {

    List<Car> cars = new ArrayList<>(20);
    private int countPlace;
    private int time;

    public List<Car> getCars() {
        return cars;
    }

    public void setCar(Car car) {
        this.cars.add(car);
    }

    public int getCountPlace() {
        return countPlace;
    }

    public void setCountPlace(int countPlace) {
        this.countPlace = countPlace;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "laboratory30.Parking{" +
                "cars=" + cars +
                ", countPlace=" + countPlace +
                ", time=" + time +
                '}';
    }
}
