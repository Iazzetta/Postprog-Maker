package pgm.start;

import java.awt.EventQueue;
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

public class Principal extends JFrame {

	/**
	 * ID de serialização
	 */
	private static final long serialVersionUID = -409054967456333059L;
	private JPanel contentPane;
	private JTextField txtTitulo;
	private JTextField txtDownload;
	private JTextField txtScan;
	private String postagem;
	private JTextField txtCreditos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Principal() {
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
		
		JTextArea txtDescricao = new JTextArea();
		txtDescricao.setBorder(UIManager.getBorder("TextField.border"));
		txtDescricao.setBounds(10, 144, 854, 96);
		txtDescricao.setCaretPosition(txtDescricao.getDocument().getLength());
		DefaultCaret caret = (DefaultCaret)txtDescricao.getCaret();
		caret.setUpdatePolicy(DefaultCaret.ALWAYS_UPDATE);
		contentPane.add(txtDescricao);
		
		JLabel lblSource = new JLabel("Source");
		lblSource.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblSource.setBounds(400, 251, 61, 19);
		contentPane.add(lblSource);
		
		JTextArea txtSource = new JTextArea();
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
		
		JButton btnNewButton = new JButton("Copiar c\u00F3digo Gerado");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				//Ação do botão Copiar texto gerado.
				
				
				//Pegando os dados dos textField/Area
				String getTitulo = txtTitulo.getText();
				String getDescricao = txtDescricao.getText();
				String getSource = txtSource.getText();
				String getDownload = txtDownload.getText();
				String getScan = txtScan.getText();
				String getCreditos = txtCreditos.getText();
				
				//Definindo os dados dentro das tags do forum Webcheats
				String titulo = "[CENTER][FONT=Impact][SIZE=6][COLOR=\"#808080\"]" + getTitulo + "[/COLOR][/SIZE][/FONT]\n";
				String descricao = "[QUOTE]"+ getDescricao +"[/QUOTE]\n";
				String source = "[SIZE=5][FONT=Impact][COLOR=\"#808080\"]Source[/COLOR][/FONT][/SIZE][/CENTER]\n"
						+ "[PHP]"+ getSource +"[/PHP]\n";
				String downscan = "[QUOTE]\n[B]Download:[/B] [url]"+ getDownload +"[/url]\n[B]Scan:[/B] [url]"+ getScan +"[/url]\n[/QUOTE]\n";
				String creditos = "[RIGHT][B]Créditos[/B] - "+ getCreditos +"[/RIGHT]";
				
				//Introduzindo todos os valores em uma unica variavel.
				postagem = titulo + descricao + source + downscan + creditos;
				
				//Copiando para o clipboard
				StringSelection stringSelection = new StringSelection(postagem);
				Clipboard clpbrd = Toolkit.getDefaultToolkit().getSystemClipboard();
				clpbrd.setContents(stringSelection, null);
				
				
				
				
			}
		});
		btnNewButton.setBounds(468, 623, 193, 31);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Limpar tudo");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Limpando todos os campos
				
				txtTitulo.setText("");
				txtDescricao.setText("");
				txtSource.setText("");
				txtDownload.setText("");
				txtScan.setText("");
				txtCreditos.setText("");
			}
		});
		btnNewButton_1.setBounds(671, 623, 193, 31);
		contentPane.add(btnNewButton_1);
		
		txtCreditos = new JTextField();
		txtCreditos.setBounds(10, 623, 410, 31);
		contentPane.add(txtCreditos);
		txtCreditos.setColumns(10);
		
		JLabel lblCrditos = new JLabel("Cr\u00E9ditos");
		lblCrditos.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCrditos.setBounds(178, 598, 75, 14);
		contentPane.add(lblCrditos);
		
      
	
		
	}
}
