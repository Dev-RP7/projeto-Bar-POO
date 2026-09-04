module aluno.projetobarpoo {
    requires javafx.controls;
    requires javafx.fxml;


    opens aluno.projetobarpoo to javafx.fxml;
    exports aluno.projetobarpoo;
}