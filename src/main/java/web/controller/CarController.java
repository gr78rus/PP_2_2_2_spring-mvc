package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;
import web.service.CarServiceImpl;

@Controller
public class CarController {
    private CarService carService = new CarServiceImpl();

    @GetMapping(value = "/cars")
    public String getCars(ModelMap model, @RequestParam(defaultValue = "5") Integer count) {
        model.addAttribute("cars", carService.listCar(count));
        model.addAttribute("cars_value", count);
        return "cars";
    }
}