package Servidor;

import java.awt.Color;
import java.awt.Desktop;
import java.awt.Font;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Consola extends javax.swing.JFrame {

    private boolean botonPulsado7, botonPulsado2 ,botonPulsado3, botonPulsado4, botonPulsado5, inicio = false;
    Paso paso = new Paso();
    Cinta cinta = new Cinta();
    Avion avion = new Avion();

    
    public Consola() throws InterruptedException {
        initComponents();   
        String nombre; 
        int empleados = 1;
        jLabel4.setFont(new Font("", Font.BOLD, 16));
        jLabel1.setFont(new Font("", Font.BOLD, 16));
        jLabel2.setFont(new Font("", Font.BOLD, 16));
        jLabel5.setFont(new Font("", Font.BOLD, 16));
        jLabel10.setFont(new Font("", Font.BOLD, 16));
        jLabel11.setFont(new Font("", Font.BOLD, 16));
        jLabel3.setFont(new Font("", Font.BOLD, 14));
        jLabel9.setFont(new Font("", Font.BOLD, 14));
        jLabel12.setFont(new Font("", Font.BOLD, 12));
        jLabel13.setFont(new Font("", Font.BOLD, 12));
        jLabel14.setFont(new Font("", Font.BOLD, 14));
        jTextArea1.setBackground(Color.black);
        jTextArea1.setForeground(Color.white);
        jTextArea2.setBackground(Color.black);
        jTextArea2.setForeground(Color.cyan);
        jTextArea3.setBackground(Color.black);
        jTextArea6.setBackground(Color.black);
        jTextArea7.setBackground(Color.black);
        jTextArea7.setForeground(Color.cyan);
        jTextArea1.setFont(new Font("Dialog", Font.BOLD, 12));
        jTextArea2.setFont(new Font("Dialog", Font.BOLD, 12));
        jTextArea3.setFont(new Font("Dialog", Font.BOLD, 12));
        jTextArea7.setFont(new Font("Dialog", Font.BOLD, 12));
        
  
        for(int i = 0; i < 40; i++){
            Pasajero pasajero = new Pasajero("Pasajero " + i, cinta, jTextArea1, jLabel4, jLabel1, jLabel2, paso, jLabel8, jTextArea4, jTextArea6, jLabel16);
            pasajero.start();
            if(i<2){
                Empleado empleado = new Empleado(cinta, avion, jTextArea2, jTextArea3, jLabel4, 
                        jLabel1, jLabel2, jLabel5, paso, jLabel8, jTextArea6, jTextArea7, jLabel10, jLabel11, jLabel12, jLabel13);
                if(i==1){
                    empleado.setNombre("Dani");
                }else{
                    empleado.setNombre("Jorge");
                }
                empleado.start();   
                empleados +=1;
            }   
        }
    }
    
    /*
    public void esperarCliente(String puerto) throws InterruptedException{
        System.out.println("¿Quieres esperar al cliente?(S/N):");
        String esperar = sc.nextLine();
        while(!esperar.toUpperCase().equals("S") && !esperar.toUpperCase().equals("N")){
            System.out.println("¿Quieres esperar al cliente?(S/N):");
            esperar = sc.nextLine();
        }
        servidor.ejecutarConexion(Integer.parseInt(puerto));
        if(esperar.toUpperCase().equals("S")){
            while(!servidor.inicioCliente().contains("Conexion establecida")){
                System.out.println("Esperando conexion del cliente...");
            }
 
        }
    }*/
    


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextArea6 = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTextArea7 = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("0");
        jLabel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel4.setOpaque(true);
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 550, 60, 40));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("0");
        jLabel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel2.setOpaque(true);
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, 60, 40));

        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jTextArea3.setEditable(false);
        jTextArea3.setColumns(20);
        jTextArea3.setForeground(new java.awt.Color(0, 255, 204));
        jTextArea3.setTabSize(0);
        jScrollPane3.setViewportView(jTextArea3);

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 90, 170, 410));

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 300, 239));

        jButton2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/barra.png"))); // NOI18N
        jButton2.setText("DANI");
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 540, 150, 60));

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(20);
        jTextArea2.setForeground(new java.awt.Color(51, 204, 255));
        jTextArea2.setRows(5);
        jTextArea2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane2.setViewportView(jTextArea2);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 140, 260, 140));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("0");
        jLabel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel5.setOpaque(true);
        jLabel5.setVerifyInputWhenFocusTarget(false);
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 20, 40, 40));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("0");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setOpaque(true);
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 60, 40));

        jButton3.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/barra.png"))); // NOI18N
        jButton3.setText("GLOBAL");
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 510, 150, 60));

        jLabel3.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Total Maletas en Cinta");
        jLabel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel3.setOpaque(true);
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 550, 222, 38));

        jButton4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/barra.png"))); // NOI18N
        jButton4.setText("JORGE");
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 610, 150, 60));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/7e8b8fe41d0e8173a5de158b_rw_1200.jpg"))); // NOI18N
        jLabel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 620, 100, 80));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 590, 85, 100));

        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jTextArea4.setEditable(false);
        jTextArea4.setBackground(new java.awt.Color(0, 0, 0));
        jTextArea4.setColumns(20);
        jTextArea4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jTextArea4.setForeground(new java.awt.Color(51, 204, 0));
        jTextArea4.setRows(5);
        jScrollPane4.setViewportView(jTextArea4);

        jPanel2.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 90, 160, 410));

        jTextArea6.setEditable(false);
        jTextArea6.setColumns(20);
        jTextArea6.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jTextArea6.setForeground(new java.awt.Color(0, 255, 204));
        jTextArea6.setTabSize(0);
        jScrollPane6.setViewportView(jTextArea6);

        jPanel2.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 300, 169));

        jLabel9.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Total Pasajeros");
        jLabel9.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel9.setOpaque(true);
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 222, 40));

        jTextArea7.setColumns(20);
        jTextArea7.setForeground(new java.awt.Color(0, 204, 255));
        jTextArea7.setRows(1);
        jTextArea7.setTabSize(1);
        jScrollPane7.setViewportView(jTextArea7);

        jPanel2.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 340, 260, 140));

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("0");
        jLabel10.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel10.setOpaque(true);
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 280, 40, 40));

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("0");
        jLabel11.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel11.setOpaque(true);
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 480, 40, 40));

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel12.setOpaque(true);
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 290, 260, 30));

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel13.setOpaque(true);
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 490, 260, 30));

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Total Maletas Recogidas");
        jLabel14.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel14.setOpaque(true);
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 70, 222, 38));

        jButton5.setBackground(new java.awt.Color(0, 0, 0));
        jButton5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/circulo.png"))); // NOI18N
        jButton5.setText("EMPLEADOS");
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 550, 120, 120));

        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/barra_verde.png"))); // NOI18N
        jButton6.setText("Ver  Inf.");
        jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 520, 100, 40));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Maletas Avion");
        jLabel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel7.setOpaque(true);
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 20, 120, 40));

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Completos");
        jLabel15.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel15.setOpaque(true);
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 20, 110, 40));

        jLabel16.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("0");
        jLabel16.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel16.setOpaque(true);
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 20, 40, 40));

        jButton7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/barra.png"))); // NOI18N
        jButton7.setText("PASAJEROS");
        jButton7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 600, 150, 60));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1220, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if(!botonPulsado4)
        {
            botonPulsado4=true;   
            jButton4.setText("PARADO");
            jButton4.setForeground(Color.black);
            paso.cerrar("jButton4");   
        }
        else
        {
            botonPulsado4=false;
            jButton4.setText("JORGE");
            jButton4.setForeground(Color.white);
            paso.abrir("jButton4");    
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(!botonPulsado3) 
        {
            botonPulsado3=true;
            jButton3.setText("PARADO");
            jButton3.setForeground(Color.black);
            paso.cerrar("jButton3");    
        }
        else 
        {
            botonPulsado3=false; 
            jButton3.setText("GLOBAL");
            jButton3.setForeground(Color.white);
            paso.abrir("jButton3");    
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(!botonPulsado2) 
        {
            botonPulsado2=true; 
            jButton2.setText("PARADO");
            jButton2.setForeground(Color.black);
            paso.cerrar("jButton2");   
        }
        else 
        {
            botonPulsado2=false;
            jButton2.setText("DANI");
            jButton2.setForeground(Color.white);
            paso.abrir("jButton2");    
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if(!botonPulsado5)
        {
            botonPulsado5=true;
            jButton5.setText("PARADO");
            jButton5.setForeground(Color.black);
            paso.cerrar("jButton5");    
        }
        else 
        {
            botonPulsado5=false;
            jButton5.setText("EMPLEADOS");
            jButton5.setForeground(Color.white);
            paso.abrir("jButton5");    
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        try {
            Desktop.getDesktop().open(new java.io.File("File/Git_Aeropuerto/PEL1_Aeropuerto/Historiales/Historial.txt"));
        } catch (IOException ex) {
            Logger.getLogger(Consola.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
                if(!botonPulsado7)
        {
            botonPulsado7=true;
            jButton7.setText("PARADO");
            jButton7.setForeground(Color.black);
            paso.cerrar("jButton7");    
        }
        else 
        {
            botonPulsado7=false;
            jButton7.setText("PASAJEROS");
            jButton7.setForeground(Color.white);
            paso.abrir("jButton7");    
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Consola.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Consola.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Consola.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Consola.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Consola().setVisible(true);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Consola.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextArea jTextArea6;
    private javax.swing.JTextArea jTextArea7;
    // End of variables declaration//GEN-END:variables
}