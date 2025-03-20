package MainWindow;

import com.formdev.flatlaf.FlatIntelliJLaf;
import igu.NotaCalcularGUI;

public class MainNota {

  public static void main(String[] args) {
    // TODO code application logic here
  FlatIntelliJLaf.setup();
  
  NotaCalcularGUI Window = new NotaCalcularGUI();
  Window.setVisible(true);
  Window.setLocationRelativeTo(null);
  Window.setResizable(false);
  Window.setTitle("Notas");
  
  }
}
