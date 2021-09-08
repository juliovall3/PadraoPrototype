import static org.junit.jupiter.api.Assertions.*;

class FuncionarioTest {
    void testClone() throws CloneNotSupportedException {
        Funcionario funcionario = new Funcionario("Julio", "Juiz de Fora", "13027025643", "Solteiro");

        Funcionario funcionarioClone = funcionarioClone();
        funcionarioClone.setNome("mario");
        funcionarioClone.setCpf("12345");

        assertEquals("Julio", "Juiz de Fora", "13027025643","Solteiro");
        assertEquals("mario","Juiz de Fora","12345","Solteiro");
    }
}