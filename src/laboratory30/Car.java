package laboratory30;

public class Car {
    private int number;
    private State state;

    private Payment payment;

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "laboratory30.Car{" +
                "number=" + number +
                ", state=" + state +
                ", payment=" + payment +
                '}';
    }
}
