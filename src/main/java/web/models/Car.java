package web.models;

public class Car {
    public Car(String model, int series, String holder) {
        this.model = model;
        this.series = series;
        this.holder = holder;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    private String model;
    private int series;
    private String holder;

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", series=" + series +
                ", holder='" + holder + '\'' +
                '}';
    }
}
