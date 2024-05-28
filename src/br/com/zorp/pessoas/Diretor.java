package br.com.zorp.pessoas;

public class Diretor extends Pessoa {
    private String usuario;
    private String senha;

    @Override
    public void apresentar() {
        System.out.printf("""
                %n*******************************************
                DIRETORIA
                Nome: %s
                CPF: %s
                Idade: %d
                Usuario: %s
                Senha: %s
                ********************************************%n
                """, nome, cpf, idade, usuario, senha);
    }


    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        if (usuario.isEmpty()) {
            throw new IllegalArgumentException("O usuário não pode ser nulo!");
        }
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        if (senha.isEmpty()) {
            throw new IllegalArgumentException("A senha não pode ser nula!");
        }
        this.senha = senha;
    }
}
