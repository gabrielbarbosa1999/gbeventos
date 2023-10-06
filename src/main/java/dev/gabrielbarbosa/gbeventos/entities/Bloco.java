package dev.gabrielbarbosa.gbeventos.entities;

import jakarta.persistence.*;

import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "tb_bloco")
public class Bloco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant incio;
    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant fim;
    @OneToMany(mappedBy = "bloco")
    private Set<Atividade> atividades = new HashSet<>();

    public Bloco() {
    }

    public Bloco(Integer id, Instant incio, Instant fim, Atividade atividade) {
        this.id = id;
        this.incio = incio;
        this.fim = fim;
        this.atividades.add(atividade);
    }

}
