package web.service;
import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.List;


@Component
public class CarServiceImp implements CarService {
    @Override
    public List<Car> getListCars() {
        return List.of(
                new Car("priora", 2012, "Ali"),
                new Car("corolla", 2013, "Turpal"),
                new Car("Mazeratti", 2024, "Marina"),
                new Car("granta", 2006, "Ruslan"),
                new Car("supra", 2018, "Aleksandr")
        );
    }


}
