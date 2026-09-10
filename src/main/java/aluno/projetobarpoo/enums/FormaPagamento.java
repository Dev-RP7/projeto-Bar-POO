package aluno.projetobarpoo.enums;

public enum FormaPagamento {
    CARTAO_CREDITO("Crédito"),
    CARTAO_DEBITO("Débito"),
    DINHEIRO("Dinheiro"),
    PIX("Pix"),
    VOUCHER("Voucher");
    private String descricao;
    private FormaPagamento(String descricao) {
        this.descricao = descricao;
    }
    @Override
    public String toString() {
        return descricao;
    }
}
