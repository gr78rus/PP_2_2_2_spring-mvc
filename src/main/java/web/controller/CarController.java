package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;

import java.util.Arrays;
import java.util.List;

@Controller
public class CarController {

    List<Car> carList = Arrays.asList(
            new Car("Opel", "Astra", 2008),
            new Car("Ford", "Focus", 2006),
            new Car("Kia", "Optima", 2016),
            new Car("Nissan", "Note", 2008),
            new Car("Skoda", "Rapid", 2020));

    @GetMapping(value = "/cars")
    public String getCars(ModelMap model, @RequestParam(defaultValue = "5") Integer count) {
        if (count >= 5) {
            model.addAttribute("cars", carList);
        } else if (count >= 0) {
            model.addAttribute("cars", carList.subList(0, count));
        } else {
            model.addAttribute("cars", "WTH BRO?");
        }

        model.addAttribute("cars_value", count);
        return "cars";
    }
}
