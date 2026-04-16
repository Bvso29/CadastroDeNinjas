package dev.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ninjas")
public class NinjaController {

    @GetMapping("/boas-vindas")
    public String boasVindas() {
        return "Essa é minha primeira rota";
    }

    // Adicinar Ninja
    @PostMapping("/criar")
    public String criarNinja(){
        return "Ninja Criado";
    }

    // Mostar todos os Ninjas
    @GetMapping("/listar")
    public String mostrarTodos(){
        return "Mostrar todos os ninjas";
    }

    // Procurar Ninja por ID
    @GetMapping("/listar/{id}")
    public String mostrarPorId(){
        return "Mostrar ninjas por ID";
    }

    // Alterar dados dos Ninjas
    @PutMapping("/alterar/{id}")
    public String alterarPorId(){
        return "Alterar ninja";
    }

    // Deletar Ninja
        @DeleteMapping("/deletar/{id}")
    public String deletarNinjaID(){
        return("Ninja Deletado");
    }

}

