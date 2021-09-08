
public class Funcionario implements Cloneable{
    String nome;
    String cpf;
    String endereco;
    String estadoCivil;

    public Funcionario(String nome,String endereco,String cpf, String estadoCivil){
        this.nome = nome;
        this.cpf = cpf;
        this.estadoCivil = estadoCivil;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public Funcionario setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String getCpf() {
        return cpf;
    }

    public Funcionario setCpf(String cpf) {
        this.cpf = cpf;
        return this;
    }

    public String getEndereco() {
        return endereco;
    }

    public Funcionario setEndereco(String endereco) {
        this.endereco = endereco;
        return this;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public Funcionario setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
        return this;
    }

    public Funcionario clone() throws CloneNotSupportedException{
        Funcionario funcionarioClone = (Funcionario) super.clone();
        return funcionarioClone;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", endereco='" + endereco + '\'' +
                ", estadoCivil='" + estadoCivil + '\'' +
                '}';
    }
}