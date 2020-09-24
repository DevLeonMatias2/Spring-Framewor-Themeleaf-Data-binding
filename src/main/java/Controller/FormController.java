package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormController {

    @GetMapping("/form")
    public String form(Model model){
        model.addAttribute("titulo","Resultado form");
        return  "form";
    }
    @GetMapping("/form")
    public String procesar(Model model,
                           @RequestParam(name = "use") String username,
                           @RequestParam String password,
                           @RequestParam String email){
        model.addAttribute("titulo","Resultado form");
        model.addAttribute("username",username);
        model.addAttribute("password",password);
        model.addAttribute("email",email);

        return  "resultado";
    }
}
