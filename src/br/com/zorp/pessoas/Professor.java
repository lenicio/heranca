package br.com.zorp.pessoas;

public class Professor extends Pessoa{
    private String departamento;


    @Override
    public void apresentar() {
        System.out.printf("""
                %n*******************************************
                Nome: %s
                CPF: %s
                Idade: %d
                Departamento: %s
                ********************************************%n
                """, nome, cpf, idade, departamento);
    }

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
