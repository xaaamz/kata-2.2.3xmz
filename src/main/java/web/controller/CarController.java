package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.models.Car;
import web.service.CarServiceImp;

import java.util.List;
@Controller
public class CarController {
    @GetMapping("/cars")
    public String printCars(@RequestParam(value = "count", required = false, defaultValue = "5") int countCars, Model model) {
        List<Car> allCars = new CarServiceImp().getListCars();
        int displayedCars = Math.min(countCars, allCars.size());
        model.addAttribute("cars", allCars.subList(0, displayedCars));
        model.addAttribute("countCars", displayedCars);
        return "cars.html";
    }


}

