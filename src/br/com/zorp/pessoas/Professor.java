package br.com.zorp.pessoas;

public class Professor extends Pessoa{
    private String departamento;

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        if (departamento.isEmpty()) {
            throw new IllegalArgumentException("O departamento não pode ser nulo!");
        }

        this.departamento = departamento;
    }
}
