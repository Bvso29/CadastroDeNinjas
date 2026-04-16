package dev.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.data.jpa.repository.JpaRepository;

// repositório se conecta com o Banco de Dados
//O repositório extende o JPA que traz as querys em formas de METODOS
public interface NinjaRepository extends JpaRepository<NinjaModel, Long> {

}
