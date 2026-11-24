public abstract class Reserva {
    private int codigo;
    private String responsavel;
    private String status;

    public Reserva(int codigo, String responsavel, String status) {
        this.codigo = codigo;
        this.responsavel = responsavel;
        this.status = status;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public abstract String getTipo();

    @Override
    public String toString() {
        return "Código: " + codigo +
               " | Tipo: " + getTipo() +
               " | Responsável: " + responsavel +
               " | Status: " + status;
    }
}
