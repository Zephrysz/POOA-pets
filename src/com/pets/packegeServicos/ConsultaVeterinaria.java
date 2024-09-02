// Singleton Class ConsultaVeterinaria
public class ConsultaVeterinaria implements Servico {
    // Singleton instance
    private static ConsultaVeterinaria instance;

    // Private constructor to prevent instantiation
    private ConsultaVeterinaria() {}

    // Method to get the singleton instance
    public static ConsultaVeterinaria getInstance() {
        if (instance == null) {
            instance = new ConsultaVeterinaria();
        }
        return instance;
    }

    // Implementation of realizarServico method
    @Override
    public void realizarServico() {
        System.out.println("Realizando consulta veterinária...");
    }
}