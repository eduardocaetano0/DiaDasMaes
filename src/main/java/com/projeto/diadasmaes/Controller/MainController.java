package com.projeto.diadasmaes.Controller;

import com.projeto.diadasmaes.Controller.Services.MaeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
    
    @Autowired
    private MaeService maeService;
    
    @RequestMapping("/")
    public String index() {
        return "index";
    }
    
    @PostMapping("/msg")
    public String mae(@RequestParam("nome") String nome, Model model) {
        System.out.println("Recebendo nome para salvar: " + nome);
        maeService.salvarNome(nome);
        model.addAttribute("mensagem", "Nome salvo com sucesso!");
        return "mae";
    }

    @RequestMapping("/mae")
    public String maeEscolhida(Model model) {
        return "mae";
    }

}