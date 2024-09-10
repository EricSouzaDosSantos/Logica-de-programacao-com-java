package Examples;

import java.util.UUID;

public class Senai {
    private UUID matricula;
    private String nome;
    private String curso;
    private char sexo;
    private int nota1;
    private int nota2;
    private int nota3;

    Senai(String nome, String curso) {
        this.matricula = UUID.randomUUID();
        this.nome = nome;
        this.curso = curso;
    }

    public Senai() {
        this.matricula = UUID.randomUUID();
    }

    public int Soma(){
        int soma = nota1 + nota2 + nota3;
        return soma;
    }

    public int getNota1() {
        return nota1;
    }

    public void setNota1(int nota1) {
        this.nota1 = nota1;
    }

    public int getNota2() {
        return nota2;
    }

    public void setNota2(int nota2) {
        this.nota2 = nota2;
    }

    public UUID getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getNota3() {
        return nota3;
    }

    public void setNota3(int nota3) {
        this.nota3 = nota3;
    }
}
