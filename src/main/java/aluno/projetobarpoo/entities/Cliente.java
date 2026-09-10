package aluno.projetobarpoo.entities;
import lombok.Data;
import java.time.LocalDate;

@Data
public class Cliente {
    private long id;
    private String nome;
    private String telefone;
    private String endereco;
    private LocalDate nascimento;
    private String cpf;
}
