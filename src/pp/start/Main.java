package pp.start;

import java.awt.EventQueue;
import pp.controller.MainWindowController;
import pp.views.MainWindow;

public class Main {
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            new MainWindowController(new MainWindow());
        });
    }
}