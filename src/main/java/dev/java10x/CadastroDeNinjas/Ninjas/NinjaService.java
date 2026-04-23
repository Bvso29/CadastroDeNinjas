package dev.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

//Anotation - camada de serviço
@Service

// Leva a Lógica que serve o Controller
public class NinjaService {

    //    Inicia uma Instância do repositório
    private NinjaRepository ninjaRepository;

    private NinjaMapper ninjaMapper;

    //    Iniciliza a dependencia (Construtor)
    public NinjaService(NinjaRepository ninjaRepository, NinjaMapper ninjaMapper) {
        this.ninjaRepository = ninjaRepository;
        this.ninjaMapper = ninjaMapper;
    }

    //    Lista todos os Ninjas - ultiliza o meto do JPA - vindo do NinjaRepository
    public List<NinjaModel> listarNinjas() {
        return ninjaRepository.findAll();
    }

    //    Lista Ninjas por ID
    public NinjaModel listarNinjasId(long id) {
//        O optional é porque o Ninja pode existir ou não
        Optional<NinjaModel> ninjaId = ninjaRepository.findById(id);
        return ninjaId.orElse(null);
    }

//    Criar nono Ninja
    public NinjaDTO criarNinja(NinjaDTO ninjaDTO){
        NinjaModel ninja = ninjaMapper.map(ninjaDTO);
        ninja = ninjaRepository.save(ninja);
        return ninjaMapper.map(ninja);
    }

//    Alterar Ninja
    public NinjaModel atualizarNinja(Long id, NinjaModel ninjaAtualizado){
        if (ninjaRepository.existsById(id)){
            ninjaAtualizado.setId(id);
            return ninjaRepository.save(ninjaAtualizado);
        }

        return null;
    }

//    Deletar Ninja - Tem que ser VOID
    public void deletarNinjaID(long id){
        ninjaRepository.deleteById(id);
    }
}