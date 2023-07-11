package feedformulation;

import com.fuzzylite.Engine;
import com.fuzzylite.imex.FllImporter;
import java.io.File;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.text.DecimalFormat;

public class Dashboard extends javax.swing.JFrame {
JTable jtable;
DecimalFormat decFor = new DecimalFormat("0.00");
String[] broilers_chicks_recipees = {"Whole maize", "Fishmeal", "Soya bean meal", "Lime", "Premix (Vit & Min)", "Lysine", "Threonine"};
Double[] broilers_chicks = {57.2, 17.2, 20.0, 5.8, 0.14, 0.07, 0.07};

String[] broilers_finisher_recipees = {"Maize", "Soybean", "Groundnut Cake", "Brewer Dry Grain", "Maize Offal", "Bone Meal", "Methionine", "Lysine", "Vitamin/Mineral Premix", "Salt"};
Double[] broilers_finisher = {44.0, 34.0, 2.0, 12.0, 4.0, 3.0, 0.25, 0.25, 0.25, 0.25};

String[] layers_chicks_recepees = {"Whole maize", "Wheat bran", "Wheat pollard", "Sunflower meal", "Fishmeal", "Lime", "Salt", "Premix"};
Double [] layers_chicks = {46.0, 13.0, 10.0, 25.0, 2.6, 2.5, 0.07, 0.04};

String[] layers_growers_recepees = {"Whole maize", "Maize germ", "Wheat pollar", "Wheat bran", "Sunflower meal", "Soya meal", "Lime", "Bone meal", "Fishmeal", "Salt", "Coccidiostat", "Premix", "Zinc bacitracin", "Toxin binder"};
Double [] layers_growers = {14.3, 24.3, 18.6, 14.3, 15.7, 4.9, 2.9, 1.0, 4.3, 0.04, 0.005, 0.03, 0.005, 0.01};
    

public Dashboard() {        
        initComponents();
        this.setExtendedState(this.getExtendedState() | JFrame.MAXIMIZED_HORIZ);
        //populateTable(layers_growers_recepees, layers_growers);
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        main_panel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btn_upload = new javax.swing.JButton();
        cmb_feed_name = new javax.swing.JComboBox();
        cmb_specie = new javax.swing.JComboBox();
        txt_quantity = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        lbl_title = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dashboard");
        setName("main_frame"); // NOI18N
        setResizable(false);

        main_panel.setBackground(new java.awt.Color(220, 220, 243));
        main_panel.setForeground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 0));
        jLabel1.setText("POULTRY FEEDS FORMULATOR");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Using Fuzzy Appraoch");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(178, 178, 178)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        btn_upload.setBackground(new java.awt.Color(0, 0, 51));
        btn_upload.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_upload.setForeground(new java.awt.Color(255, 204, 0));
        btn_upload.setText("Formulate");
        btn_upload.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_uploadMouseClicked(evt);
            }
        });

        cmb_feed_name.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-select type of feed-", "Starter (chicks)", "Grower", "Finisher" }));

        cmb_specie.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-select Poultry Specie-", "Broilers", "Layers" }));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Quantity (kg):");

        lbl_title.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbl_title.setForeground(new java.awt.Color(0, 0, 102));
        lbl_title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout main_panelLayout = new javax.swing.GroupLayout(main_panel);
        main_panel.setLayout(main_panelLayout);
        main_panelLayout.setHorizontalGroup(
            main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(main_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, main_panelLayout.createSequentialGroup()
                        .addComponent(cmb_feed_name, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmb_specie, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_upload)
                        .addGap(101, 101, 101))
                    .addGroup(main_panelLayout.createSequentialGroup()
                        .addComponent(lbl_title)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        main_panelLayout.setVerticalGroup(
            main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(main_panelLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(cmb_feed_name, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmb_specie, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_upload, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_title)
                .addContainerGap(384, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(main_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 651, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_uploadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_uploadMouseClicked
        
        int feed_name = cmb_feed_name.getSelectedIndex();
        int poultry_specie = cmb_specie.getSelectedIndex();
        int quantity = 0;
        
        try {
        Double.parseDouble(txt_quantity.getText());
        quantity = Integer.parseInt(txt_quantity.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid Quantity", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if(feed_name == 0){
            JOptionPane.showMessageDialog(null, "Select feed name", "Error", JOptionPane.ERROR_MESSAGE);
            return;}
        if(poultry_specie == 0){
            JOptionPane.showMessageDialog(null, "Select poultry specie", "Error", JOptionPane.ERROR_MESSAGE);
            return;}
        if(quantity < 1){
           JOptionPane.showMessageDialog(null, "Invalid Quantity", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if(feed_name == 3 && poultry_specie == 2){
            JOptionPane.showMessageDialog(null, "Layers doesn't have finishers", "Wrong combination", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(feed_name == 2 && poultry_specie == 1){
            JOptionPane.showMessageDialog(null, "Broiler has no grower", "Wrong combination", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (feed_name == 2){
            feed_name+=4;
        }
        if (feed_name == 3){
            feed_name+=5;
        }
        if (poultry_specie == 2){
            poultry_specie+=4;
        }
        if (poultry_specie == 3){
            poultry_specie+=5;
        }
        String feed_nameVal = cmb_feed_name.getSelectedItem().toString();
        String specieVal = cmb_specie.getSelectedItem().toString();
        String str1 = "Requirments for formulation of "+quantity+"kg of "+feed_nameVal+" for "+specieVal;
        lbl_title.setText(str1);
        
        
        double result_feed_name = (double) feed_name / 10;
        double result_poultry_specie = (double) poultry_specie / 10;
        double engineValue = RunEngine(result_feed_name, result_poultry_specie);
        
        if(engineValue < 0.5){
            populateTable(broilers_chicks_recipees, broilers_chicks, quantity);
            return;
        }
        if(engineValue < 0.55){
            populateTable(layers_chicks_recepees, layers_chicks,quantity);
            return;
        }
        
        if(feed_name == 6 && poultry_specie == 6){
            populateTable(layers_growers_recepees, layers_growers, quantity); 
        }else if(engineValue < 0.67){
            populateTable(broilers_finisher_recipees, broilers_finisher, quantity);
        }
    }//GEN-LAST:event_btn_uploadMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new Dashboard().setVisible(true);
        });
    }
    
    public void populateTable(String[] ingridients, Double[] qunatity, int kgs){
        double qty_kg = (double) kgs/100;
        String [] tableHead = {"Ingredients", "Qunatity"};
        // Create 2D array of String with two columns
        int length = Math.min(ingridients.length, qunatity.length);
        String[][] string2DArray = new String[length][2];

        // Populate the 2D array
        for (int i = 0; i < length; i++) {
            string2DArray[i][0] = ingridients[i];
            string2DArray[i][1] = String.valueOf(decFor.format(qunatity[i]*qty_kg))+"kg";
        }
        createJTable(string2DArray,tableHead);   
    
    }
    
    //method to create a table 
    public void createJTable(String[][] data, String[] columnNames){
        // Initializing the JTable
        jtable = new JTable(data, columnNames);
        jtable.setFillsViewportHeight(true);
        JScrollPane scrollPane = new JScrollPane(jtable);
        scrollPane.setBounds(20, 200, 600, 250);
        main_panel.add(scrollPane);
    }
    
    //run infulence engine
    public double RunEngine(double feed_name, double specie){
        StringBuilder engineStatus = new StringBuilder();
            Engine engine = null;
            try {
                engine = new FllImporter().fromFile(new File("src\\feedsRulls.fll"));
            } catch (IOException e) {
            }
            if (! engine.isReady(engineStatus))
                throw new RuntimeException("[engine error] engine is not ready:\n" + engineStatus); 
            engine.setInputValue("feed_name", feed_name);
            engine.setInputValue("specie", specie);
            
            engine.process();
            return engine.getOutputValue("matching_feeds");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_upload;
    private javax.swing.JComboBox cmb_feed_name;
    private javax.swing.JComboBox cmb_specie;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbl_title;
    private javax.swing.JPanel main_panel;
    private javax.swing.JTextField txt_quantity;
    // End of variables declaration//GEN-END:variables
}
