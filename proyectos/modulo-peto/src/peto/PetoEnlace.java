package peto;

import core.GemaEnergia;

public class PetoEnlace {

    private GemaEnergia fuenteExterna;

    public PetoEnlace() {
        this(null);
    }

    public PetoEnlace(GemaEnergia fuenteExterna) {
        this.fuenteExterna = fuenteExterna;
    }

    public void setFuenteExterna(GemaEnergia fuenteExterna) {
        this.fuenteExterna = fuenteExterna;
    }

    public boolean escudoActivo() {
        return true;
    }

    public boolean escudoPotenciado() {
        return fuenteExterna != null && fuenteExterna.tieneCarga();
    }
}
