package laboratory30;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SimulationParking implements Simulation {
    Random rnd = new Random();
    List<Car> cars = new ArrayList<>();
    Parking parking = new Parking();
    private static int placeCount = 20;

    public SimulationParking() {
        for (int i = 1; i <= 200; i++) {
            Car car = new Car();
            car.setNumber(rnd.nextInt(999));
            if (rnd.nextInt(100) <= 3) {
                car.setState(State.PARKING);
            } else {
                car.setState(State.DRIVE);
            }
            cars.add(car);

        }
    }

    public void parking() {
        System.out.println("Количество машин: " + cars.size());
        for (Car car : cars) {
            if (car.getState().equals(State.PARKING) && parking.getCars().size() < placeCount) {
                car.setPayment(getPayment());
                parking.setCar(car);
                System.out.println("Мест на парковке осталось :  " + (--placeCount));
            } else if (placeCount == 0) {
                System.out.println("Мест на парковке НЕТ!");
            }
        }
        System.out.println("На парковке: " + parking.getCars().size());
        parking.getCars().forEach(System.out::println);
    }

    public Payment getPayment() {
        Payment payment = new Payment();
            switch (rnd.nextInt(4)) {
                case 3:
                    payment.setScore(30);
                    break;
                case 2:
                    payment.setScore(20);
                    break;
                case 1:
                    payment.setScore(10);
                    break;
                default:
                    payment.setScore(0);

            }
        return payment;
    }

}
