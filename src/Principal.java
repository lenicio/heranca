import br.com.zorp.pessoas.Aluno;
import br.com.zorp.pessoas.Professor;

public class Principal {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno();
        Professor professor1 = new Professor();

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
    }
}
