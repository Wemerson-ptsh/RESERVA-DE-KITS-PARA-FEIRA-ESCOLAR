import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<ReservaKit> reservas = new ArrayList<>();

        // CREATE - Cadastrar pelo menos duas reservas
        ReservaKit r1 = new ReservaKit(201, "Ana", "Pendente", "Kit de robótica 01");
        ReservaKit r2 = new ReservaKit(202, "Carlos", "Pendente", "Kit de sensores");
        reservas.add(r1);
        reservas.add(r2);

        // READ - Listar as reservas iniciais
        System.out.println("=== RESERVAS CADASTRADAS ===");
        for (ReservaKit r : reservas) {
            System.out.println(r);
        }

        // UPDATE + Confirmação via interface
        r1.setStatus("Aprovada");
        r1.confirmar();

        // DELETE - Remover uma reserva pelo código
        int codigoRemover = 202;
        reservas.removeIf(r -> r.getCodigo() == codigoRemover);

        // READ - Listagem final
        System.out.println("\n=== RESULTADO FINAL ===");
        for (ReservaKit r : reservas) {
            System.out.println(r);
        }
    }
}
