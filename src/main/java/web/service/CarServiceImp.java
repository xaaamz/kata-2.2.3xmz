package web.service;

import org.springframework.stereotype.Service;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImp implements CarService {
    private final List<Car> cars;

    public CarServiceImp() {
        this.cars = new ArrayList<>(List.of(
                new Car("priora", 2012, "Ali"),
                new Car("corolla", 2013, "Turpal"),
                new Car("Mazeratti", 2024, "Marina"),
                new Car("granta", 2006, "Ruslan"),
                new Car("supra", 2018, "Aleksandr")
        ));
    }

    @Override
    public List<Car> getCars(int countCars) {
        int displayedCars = Math.min(countCars, cars.size());
        return cars.subList(0, displayedCars);
    }
}
