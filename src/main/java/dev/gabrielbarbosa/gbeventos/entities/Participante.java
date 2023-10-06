package dev.gabrielbarbosa.gbeventos.entities;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "tb_participante")
public class Participante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private String email;
    @ManyToMany(mappedBy = "participantes")
    private Set<Atividade> atividades = new HashSet<>();

    public Participante() {
    }

    public Participante(Integer id, String nome, String email, Atividade atividade) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.atividades.add(atividade);
    }

}
