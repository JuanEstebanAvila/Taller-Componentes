package app;

import armas.EspadaExplorador;
import botas.BotasEnlace;
import casco.CascoHierroSellado;
import casco.CascoRunico;
import casco.ProteccionElemental;
import peto.PetoEnlace;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== PRUEBA FINAL: COMPONENT QUEST ===");

        EspadaExplorador espada = new EspadaExplorador();
        System.out.println("[Ronda 1] Ataque con espada: " + espada.atacar() + " pts");

        BotasEnlace botas = new BotasEnlace();
        PetoEnlace peto = new PetoEnlace(botas);
        System.out.println("[Ronda 2] Con botas  -> escudo activo: " + peto.escudoActivo()
                + " | potenciado: " + peto.escudoPotenciado());
        peto.setFuenteExterna(null); // botas retiradas en combate
        System.out.println("[Ronda 2] Sin botas  -> escudo activo: " + peto.escudoActivo()
                + " | potenciado: " + peto.escudoPotenciado());

        ProteccionElemental hierro = new CascoHierroSellado();
        ProteccionElemental runico = new CascoRunico();
        System.out.println("[Ronda 4] CascoHierroSellado vs FISICO: " + hierro.resistirAtaque("FISICO"));
        System.out.println("[Ronda 4] CascoHierroSellado vs FUEGO : " + hierro.resistirAtaque("FUEGO"));
        System.out.println("[Ronda 4] CascoRunico        vs FUEGO : " + runico.resistirAtaque("FUEGO"));
    }
}
