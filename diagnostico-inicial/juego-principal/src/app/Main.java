package app;

import armas.EspadaExplorador;
import casco.CascoHierroSellado;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== PRUEBA INICIAL: COMPONENT QUEST ===");
        EspadaExplorador espada = new EspadaExplorador();
        System.out.println("Ataque con espada: " + espada.atacar() + " pts");
        CascoHierroSellado casco = new CascoHierroSellado();
        System.out.println("Defensa del casco: " + casco.resistirAtaque("FUEGO"));
    }
}
