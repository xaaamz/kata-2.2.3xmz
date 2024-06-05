package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.models.Car;
import web.service.CarService;

import java.util.List;

@Controller
public class CarController {
    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/cars")
    public String printCars(@RequestParam(value = "count", required = false, defaultValue = "5") int countCars, ModelMap modelMap) {
        List<Car> cars = carService.getCars(countCars);
        modelMap.addAttribute("cars", cars);
        modelMap.addAttribute("countCars", cars.size());
        return "cars";
    }
}
