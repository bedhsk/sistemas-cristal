package Entidades;

/**
 *
 * @author brian
 */
public class EntidadPedido {
    private int    id;
    private String fechaEntrega;
    private String fechaInicial;
    private String clienteId;
    private float  total;
    private String accesorios;
    private String fechaTallado;
    private String fechaTallado2;
    private int    medidas;

    public EntidadPedido(int id, String fechaEntrega, String fechaInicial, String clienteId, float total, String accesorios, String fechaTallado, String fechaTallado2, int medidas) {
        this.id = id;
        this.fechaEntrega = fechaEntrega;
        this.fechaInicial = fechaInicial;
        this.clienteId = clienteId;
        this.total = total;
        this.accesorios = accesorios;
        this.fechaTallado = fechaTallado;
        this.fechaTallado2 = fechaTallado2;
        this.medidas = medidas;
    }

    public int getId() {
        return id;
    }

    public String getFechaEntrega() {
        return fechaEntrega;
    }

    public String getFechaInicial() {
        return fechaInicial;
    }

    public String getClienteId() {
        return clienteId;
    }

    public float getTotal() {
        return total;
    }

    public String getAccesorios() {
        return accesorios;
    }

    public String getFechaTallado() {
        return fechaTallado;
    }

    public String getFechaTallado2() {
        return fechaTallado2;
    }

    public int getMedidas() {
        return medidas;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFechaEntrega(String fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public void setFechaInicial(String fechaInicial) {
        this.fechaInicial = fechaInicial;
    }

    public void setClienteId(String clienteId) {
        this.clienteId = clienteId;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public void setAccesorios(String accesorios) {
        this.accesorios = accesorios;
    }

    public void setFechaTallado(String fechaTallado) {
        this.fechaTallado = fechaTallado;
    }

    public void setFechaTallado2(String fechaTallado2) {
        this.fechaTallado2 = fechaTallado2;
    }

    public void setMedidas(int medidas) {
        this.medidas = medidas;
    }
}
