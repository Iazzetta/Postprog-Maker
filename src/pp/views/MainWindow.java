package pp.views;

import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class MainWindow extends javax.swing.JFrame {

    public MainWindow() { 
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {}
        
        initComponents();
        setLocationRelativeTo(null);
    }
    
    public String tooltip(String tooltip){
        return "<html><p style=\"padding:0;margin:0;color:#FFFFFF;background:#9966FF\">" + tooltip + "</p></html>";
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scenepanel = new javax.swing.JPanel();
        toppanel = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        contentpanel = new javax.swing.JPanel();
        textTitle = new javax.swing.JTextField();
        lblOutputTitle = new javax.swing.JLabel();
        textAuthor = new javax.swing.JTextField();
        lblOutputAuthor = new javax.swing.JLabel();
        scrollDescription = new javax.swing.JScrollPane();
        textDescription = new javax.swing.JTextArea();
        lblOutputDescription = new javax.swing.JLabel();
        scrollSource = new javax.swing.JScrollPane();
        textSource = new javax.swing.JTextArea();
        lblOuputSource = new javax.swing.JLabel();
        textDownload = new javax.swing.JTextField();
        lblOutputDownload = new javax.swing.JLabel();
        textScan = new javax.swing.JTextField();
        lblOuputScan = new javax.swing.JLabel();
        btnBuild = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnProgrammingArea = new javax.swing.JButton();
        btnGithub = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        toppanel.setBackground(new java.awt.Color(102, 102, 102));

        lblTitle.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setText("PostprogMaker");

        btnExit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 255, 255));
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pp/views/icons/exit.png"))); // NOI18N
        btnExit.setText("sair  ");
        btnExit.setActionCommand("exit");
        btnExit.setContentAreaFilled(false);
        btnExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExit.setFocusable(false);
        btnExit.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        javax.swing.GroupLayout toppanelLayout = new javax.swing.GroupLayout(toppanel);
        toppanel.setLayout(toppanelLayout);
        toppanelLayout.setHorizontalGroup(
            toppanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(toppanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnExit)
                .addContainerGap())
        );
        toppanelLayout.setVerticalGroup(
            toppanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(toppanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(toppanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnExit)
                    .addComponent(lblTitle))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        contentpanel.setBackground(new java.awt.Color(255, 255, 255));
        contentpanel.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 4, 4, 4, new java.awt.Color(102, 102, 102)));

        textTitle.setForeground(new java.awt.Color(102, 102, 102));
        textTitle.setToolTipText("Título ou nome do programa");
        textTitle.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)), javax.swing.BorderFactory.createEmptyBorder(1, 4, 1, 4)));

        lblOutputTitle.setForeground(new java.awt.Color(102, 102, 102));
        lblOutputTitle.setText("Título da postagem");

        textAuthor.setForeground(new java.awt.Color(102, 102, 102));
        textAuthor.setToolTipText("Título ou nome do programa");
        textAuthor.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)), javax.swing.BorderFactory.createEmptyBorder(1, 4, 1, 4)));

        lblOutputAuthor.setForeground(new java.awt.Color(102, 102, 102));
        lblOutputAuthor.setText("Autor (créditos)");

        scrollDescription.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        textDescription.setColumns(20);
        textDescription.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        textDescription.setForeground(new java.awt.Color(102, 102, 102));
        textDescription.setLineWrap(true);
        textDescription.setRows(5);
        textDescription.setWrapStyleWord(true);
        textDescription.setBorder(javax.swing.BorderFactory.createEmptyBorder(4, 4, 4, 4));
        scrollDescription.setViewportView(textDescription);

        lblOutputDescription.setForeground(new java.awt.Color(102, 102, 102));
        lblOutputDescription.setText("Descrição");

        scrollSource.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        textSource.setColumns(20);
        textSource.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        textSource.setForeground(new java.awt.Color(102, 102, 102));
        textSource.setLineWrap(true);
        textSource.setRows(5);
        textSource.setWrapStyleWord(true);
        textSource.setBorder(javax.swing.BorderFactory.createEmptyBorder(4, 4, 4, 4));
        scrollSource.setViewportView(textSource);

        lblOuputSource.setForeground(new java.awt.Color(102, 102, 102));
        lblOuputSource.setText("Código fonte");

        textDownload.setForeground(new java.awt.Color(102, 102, 102));
        textDownload.setToolTipText("Título ou nome do programa");
        textDownload.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)), javax.swing.BorderFactory.createEmptyBorder(1, 4, 1, 4)));

        lblOutputDownload.setForeground(new java.awt.Color(102, 102, 102));
        lblOutputDownload.setText("Link de download");

        textScan.setForeground(new java.awt.Color(102, 102, 102));
        textScan.setToolTipText("Título ou nome do programa");
        textScan.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)), javax.swing.BorderFactory.createEmptyBorder(1, 4, 1, 4)));

        lblOuputScan.setForeground(new java.awt.Color(102, 102, 102));
        lblOuputScan.setText("Link de scan");

        btnBuild.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnBuild.setForeground(new java.awt.Color(102, 102, 102));
        btnBuild.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pp/views/icons/build.png"))); // NOI18N
        btnBuild.setText("Gerar");
        btnBuild.setActionCommand("build");
        btnBuild.setBorder(null);
        btnBuild.setContentAreaFilled(false);
        btnBuild.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuild.setFocusable(false);

        btnClear.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnClear.setForeground(new java.awt.Color(102, 102, 102));
        btnClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pp/views/icons/clear.png"))); // NOI18N
        btnClear.setText("Limpar ");
        btnClear.setActionCommand("clear");
        btnClear.setBorder(null);
        btnClear.setContentAreaFilled(false);
        btnClear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClear.setFocusable(false);

        btnProgrammingArea.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnProgrammingArea.setForeground(new java.awt.Color(255, 255, 255));
        btnProgrammingArea.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pp/views/icons/computer.png"))); // NOI18N
        btnProgrammingArea.setToolTipText("");
        btnProgrammingArea.setActionCommand("forum");
        btnProgrammingArea.setContentAreaFilled(false);
        btnProgrammingArea.setToolTipText(tooltip("Acessar a área de programação do fórum."));
        btnProgrammingArea.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProgrammingArea.setFocusable(false);
        btnProgrammingArea.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        btnGithub.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnGithub.setForeground(new java.awt.Color(255, 255, 255));
        btnGithub.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pp/views/icons/github.png"))); // NOI18N
        btnGithub.setToolTipText("");
        btnGithub.setActionCommand("github");
        btnGithub.setContentAreaFilled(false);
        btnGithub.setToolTipText(tooltip("Ver projeto no Github."));
        btnGithub.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGithub.setFocusable(false);
        btnGithub.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        javax.swing.GroupLayout contentpanelLayout = new javax.swing.GroupLayout(contentpanel);
        contentpanel.setLayout(contentpanelLayout);
        contentpanelLayout.setHorizontalGroup(
            contentpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contentpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contentpanelLayout.createSequentialGroup()
                        .addGroup(contentpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(contentpanelLayout.createSequentialGroup()
                                .addGroup(contentpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(contentpanelLayout.createSequentialGroup()
                                        .addGroup(contentpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(textTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblOutputTitle))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(contentpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblOutputAuthor)
                                            .addComponent(textAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(contentpanelLayout.createSequentialGroup()
                                        .addComponent(lblOutputDownload)
                                        .addGap(148, 148, 148)
                                        .addComponent(lblOuputScan)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(contentpanelLayout.createSequentialGroup()
                                .addComponent(textDownload, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(textScan, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentpanelLayout.createSequentialGroup()
                                .addComponent(btnProgrammingArea, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnGithub, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnBuild, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentpanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(contentpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblOuputSource)
                            .addComponent(lblOutputDescription))
                        .addGap(380, 380, 380))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentpanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(contentpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(scrollSource, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(scrollDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );
        contentpanelLayout.setVerticalGroup(
            contentpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentpanelLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(contentpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOutputTitle)
                    .addComponent(lblOutputAuthor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contentpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addComponent(lblOutputDescription)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblOuputSource)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollSource, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(contentpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOutputDownload)
                    .addComponent(lblOuputScan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contentpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textDownload, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textScan, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(contentpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contentpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnBuild, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(contentpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnGithub, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnProgrammingArea)))
                .addContainerGap())
        );

        javax.swing.GroupLayout scenepanelLayout = new javax.swing.GroupLayout(scenepanel);
        scenepanel.setLayout(scenepanelLayout);
        scenepanelLayout.setHorizontalGroup(
            scenepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(toppanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        scenepanelLayout.setVerticalGroup(
            scenepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(scenepanelLayout.createSequentialGroup()
                .addComponent(toppanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(contentpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scenepanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scenepanel, javax.swing.GroupLayout.PREFERRED_SIZE, 665, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public ArrayList<JButton> getWindowButtons(){
        ArrayList<JButton> list = new ArrayList<>();
        list.add(btnBuild);
        list.add(btnClear);
        list.add(btnExit);
        list.add(btnGithub);
        list.add(btnProgrammingArea);
        return list;
    }
    
    public Object getTextField(String component){
        if(component == null){
            ArrayList<JTextField> list = new ArrayList<>();
            list.add(textTitle);
            list.add(textAuthor);
            list.add(textDownload);
            list.add(textScan);
            return list;
        } else {
            switch(component){
                case "title": return textTitle.getText();
                case "author": return textAuthor.getText();
                case "download": return textDownload.getText();
                case "scan": return textScan.getText();
                default: return null;
            }
        }
    }
    
    public Object getTextArea(String component){
        if(component == null){
            ArrayList<JTextArea> list = new ArrayList<>();
            list.add(textSource);
            list.add(textDescription);
            return list;
        } else {
            if(component.equals("source"))
                return textSource.getText();
            else return textDescription.getText();
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuild;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnGithub;
    private javax.swing.JButton btnProgrammingArea;
    private javax.swing.JPanel contentpanel;
    private javax.swing.JLabel lblOuputScan;
    private javax.swing.JLabel lblOuputSource;
    private javax.swing.JLabel lblOutputAuthor;
    private javax.swing.JLabel lblOutputDescription;
    private javax.swing.JLabel lblOutputDownload;
    private javax.swing.JLabel lblOutputTitle;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel scenepanel;
    private javax.swing.JScrollPane scrollDescription;
    private javax.swing.JScrollPane scrollSource;
    private javax.swing.JTextField textAuthor;
    private javax.swing.JTextArea textDescription;
    private javax.swing.JTextField textDownload;
    private javax.swing.JTextField textScan;
    private javax.swing.JTextArea textSource;
    private javax.swing.JTextField textTitle;
    private javax.swing.JPanel toppanel;
    // End of variables declaration//GEN-END:variables
}
