package MainApp.vistas;

import java.awt.*;
import javax.swing.*;

public class BannerPanel extends JPanel {
    
    public BannerPanel() {
        initUI();
    }

    private void initUI() {
        this.setBackground(new Color(255, 200, 100));
        this.setPreferredSize(new Dimension(600, 100));

        JLabel label = new JLabel("¡Bienvenido a la aplicación!");
        label.setFont(new Font("Arial", Font.BOLD, 24));
        label.setForeground(Color.BLACK);
        this.add(label);
    }
}
