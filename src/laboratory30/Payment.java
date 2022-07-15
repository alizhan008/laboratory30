package laboratory30;

public class Payment {
    private int score;

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Оплата=" + score + "сом ";
    }
}
