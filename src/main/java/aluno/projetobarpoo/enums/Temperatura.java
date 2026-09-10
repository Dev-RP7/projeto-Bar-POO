package aluno.projetobarpoo.enums;

public enum Temperatura {
    GELADA("Gelada"),
    QUENTE("Quente"),
    NATURAL("Natural");
    private String descricao;
    private Temperatura(String descricao) {
        this.descricao = descricao;
    }
    @Override
    public String toString() {
        return descricao;
    }
}
