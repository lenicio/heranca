// Adicione a classe Diretor, que herde os atributos de pessoa, e que tenha os atributos
// login e senha. Crie os métodos getters e setters dos atributos, e na classe main
// crie um objeto diretor1, inserindo os parametros para teste.
// Subscreva o método apresentar(), exibindo o nome DIRETORIA antes dos campos.

import br.com.zorp.pessoas.Aluno;
import br.com.zorp.pessoas.Diretor;
import br.com.zorp.pessoas.Professor;

public class Principal {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno();
        Professor professor1 = new Professor();
        Diretor diretor1 = new Diretor();

        aluno1.setNome("Pedro");
        aluno1.setCpf("67827775098");
        aluno1.setIdade(17);
        aluno1.setMatricula("2311010");
        aluno1.apresentar();

        professor1.setNome("Lenício Jr");
        professor1.setCpf("51116272008");
        professor1.setIdade(27);
        professor1.setDepartamento("Computação");
        professor1.apresentar();

        diretor1.setNome("Diretora Luana");
        diretor1.setCpf("51116272008");
        diretor1.setIdade(27);
        diretor1.setUsuario("luana@zorp.tech");
        diretor1.setSenha("101010");
        diretor1.apresentar();
    }
}
