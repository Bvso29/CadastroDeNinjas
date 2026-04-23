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
//    Precisa do RequestBody pq no corpo da requisição ele envia um JSON
    public NinjaModel criarNinja(@RequestBody NinjaModel ninja) {
        return ninjaService.criarNinja(ninja);
    }

    // Mostar todos os Ninjas
    @GetMapping("/listar")
    public List<NinjaModel> listarNinjas() {
        return ninjaService.listarNinjas();
    }

    // Procurar Ninja por ID
    @GetMapping("/listar/{id}")
//    Precisa do PathVariable pq é uma variavel de caminhio (ID)
    public NinjaModel mostrarPorId(@PathVariable long id) {
        return ninjaService.listarNinjasId(id);
    }

    // Alterar dados dos Ninjas
    @PutMapping("/alterar/{id}")
    public NinjaModel alterarPorId(@PathVariable Long id , @RequestBody NinjaModel ninjaAtualizado) {
        return ninjaService.atualizarNinja(id, ninjaAtualizado);
    }

    // Deletar Ninja
    @DeleteMapping("/deletar/{id}")
    public void deletarNinjaID(@PathVariable Long id) {
        ninjaService.deletarNinjaID(id);
    }

}
