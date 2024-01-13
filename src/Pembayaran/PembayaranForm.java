
package Pembayaran;

import app.db.Mahasiswa;
import app.db.MahasiswaManager;
import java.beans.Statement;
//import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
//import java.sql.Statement;
//import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;



public class PembayaranForm extends javax.swing.JInternalFrame {
    
    List<Mahasiswa> mahasiswa = new ArrayList<>();
     int currentRow = 0;
    Connection conn = null;
    String url = "jdbc:mysql://localhost:3306/dbloka";
    
    
    public PembayaranForm() throws SQLException {
        conn = DriverManager.getConnection(url, "root", "");
        
        String lookAndFeel = javax.swing.UIManager.getSystemLookAndFeelClassName();
            try {
                javax.swing.UIManager.setLookAndFeel(lookAndFeel);
            } catch (Exception e) {
            }       
        
        initComponents();
        loadData();
        bindData();
        
    }

        private void loadData() {
        MahasiswaManager mhsmgr = new MahasiswaManager();
        mahasiswa = mhsmgr.getMahasiswa();
        mhsmgr.closeConnection();
    }
     private void bindData() {
        if (mahasiswa.size()>0) {
            Mahasiswa m = mahasiswa.get(currentRow);
            Namatxt.setText(m.getnama());
            Tgltxt.setText(m.gettanggal());
            Jamtxt.setText(m.getjam());
            Pulsatxt.setText(m.getjumlahpulsa());
            Hargatxt.setText(m.getharga());
            Pembayarantxt.setText(m.getpembayaran());
        } else {
            currentRow = 0;
            Namatxt.setText("");
            Tgltxt.setText("");
            Jamtxt.setText("");
            Pulsatxt.setText("");
            Hargatxt.setText("");
            Pembayarantxt.setText("");
        }
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Namatxt = new javax.swing.JTextField();
        Tgltxt = new javax.swing.JTextField();
        Jamtxt = new javax.swing.JTextField();
        Hargatxt = new javax.swing.JTextField();
        Pembayarantxt = new javax.swing.JTextField();
        PulsaCbx = new javax.swing.JComboBox<>();
        Pulsatxt = new javax.swing.JTextField();
        btnEnter = new javax.swing.JButton();
        Print = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();

        jMenu1.setText("jMenu1");

        setClosable(true);
        setTitle("Pembayaran");

        jLabel1.setText("Nama");

        jLabel2.setText("Tanggal");

        jLabel3.setText("Jam");

        jLabel4.setText("Jumlah Pulsa");

        jLabel5.setText("Harga");

        jLabel6.setText("Pembayaran");

        PulsaCbx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih", "1.000", "5.000", "10.000", "15.000", "20.000", "25.000", "30.000", "35.000", "40.000", "45.000", "50.000", "55.000", "60.000", "65.000", "70.000", "75.000", "80.000", "85.000", "90.000", "95.000", "100.000", "150.000", "200.000", "300.000", "500.000", "1.000.000" }));
        PulsaCbx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PulsaCbxActionPerformed(evt);
            }
        });

        btnEnter.setText("Enter");
        btnEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnterActionPerformed(evt);
            }
        });

        Print.setText("Print");
        Print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintActionPerformed(evt);
            }
        });
        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Namatxt)
                            .addComponent(Tgltxt)
                            .addComponent(Jamtxt)
                            .addComponent(Hargatxt)
                            .addComponent(Pembayarantxt, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(PulsaCbx, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Pulsatxt, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Print, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEnter, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Namatxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Tgltxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Jamtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(PulsaCbx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Pulsatxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Hargatxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(Pembayarantxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEnter)
                    .addComponent(Print))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PulsaCbxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PulsaCbxActionPerformed
        switch(PulsaCbx.getSelectedIndex()) {
            case 0 -> {
                Pulsatxt.setText("0");
                Hargatxt.setText("0");
            }
            case 1 -> {
                Pulsatxt.setText("1000");
                Hargatxt.setText("5000");
            }
            case 2 -> {
                Pulsatxt.setText("5000");
                Hargatxt.setText("8000");
            }
            case 3 -> {
                Pulsatxt.setText("10000");
                Hargatxt.setText("13000");
            }
            case 4 -> {
                Pulsatxt.setText("15000");
                Hargatxt.setText("20000");
            }
            case 5 -> {
                Pulsatxt.setText("20000");
                Hargatxt.setText("25000");
            }
            case 6 -> {
                Pulsatxt.setText("25000");
                Hargatxt.setText("30000");
            }
            case 7 -> {
                Pulsatxt.setText("30000");
                Hargatxt.setText("35000");
            }
            case 8 -> {
                Pulsatxt.setText("35000");
                Hargatxt.setText("40000");
            }
            case 9 -> {
                Pulsatxt.setText("40000");
                Hargatxt.setText("45000");
            }
            case 10 -> {
                Pulsatxt.setText("45000");
                Hargatxt.setText("50000");
            }
            case 11 -> {
                Pulsatxt.setText("50000");
                Hargatxt.setText("58000");
            }
            case 12 -> {
                Pulsatxt.setText("55000");
                Hargatxt.setText("63000");
            }
            case 13 -> {
                Pulsatxt.setText("60000");
                Hargatxt.setText("68000");
            }
            case 14 -> {
                Pulsatxt.setText("65000");
                Hargatxt.setText("73000");
            }
            case 15 -> {
                Pulsatxt.setText("70000");
                Hargatxt.setText("80000");
            }
            case 16 -> {
                Pulsatxt.setText("75000");
                Hargatxt.setText("85000");
            }
            case 17 -> {
                Pulsatxt.setText("80000");
                Hargatxt.setText("90000");
            }
            case 18 -> {
                Pulsatxt.setText("85000");
                Hargatxt.setText("95000");
            }
            case 19 -> {
                Pulsatxt.setText("90000");
                Hargatxt.setText("100000");
            }
            case 20 -> {
                Pulsatxt.setText("95000");
                Hargatxt.setText("105000");
            }
            case 21 -> {
                Pulsatxt.setText("100000");
                Hargatxt.setText("110000");
            }
            case 22 -> {
                Pulsatxt.setText("150000");
                Hargatxt.setText("170000");
            }
            case 23 -> {
                Pulsatxt.setText("200000");
                Hargatxt.setText("220000");
            }
            case 24 -> {
                Pulsatxt.setText("300000");
                Hargatxt.setText("325000");
            }
            case 25 -> {
                Pulsatxt.setText("500000");
                Hargatxt.setText("530000");
            }
            case 26 -> {
                Pulsatxt.setText("1000000");
                Hargatxt.setText("1035000");
            }
            default -> {
                Pulsatxt.setText("Ga Jadi Beli");
                Hargatxt.setText("Ga Jadi Beli");
            }
            
        }
    }//GEN-LAST:event_PulsaCbxActionPerformed

    private void btnEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnterActionPerformed

        if(Hargatxt.getText().isEmpty() && Pembayarantxt.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Pilih Jumlah Pulsa Yang Ingin Dibeli Dan Isi Jumlah Uang Yang diberikan");
        }else if(Double.parseDouble(Pembayarantxt.getText()) < (Double.parseDouble(Hargatxt.getText()))){   
            JOptionPane.showMessageDialog(null, "Uang Pembayaran Kurang");
        }else{
           if (!Namatxt.getText().equals("") && !Pembayarantxt.getText().equals("")){
           MahasiswaManager mhsmgr = new MahasiswaManager();
           Mahasiswa m = new Mahasiswa();
           m.setnama(Namatxt.getText());
           m.settanggal(Tgltxt.getText());
           m.setjam(Jamtxt.getText());           
           m.setjumlahpulsa(Pulsatxt.getText());
           m.setharga(Hargatxt.getText());
           m.setpembayaran(Pembayarantxt.getText());
           if (mhsmgr.Insert(m)>0) {
               loadData();
               currentRow = mahasiswa.size()-1;
               bindData();
               JOptionPane.showMessageDialog(this, "Data Berhasil Disimpan","Informasi", JOptionPane.INFORMATION_MESSAGE);
           } else {
              JOptionPane.showMessageDialog(this, "Data Gagal Disimpan","Informasi", JOptionPane.INFORMATION_MESSAGE);
           }
           Namatxt.setEditable(false);
           Tgltxt.setEditable(false);
           Jamtxt.setEditable(false);           
           Pulsatxt.setEditable(false);           
           PulsaCbx.setEditable(false);
           Hargatxt.setEditable(false);
           Pembayarantxt.setEditable(false);
           mhsmgr.closeConnection();
          } else {
           JOptionPane.showMessageDialog(this, "Data Berhasil Disimpan","Informasi", JOptionPane.INFORMATION_MESSAGE);
          }
            PengeluaranForm pengeluaranForm = new PengeluaranForm(Pulsatxt.getText(), Hargatxt.getText(), Pembayarantxt.getText());
            pengeluaranForm.setVisible(true);
            this.getDesktopPane().add(pengeluaranForm);
            this.dispose();
        }
    }//GEN-LAST:event_btnEnterActionPerformed

    private void PrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintActionPerformed
            java.sql.Connection conn = null;
            try{
                String jdbcDriver = "com.mysql.cj.jdbc.Driver";
                Class.forName(jdbcDriver);
                
                String url = "jdbc:mysql://localhost:3306/dbloka";
                String user = "root";
                String pass = "";
                
                conn = DriverManager.getConnection(url, user, pass);
                Statement stm = (Statement) conn.createStatement();
                
                try{
                    String report = ("C:\\M.Dicky Desriansyah(22130005)\\PBO 2\\LokaAplication\\src\\Report\\LaporanLoka.jrxml");
                    HashMap hash = new HashMap();
                    
                    hash.put("Nama", Namatxt.getText());
                    JasperReport JRpt = JasperCompileManager.compileReport(report);
                    JasperPrint JPrint = JasperFillManager.fillReport(JRpt, hash, conn);
                    JasperViewer.viewReport(JPrint, false);
                    
                }catch(JRException rptexcpt){
                    System.out.println("Tidak Bisa Dilihat Karena : " + rptexcpt);
                }
            }catch(Exception e){
                System.out.println(e);
            }


//       JasperReport report;
//        
//        String path = "C:\\M.Dicky Desriansyah(22130005)\\PBO 2\\LokaAplication\\src\\Report\\LaporanLoka.jrxml";
//       try{ 
//       report = (JasperReport) JRLoader.loadObjectFromFile(path);
//       JasperPrint jprint = JasperFillManager.fillReport(path, null, conn);
//       JasperViewer jviewer = new JasperViewer(jprint, false);
//       
//       jviewer.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
//       jviewer.setVisible(true);
//       }catch (JRException ex){
//            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//       }
    }//GEN-LAST:event_PrintActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Hargatxt;
    private javax.swing.JTextField Jamtxt;
    private javax.swing.JTextField Namatxt;
    private javax.swing.JTextField Pembayarantxt;
    private javax.swing.JButton Print;
    private javax.swing.JComboBox<String> PulsaCbx;
    private javax.swing.JTextField Pulsatxt;
    private javax.swing.JTextField Tgltxt;
    private javax.swing.JButton btnEnter;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
