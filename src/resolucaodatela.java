import java.awt.*;

public class resolucaodatela {
    public static void main(String[] args) {
        Toolkit display = Toolkit.getDefaultToolkit();

        Dimension d = display.getScreenSize();

        System.out.println("Aresolução da tela é " + d.width + "x" + d.height);
    }
}