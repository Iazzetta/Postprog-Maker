package pp.controller;

import java.awt.*;
import java.net.*;
import javax.swing.*;

import java.awt.event.*;
import java.awt.datatransfer.StringSelection;

import java.io.IOException;

import pp.views.MainWindow;
import pp.models.Format;

public class MainWindowController implements ActionListener {
    
    private final MainWindow window;

    public MainWindowController(MainWindow window) {
        this.window = window;
        
        window.getWindowButtons().forEach(button -> {
            button.addActionListener(this);
        });

        window.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch(e.getActionCommand()){
            case "github":  openInBrowser("https://github.com/Iazzetta/Postprog-Maker"); break;
            case "forum": openInBrowser("http://www.webcheats.com.br/categories/programa%C3%A7%C3%A3o-zone.60/"); break;
            case "exit": System.exit(0); break;
            case "clear": clearAll(); break;
            case "build":
                if(hasNullOrEmptyFields())
                    JOptionPane.showMessageDialog(window, "Preencha todos os campos antes de continuar.");
                else {
                    toClipboard();
                    JOptionPane.showMessageDialog(window, "Conteúdo copiado para o clipboard.");
                }
                break;
        }
    } 
    
    private void clearAll(){ 
        window.getAllTextFields().forEach(textfield -> {
            textfield.setText("");
        });
        
        window.getAllTextAreas().forEach(textarea -> {
            textarea.setText("");
        });
    }
    
    private boolean hasNullOrEmptyFields(){
        boolean hasEmptyOrNull = window.getAllTextFields().stream()
                                       .anyMatch(tf -> tf.getText() == null || tf.getText().isEmpty());
        
        if(!hasEmptyOrNull)
            window.getAllTextAreas().stream()
                  .anyMatch(ta -> ta.getText() == null || ta.getText().isEmpty());
        
        
        return hasEmptyOrNull;
    }
    
    private void toClipboard(){
        String topic = Format.instance().format(
            window.getTextFieldContent("title"),
            window.getTextAreaContent("description"),
            window.getTextAreaContent("source"),
            window.getTextFieldContent("download"),
            window.getTextFieldContent("scan"),
            window.getTextFieldContent("author")
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