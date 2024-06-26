package br.com.ibmec.cloud.cargallery.models;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
import java.util.UUID;

@Data
@Entity
public class Carro {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column
    private String nome;

    @Column
    private String descricao;

    @Column
    private String imagem;

    @Column
    private Double preco;

    @ManyToOne()
    @JsonIgnore
    private Marca marca;

}
