package pgm.start;

import java.awt.Component;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.text.DefaultCaret;
import java.awt.Rectangle;
import java.util.ArrayList;

public class Window extends JFrame {

    /**
     * ID de serializa��o
     */
    private static final long serialVersionUID = -409054967456333059L;
    private final JPanel contentPane;
    private JTextField txtTitulo, txtDownload, txtScan, txtCreditos;
    private String postagem;
    private final JButton btnNewButton, btnClear;
    private final JTextArea txtSource, txtDescricao;

    /**
     * Create the frame.
     */
    public Window() {
        setBounds(new Rectangle(10, 500, 0, 0));
        setTitle("Postprog Maker ~ Webcheats");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 890, 704);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(null);
        setLocationRelativeTo(null);
        setContentPane(contentPane);

        txtTitulo = new JTextField();
        txtTitulo.setBounds(10, 72, 854, 31);
        contentPane.add(txtTitulo);
        txtTitulo.setColumns(10);

        JLabel lblNewLabel = new JLabel("T\u00EDtulo Postagem");
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblNewLabel.setBounds(374, 42, 111, 19);
        contentPane.add(lblNewLabel);

        JLabel lblDescrioPost = new JLabel("Descri\u00E7\u00E3o Postagem");
        lblDescrioPost.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblDescrioPost.setBounds(363, 114, 142, 19);
        contentPane.add(lblDescrioPost);

        txtDescricao = new JTextArea();
        txtDescricao.setBorder(UIManager.getBorder("TextField.border"));
        txtDescricao.setBounds(10, 144, 854, 96);
        txtDescricao.setCaretPosition(txtDescricao.getDocument().getLength());
        DefaultCaret caret = (DefaultCaret) txtDescricao.getCaret();
        caret.setUpdatePolicy(DefaultCaret.ALWAYS_UPDATE);
        contentPane.add(txtDescricao);

        JLabel lblSource = new JLabel("Source");
        lblSource.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblSource.setBounds(400, 251, 61, 19);
        contentPane.add(lblSource);

        txtSource = new JTextArea();
        txtSource.setBorder(UIManager.getBorder("TextField.border"));
        txtSource.setBounds(10, 281, 854, 225);
        contentPane.add(txtSource);

        JLabel lblDownload = new JLabel("Download");
        lblDownload.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblDownload.setBounds(178, 517, 75, 14);
        contentPane.add(lblDownload);

        txtDownload = new JTextField();
        txtDownload.setBounds(10, 542, 410, 37);
        contentPane.add(txtDownload);
        txtDownload.setColumns(10);

        JLabel lblScan = new JLabel("Scan");
        lblScan.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblScan.setBounds(630, 517, 46, 14);
        contentPane.add(lblScan);

        txtScan = new JTextField();
        txtScan.setBounds(430, 542, 434, 37);
        contentPane.add(txtScan);
        txtScan.setColumns(10);

        btnNewButton = new JButton("Copiar c\u00F3digo Gerado");
        btnNewButton.setActionCommand("copy");
        btnNewButton.setBounds(468, 623, 193, 31);
        contentPane.add(btnNewButton);

        btnClear = new JButton("Limpar tudo");
        btnClear.setActionCommand("clear");
        btnClear.setBounds(671, 623, 193, 31);
        contentPane.add(btnClear);

        txtCreditos = new JTextField();
        txtCreditos.setBounds(10, 623, 410, 31);
        contentPane.add(txtCreditos);
        txtCreditos.setColumns(10);

        JLabel lblCrditos = new JLabel("Cr\u00E9ditos");
        lblCrditos.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblCrditos.setBounds(178, 598, 75, 14);
        contentPane.add(lblCrditos);
    }

    public JTextField getTxtTitulo() {
        return txtTitulo;
    }

    public JTextField getTxtDownload() {
        return txtDownload;
    }

    public JTextField getTxtScan() {
        return txtScan;
    }

    public JTextField getTxtCreditos() {
        return txtCreditos;
    }

    public JTextArea getTxtSource() {
        return txtSource;
    }

    public JTextArea getTxtDescricao() {
        return txtDescricao;
    }
    
    public ArrayList<JButton> getWindowButtons(){
        ArrayList<JButton> btns = new ArrayList<>();
        btns.add(btnClear); btns.add(btnNewButton);
        return btns;
    }
    
    public ArrayList<JTextField> getWindowTextFields(){
        ArrayList<JTextField> tfs = new ArrayList<>();
        tfs.add(txtScan);
        tfs.add(txtTitulo);
        tfs.add(txtDownload);
        tfs.add(txtCreditos);
        return tfs;
    }
}
