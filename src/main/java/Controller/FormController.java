package Controller;

import com.bolsadeideas.springboot.fom.app.models.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FormController {

    @GetMapping("/form")
    public String form(Model model){
        model.addAttribute("titulo","Resultado form");
        return  "form";
    }
    @GetMapping("/form")
    public String procesar(Usuario usuario,Model model){

        model.addAttribute("titulo","Resultado form");
        model.addAttribute("usuario",usuario);


        return  "resultado";
    }
}
