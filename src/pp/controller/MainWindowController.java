package pp.controller;

import java.awt.*;
import java.net.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.datatransfer.StringSelection;
import java.io.IOException;
import java.util.ArrayList;
import pp.views.MainWindow;
import pp.models.Format;

public class MainWindowController implements ActionListener {
    
    private final MainWindow window;

    public MainWindowController(MainWindow window) {
        this.window = window;
        window.getWindowButtons().stream().forEach((button) -> {
            button.addActionListener(this);
        });
        window.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch(e.getActionCommand()){
            case "github":  openInBrowser("https://github.com/Iazzetta/Postprog-Maker"); break;
            case "forum": openInBrowser(""); break;
            case "exit": System.exit(0); break;
            case "clear": clearAll(); break;
            case "build":
                if(!beforeCopy())
                    JOptionPane.showMessageDialog(window, "Preencha todos os campos antes de continuar.");
                else {
                    toClipboard();
                    JOptionPane.showMessageDialog(window, "Conteúdo copiado para o clipboard.");
                }
                break;
        }
    } 
    
    private void clearAll(){
        ArrayList<JTextField> tflist = (ArrayList<JTextField>) window.getTextField(null);
        tflist.stream().forEach((element) -> {
            element.setText("");
        });
        ArrayList<JTextArea> talist = (ArrayList<JTextArea>) window.getTextArea(null);
        talist.stream().forEach((element) -> {
            element.setText("");
        });
    }
    
    private boolean beforeCopy(){
        boolean flag = true;
        ArrayList<JTextField> tflist = (ArrayList<JTextField>) window.getTextField(null);
        for(JTextField element:tflist){
            String content = element.getText();
            if(content == null || content.isEmpty())
                flag = false;
        }
        if(!flag){
            ArrayList<JTextArea> talist = (ArrayList<JTextArea>) window.getTextArea(null);
            for(JTextArea element:talist){
                String content = element.getText();
                if(content == null || content.isEmpty())
                    flag = false;
            }
        }
        return flag;
    }
    
    private void toClipboard(){
        String topic = Format.instance().format(
            (String) window.getTextField("title"),
            (String) window.getTextArea("description"),
            (String) window.getTextArea("source"),
            (String) window.getTextField("download"),
            (String) window.getTextField("scan"),
            (String) window.getTextField("author")
        );
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(
            new StringSelection(topic),
            null
        );
    }
    
    private void openInBrowser(String url){
        try {
            Desktop.getDesktop().browse(new URI(url));
        } catch(URISyntaxException | IOException e){}
    }
}