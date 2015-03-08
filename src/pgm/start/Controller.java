package pgm.start;

import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.nio.charset.Charset;

public class Controller implements ActionListener {
    
    private final Window window;

    public Controller(Window window){
        this.window = window;
        window.getWindowButtons().stream().forEach((each) -> {
            each.addActionListener(this);
        });
        window.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch(e.getActionCommand()){
            case "clear": clearTextFields();
                break;
            case "new": toClipboard();
                break;
        }
    }
    
    private void clearTextFields(){
        window.getWindowTextFields().stream().forEach((each) -> {
            each.setText("");
        });
    }
    
    private void toClipboard(){
        String topic = Format.instance().format(
            window.getTxtTitulo().getText(),
            window.getTxtDescricao().getText(),
            window.getTxtSource().getText(),
            window.getTxtDownload().getText(),
            window.getTxtScan().getText(),
            window.getTxtCreditos().getText()
        );
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(
            null,
            new StringSelection(topic));
    }
}