package ads.seg.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/") //essa classe na raiz para interceptar os pedidos na url
public class OlaController {

    @GetMapping//req hhtp vai emitir esse metodo
    public String OlaMundo(){
        return "Ola Mundo";
    }


}

