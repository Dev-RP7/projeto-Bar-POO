package aluno.projetobarpoo.enums;

public enum TipoBebida {
    REFRIGERANTE("Refrigerante"),
    SUCO("Suco"),
    AGUA("Água"),
    CAFE("Café"),
    CHA("Chá"),
    ENERGETICO("Energético"),
    CERVEJA("Cerveja"),
    OUTROS("Outros");
    private String descricao;
    private TipoBebida(String descricao) {
        this.descricao = descricao;
    }
    @Override
    public String toString() {
        return descricao;
    }
}
