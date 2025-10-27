package dev.java10x.CadastroDeNinjas.Ninjas;

import dev.java10x.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// Atra´ves da dependencia JPA - Faço da classe uma entidade (JPA JAVA PERSISTENCE API)
@Entity
//Crio tabela
@Table(name = "tb_cadastro_de_ninja")
@Data // Cria o Getter e Setter - Lombock
@NoArgsConstructor // Cria o Construtor sem argumento - Lombock
@AllArgsConstructor // Cria o Construtor com todos argumento - Lombock
public class NinjaModel {

    @Id
//    Valores de incrementação
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

//    Para colunas que são Sensiveis e Unicos
    @Column(unique = true)
    private String email;

    private int idade;

//    @ManyToOne - um ninja tem uma Unica Missão
    @ManyToOne
//    Adiciona uma coluna com Missoes_id FK
    @JoinColumn(name = "missoes_id") // Foreing Key / Chave Estrangeira
    private MissoesModel missoes;

}
