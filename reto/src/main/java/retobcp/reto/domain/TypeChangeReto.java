package retobcp.reto.domain;

public class TypeChangeReto {
    private Integer origen;
    private Integer destino;
    private Double montoCambio;
    private Double montoOrigen;
    private Double montoDestino;
    private String tipoOrigen;
    private String tipoDestino;
    private Double monto;

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    public String getTipoOrigen() {
        return tipoOrigen;
    }

    public void setTipoOrigen(String tipoOrigen) {
        this.tipoOrigen = tipoOrigen;
    }

    public String getTipoDestino() {
        return tipoDestino;
    }

    public void setTipoDestino(String tipoDestino) {
        this.tipoDestino = tipoDestino;
    }

    public Integer getOrigen() {
        return origen;
    }

    public void setOrigen(Integer origen) {
        this.origen = origen;
    }

    public Integer getDestino() {
        return destino;
    }

    public void setDestino(Integer destino) {
        this.destino = destino;
    }

    public Double getMontoCambio() {
        return montoCambio;
    }

    public void setMontoCambio(Double montoCambio) {
        this.montoCambio = montoCambio;
    }

    public Double getMontoOrigen() {
        return montoOrigen;
    }

    public void setMontoOrigen(Double montoOrigen) {
        this.montoOrigen = montoOrigen;
    }

    public Double getMontoDestino() {
        return montoDestino;
    }

    public void setMontoDestino(Double montoDestino) {
        this.montoDestino = montoDestino;
    }

    public Double getTipoCambioDestino() {
        return tipoCambioDestino;
    }

    public void setTipoCambioDestino(Double tipoCambioDestino) {
        this.tipoCambioDestino = tipoCambioDestino;
    }

    private Double tipoCambioDestino;

}
