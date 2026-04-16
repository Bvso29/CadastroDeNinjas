package dev.java10x.CadastroDeNinjas.Missoes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import dev.java10x.CadastroDeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tb_missoes")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MissoesModel {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "rank")
    private String rank;

//    @OneToMany - Uma missão tem vários Ninjas - mappedBy mapeia a coluna
    @OneToMany
//    Interrompe a Serialização de Dado - para nçao entrar em looping quando acessar o listar Ninjas
    @JsonIgnore
    private List<NinjaModel> ninja;

}
