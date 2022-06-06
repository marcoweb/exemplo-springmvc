package springmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/tabuada")
    public String tabuada(Model model) {
        int[] resultado = new int[10];
        for(int pos = 0;pos < 10;pos++) {
            resultado[pos] = (pos + 1) * 2;
        }
        model.addAttribute("resultado", resultado);
        return "tabuada";
    }
}
