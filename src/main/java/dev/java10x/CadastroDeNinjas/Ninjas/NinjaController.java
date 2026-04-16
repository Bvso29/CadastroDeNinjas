package dev.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
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
    @GetMapping("/all")
    public String mostrarTodos(){
        return "Mostrar todos os ninjas";
    }

    // Procurar Ninja por ID
    @GetMapping("/allID")
    public String mostrarPorId(){
        return "Mostrar ninjas por ID";
    }

    // Alterar dados dos Ninjas
    @PutMapping("/alterarID")
    public String alterarPorId(){
        return "Alterar ninja";
    }
    // Deletar Ninja
        @DeleteMapping("/deletarID")
    public String deletarNinjaID(){
        return("Ninja Deletado");
    }

}

