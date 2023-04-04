package Modulo13.abstratas;

public class Horista extends Empregados{
    
    private Double precoHora;
    private Double horasTrabalhadas;

    public Double getPrecoHora() {
        return precoHora;
    }
    public void setPrecoHora(Double precoHora) {
        this.precoHora = precoHora;
    }

    public Double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }
    public void setHorasTrabalhadas(Double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }
    
    @Override
    public Double vencimento() {
        return precoHora*horasTrabalhadas;
    }
}
