package br.com.fatec.ninjas.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Entity
@Table(name = "cla")
public class Cla {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_cla;

    @Column(name = "nome_cla", nullable = false, unique = true)
    @NotBlank(message = "Nome é obrigatório")
    @Size(min = 3, max = 50, message = "Nome deve ter entre 3 e 50 caracteres")
    private String nome;

    @Column(name = "descricao_cla", nullable = false)
    @NotBlank(message = "Descrição é obrigatória")
    @Size(min = 3, max = 255, message = "Descrição deve ter entre 3 e 255 caracteres")
    private String descricao;

    @Column(name = "habilidade_cla", nullable = false)
    @NotBlank(message = "Habilidade é obrigatória")
    @Size(min = 3, max = 100, message = "Habilidade deve ter entre 3 e 100 caracteres")
    private String habilidade;
}
