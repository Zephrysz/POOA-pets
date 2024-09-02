// Singleton Class Banho
public class Banho implements Servico {
    // Singleton instance
    private static Banho instance;

    // Private constructor to prevent instantiation
    private Banho() {}

    // Method to get the singleton instance
    public static Banho getInstance() {
        if (instance == null) {
            instance = new Banho();
        }
        return instance;
    }

    // Implementation of realizarServico method
    @Override
    public void realizarServico() {
        System.out.println("Realizando banho...");
    }
}