package br.com.zorp.pessoas;
import br.com.zorp.validacoes.Validacao;

public class Pessoa {
    private String nome;
    private String cpf;
    private int idade;

    public void apresentar() {
        System.out.printf("""
                %n*******************************************
                Nome: %s
                CPF: %s
                Idade: %d
                ********************************************%n
                """, nome, cpf, idade);
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        if (nome.isEmpty()) {
            throw new IllegalArgumentException("O campo nome não pode ser nulo!");
        }
        this.nome = nome;
    }


    public String getCpf() {
        return cpf;
    }


    public void setCpf(String cpf) {

        if(!Validacao.validarCPF(cpf)) {
            throw new IllegalArgumentException("O CPF precisa ser válido!");
        }

        this.cpf = cpf;
    }


    public int getIdade() {
        return idade;
    }


    public void setIdade(int idade) {
        if (idade < 0) {
            throw new IllegalArgumentException("A idade não pode ser negativa!");
        }

        this.idade = idade;
    }
}
