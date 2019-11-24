package com.Uber.UberBasico.Request;

public class ClientAddress {

    private Long latitudeOrigen;
    private Long LongitudOrigen;
    private Long latitudeDestino;
    private Long longitudDestino;

    public Long getLatitudeOrigen() {
        return latitudeOrigen;
    }

    public void setLatitudeOrigen(Long latitudeOrigen) {
        this.latitudeOrigen = latitudeOrigen;
    }

    public Long getLongitudOrigen() {
        return LongitudOrigen;
    }

    public void setLongitudOrigen(Long longitudOrigen) {
        LongitudOrigen = longitudOrigen;
    }

    public Long getLatitudeDestino() {
        return latitudeDestino;
    }

    public void setLatitudeDestino(Long latitudeDestino) {
        this.latitudeDestino = latitudeDestino;
    }

    public Long getLongitudDestino() {
        return longitudDestino;
    }

    public void setLongitudDestino(Long longitudDestino) {
        this.longitudDestino = longitudDestino;
    }
}

