package aluno.projetobarpoo.enums;

public enum TipoLanche {
    PEIXE("Peixe"),
    CALABRESA("Calabresa"),
    HAMBURGUER("Hamburguer"),
    CACHORRO_QUENTE("Cachorro Quente"),
    SALGADO("Salgado"),
    PASTEL("Pastel"),
    BATATA_FRITA("Batata Frita"),
    OUTROS("Outros");
    private String descricao;
    private TipoLanche(String descricao) {
        this.descricao = descricao;
    }
    @Override
    public String toString() {
        return descricao;
    }
}
