package Modulo17.Tarefa;

import java.util.ArrayList;
import java.util.List;

public class ListaDeCarrosAPP {
    public static void main(String[] args) {
        List<Tesla> carro = new ArrayList<>();
        Tesla tes = new Tesla();
        tes.setMarca("Marca");
        tes.setMotor("Motor");
        tes.setEletrico("Elétrico");
        tes.setCor("Branca");
        tes.setAutomático("Automático");
        carro.add(tes);
        listaCarro1(carro);

        List<Hillux> carroTracao = new ArrayList<>();
        Hillux hil = new Hillux();
        hil.setMarca("Marca:");
        hil.setMotor("Motor");
        hil.setFlex("Flex");
        hil.setManual("Manual");
        hil.setCor("Prata");

        carroTracao.add(hil);
        listaCarro2(carroTracao);

    }

    private static void listaCarro1(List<? extends Tesla> carro) {
        for (Tesla carroT : carro) {
            System.out.println(carroT.imprimirListaT());
            Tesla.imprimirTesla();
        }
        System.out.println();
    }

    private static void listaCarro2(List<Hillux> carroTracao) {
        for (Hillux carroH : carroTracao) {
            System.out.println(carroH.imprimirListaH());
            Hillux.imprimirHillux();
        }
    }
}
