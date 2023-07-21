package com.example.BibliotecaWeb.Controllers;

import com.example.BibliotecaWeb.Models.Categoria;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CategoriaController {

    private List<Categoria> lista = new ArrayList<Categoria>();
    @ModelAttribute("categorias")
    public List<Categoria> getLista(){
            return this.lista;
        }
    @GetMapping("/listarCategorias")
        public String listarCategorias(){
        return "lista_categorias";
    }
    @GetMapping("/categoria")
    public String exibirCategoria() {
        return "cadastrar_categoria";
    }
//    @PostMapping("/salvarCategoria")
//    public String cadastrarCategoria(Integer codigo, String nome){
//        System.out.println("Cod: " + codigo + " , nome: " + nome);
//        return "index";
//    }
    @PostMapping("/salvarCategoriaObj")
    public String cadastrarCategoria(Categoria categoria){
        this.lista.add(categoria);
        System.out.println(categoria);
        return "index";
    }

}
