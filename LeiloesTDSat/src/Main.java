
public class Main {
     public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                // Abrir a tela de cadastroVIEW como principal
                new cadastroVIEW().setVisible(true);
            }
        });
    }
}
