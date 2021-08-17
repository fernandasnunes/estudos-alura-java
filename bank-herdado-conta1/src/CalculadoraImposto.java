public class CalculadoraImposto {

    private double totalImposto;
    // todos os métodos que assinaram a interface conseguem usar esse método, ou seja todos os métodos que deram implement no tributavel.
    public void registra(Tributavel t){

        double valor = t.getValorImposto();
       this.totalImposto+= valor;
    }

    public double getTotalImposto() {
        return totalImposto;
    }
}
