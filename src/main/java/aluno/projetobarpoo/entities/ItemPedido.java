package aluno.projetobarpoo.entities;

import lombok.Data;

@Data
public class ItemPedido {
    private Long id;
    private Pedido pedido;
    private int quantidade;
    private Lanche lancha;
    private Bebida bebida;
    private double preco;

    public double getTotal(){
        return quantidade * preco;
    }
}
