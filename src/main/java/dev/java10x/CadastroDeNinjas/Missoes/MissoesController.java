package dev.java10x.CadastroDeNinjas.Missoes;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/missoes")

public class MissoesController {

    @GetMapping("/listar")
    public String mostrarMissao(){
        return "Mostrar Missões";
    }

    @GetMapping("/listar/{id}")
    public String mostrarMissaoID(){
        return "Mostrar Missão por ID";
    }

    @PostMapping("/criar")
    public String criarMissao(){
        return "Missão Criada";
    }

    @PutMapping("/{id}/alterar")
    public String alterarMissao(){
        return "Alterar Missão";
    }

    @DeleteMapping("/{id}/excluir")
    public String deletarMissaoId(){
        return "Missao Deletada";
    }
}