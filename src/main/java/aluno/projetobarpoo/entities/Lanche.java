package aluno.projetobarpoo.entities;

import aluno.projetobarpoo.enums.TipoLanche;
import lombok.Data;

@Data
public class Lanche {
    private Long id;
    private String nome;
    private TipoLanche tipoLanche;
    private double volume;
    private double preco;
    private String marca;
    private int quantidade;
    private String descricao;
}
