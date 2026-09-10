package aluno.projetobarpoo.entities;

import aluno.projetobarpoo.enums.FormaPagamento;
import lombok.Data;
import java.time.LocalDate;
import java.util.List;

@Data
public class Pedido {
    private Long numeroPedido;
    private Cliente cliente;
    private LocalDate prazoPedido;
    private LocalDate data;
    private FormaPagamento pagamento;
    private List<ItemPedido> itens;

    public double getTotal(){
        double total = 0;
        for (ItemPedido item : itens){
            total += item.getTotal();
        }
        return total;
    }
}
