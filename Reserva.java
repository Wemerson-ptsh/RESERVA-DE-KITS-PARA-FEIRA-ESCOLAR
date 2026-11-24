public class ReservaKit extends Reserva implements Confirmavel {
    private String kit;
    private boolean confirmada;

    public ReservaKit(int codigo, String responsavel, String status, String kit) {
        super(codigo, responsavel, status);
        this.kit = kit;
        this.confirmada = false;
    }

    public String getKit() {
        return kit;
    }

    public boolean isConfirmada() {
        return confirmada;
    }

    @Override
    public String getTipo() {
        return "Reserva de Kit";
    }

    @Override
    public void confirmar() {
        this.confirmada = true;
    }

    @Override
    public String toString() {
        return super.toString() +
               " | Kit: " + kit +
               " | Confirmada: " + (confirmada ? "Sim" : "Não");
    }
}
