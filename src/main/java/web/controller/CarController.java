package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import service.CarService;
import service.CarServiceImpl;

import javax.servlet.http.HttpServletRequest;

@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String printCarList(HttpServletRequest request, ModelMap model){
        CarService carService = new CarServiceImpl();
        String count = request.getParameter("count");
        if (count == null) {
            model.addAttribute("cars", carService.getCarList());
        } else {
            model.addAttribute("cars", carService.getCarList(Integer.parseInt(count)));
        }
        return "cars";
    }
}
