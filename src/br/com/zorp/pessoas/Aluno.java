package br.com.zorp.pessoas;

public class Aluno extends Pessoa{
    private String matricula;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        if (matricula.isEmpty()) {
            throw new IllegalArgumentException("Matricula não pode ser nula!");
        }
        this.matricula = matricula;
    }
}
