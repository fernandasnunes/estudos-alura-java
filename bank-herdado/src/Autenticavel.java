// poderia ter usado o método de autenticação dentro da classe funcionário, mas designer e editores poderiam se autenticar também.
// faz sentido instanciar funcionario autenticavel? Não! Por isso ela será abstrata
// CLasses abstradas não são obrigadas a implementar métodos abstratos, por isso não preciso rescrever o método de boniticação.
public abstract class FuncionarioAutenticavel extends Funcionario {

    private int senha;

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public boolean autentica(int senha){
        if(this.senha == senha){
            return true;
        }
        else {
            return false;
        }
    }

}
