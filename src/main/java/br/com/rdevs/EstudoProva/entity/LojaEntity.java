package br.com.rdevs.EstudoProva.entity;

import lombok.Data;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;

@Entity
@Table(name  = "TB_LOJA")
@Data
public class LojaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigo")
    private Integer codigo;

    @Column(name = "logomarca")
    private String logomarca;

    @Column(name = "cidade")
    private String cidade;

    @Column(name = "nome")
    private String nome;

}
