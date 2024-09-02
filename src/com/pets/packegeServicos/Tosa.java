// Singleton Class Tosa
public class Tosa implements Servico {
    // Singleton instance
    private static Tosa instance;

    // Private constructor to prevent instantiation
    private Tosa() {}

    // Method to get the singleton instance
    public static Tosa getInstance() {
        if (instance == null) {
            instance = new Tosa();
        }
        return instance;
    }

    // Implementation of realizarServico method
    @Override
    public void realizarServico() {
        System.out.println("Realizando tosa...");
    }
}