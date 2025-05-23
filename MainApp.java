import javax.swing.*;
import vistas.BannerPanel;

public class MainApp {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Mi Aplicación");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(800, 600);
            frame.setLocationRelativeTo(null);

            // Crear el panelBanner y agregarlo
            BannerPanel panelBanner = new BannerPanel();
            frame.add(panelBanner, BorderLayout.NORTH); // lo pone arriba

            frame.setVisible(true);
        });
    }
}
