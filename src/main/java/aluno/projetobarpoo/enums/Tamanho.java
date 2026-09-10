package aluno.projetobarpoo.enums;

public enum Tamanho {
    PEQUENO("Pequeno"),
    MEDIO("Médio"),
    GRANDE("Grande");
    private String descricao;
    private Tamanho(String descricao) {
        this.descricao = descricao;
    }
    @Override
    public String toString() {
        return descricao;
    }
}
