package pkgProfessorAbstrato;

public abstract class ProfessorAbstrato {

    protected String nome;
    protected String matricula;
    protected int idade;

    public ProfessorAbstrato(String n, String m, int i) {
        nome = n;
        matricula = m;
        idade = i;
    }
    //Imprime os dados
    public String imprimeDados() {

        return "Nome= " + nome + "\nMatrícula: " + matricula + "\nIdade: " + idade;
    }

    public abstract double retornaSalario();

}