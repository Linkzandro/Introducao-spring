package atividade_inicial.com.atividade_inicial.controllers;

import atividade_inicial.com.atividade_inicial.models.Produto;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.server.ResponseStatusException;
import org.springframework.http.HttpStatus;

@RestController
public class ProdutoController {

    public List<Produto> produtos=new ArrayList<>();

    @GetMapping("/produtos")
    public List<Produto> listar(){
        return produtos;
    }

    @GetMapping("/produtos/{id}")
    public Produto detalhes(@PathVariable("id") Long id){
        for (Produto prod : produtos) {
            if (prod.id == id) {
                return prod;
            }
        }
        return new Produto();
    }

    @PostMapping("/produtos")
    public String cadastrar(@RequestBody Produto prod){
        produtos.add((prod));
        return "produto cadastrado com sucesso";
    }

    @PutMapping("/produtos/{id}")
    public String atualizar(@PathVariable("id") Long id,@RequestBody Produto produto){
        for (Produto prod : produtos) {
            if (prod.id == id) {
                prod=produto;
                return "produto atualizado com sucesso";
            }
        }
        return "produto com id "+id+" não existe";
    }

    @DeleteMapping("/produtos/{id}")
    public String deletar(@PathVariable("id") Long id,@RequestBody Produto produto){
        for (Produto prod : produtos) {
            if (prod.id == id) {
                produtos.remove(prod);
                return "produto deletado com sucesso";
            }
        }
        return "produto com id "+id+" não existe";
    }


}
