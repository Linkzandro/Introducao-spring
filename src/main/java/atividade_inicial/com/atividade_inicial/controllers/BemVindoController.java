package atividade_inicial.com.atividade_inicial.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class BemVindoController {
    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/nome/{nome}")
    public String bemVindoNome(@PathVariable("nome") String nome, Model model) {
        model.addAttribute("nome", nome);
        return "bem-vindo-pessoa";
    }
}
