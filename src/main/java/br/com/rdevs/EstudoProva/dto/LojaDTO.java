package br.com.rdevs.EstudoProva.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LojaDTO {

    private Integer codigo;
    private String logomarca;
    private String cidade;
    private String nome;
}
