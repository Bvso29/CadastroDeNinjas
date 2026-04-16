package dev.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

import java.util.List;

//Anotation - camada de Controller
@RestController
//Anotation - Para Mapear Rotas
@RequestMapping("/ninjas")

//Camada mais proxima do usuario - Pouca lógica (lógica fica no service)
public class NinjaController {

    //    Adiciona Ninja Service
    private NinjaService ninjaService;

    //    Iniciliza a dependencia (Construtor)
    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

    @GetMapping("/boas-vindas")
    public String boasVindas() {
        return "Essa é minha primeira rota";
    }

    // Adicinar Ninja
    @PostMapping("/criar")
    public String criarNinja() {
        return "Ninja Criado";
    }

    // Mostar todos os Ninjas
    @GetMapping("/listar")
    public List<NinjaModel> listarNinjas() {
        return ninjaService.listarNinjas();
    }

    // Procurar Ninja por ID
    @GetMapping("/listar/{id}")
    public String mostrarPorId() {
        return "Mostrar ninjas por ID";
    }

    // Alterar dados dos Ninjas
    @PutMapping("/alterar/{id}")
    public String alterarPorId() {
        return "Alterar ninja";
    }

    // Deletar Ninja
    @DeleteMapping("/deletar/{id}")
    public String deletarNinjaID() {
        return ("Ninja Deletado");
    }

}

