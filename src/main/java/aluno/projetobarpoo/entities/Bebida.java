package aluno.projetobarpoo.entities;

import aluno.projetobarpoo.enums.Temperatura;
import aluno.projetobarpoo.enums.TipoBebida;
import lombok.Data;

@Data
public class Bebida {
    private Long id;
    private String nome;
    private TipoBebida tipoBebida;
    private double volume;
    private double preco;
    private String marca;
    private Temperatura temperatura;
    private String descricao;
}
