module aluno.projetobarpoo {
    requires javafx.controls;
    requires javafx.fxml;
    requires static lombok;


    opens aluno.projetobarpoo to javafx.fxml;
    exports aluno.projetobarpoo;
}