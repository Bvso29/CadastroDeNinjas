package dev.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.stereotype.Service;

import java.util.List;

//Anotation - camada de serviço
@Service

// Leva a Lógica que serve o Controller
public class NinjaService {

//    Inicia uma Instância do repositório
    private NinjaRepository ninjaRepository;

//    Iniciliza a dependencia (Construtor)
    public NinjaService(NinjaRepository ninjaRepository) {
        this.ninjaRepository = ninjaRepository;
    }

//    Lista todos os Ninjas - ultiliza o meto do JPA - vindo do NinjaRepository
    public List<NinjaModel> listarNinjas(){
        return ninjaRepository.findAll();

    }
}
