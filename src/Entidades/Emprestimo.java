package Entidades;
import java.time.LocalDate;

public class Emprestimo {
    User usuario;
    Livro livro;
    LocalDate dataEmprestimo;
    LocalDate dataDevolucao;
    boolean devolvido;


    Emprestimo(){

    }
    Emprestimo(User usuario, Livro livro, LocalDate dataEmprestimo, LocalDate dataDevolcao, boolean devolvido){
        this.usuario = usuario;
        this.livro = livro;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolcao;
        this.devolvido = devolvido;
    }


}
