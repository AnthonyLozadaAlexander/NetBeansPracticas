package igu;

import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author zDefcon
 */
public class NotaCalcularGUI extends javax.swing.JFrame {

  /**
   * Creates new form NotaCalcularGUI
   */
  public NotaCalcularGUI() {
    initComponents();
   
  }

  /**
   * This method is called from within the constructor to initialize the form. WARNING: Do
   * NOT modify this code. The content of this method is always regenerated by the Form
   * Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jPanel1 = new javax.swing.JPanel();
    jLabel1 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    jLabel4 = new javax.swing.JLabel();
    jLabel5 = new javax.swing.JLabel();
    jLabel6 = new javax.swing.JLabel();
    jLabel7 = new javax.swing.JLabel();
    txtAlumno = new javax.swing.JTextField();
    txtTrabajoPractico = new javax.swing.JTextField();
    txtNotaFinal = new javax.swing.JTextField();
    txtNota = new javax.swing.JTextField();
    txtTrabajoFinal = new javax.swing.JTextField();
    txtAsistencia = new javax.swing.JTextField();
    txtExamenParcial = new javax.swing.JTextField();
    jLabel8 = new javax.swing.JLabel();
    btnLimpiar = new javax.swing.JButton();
    btnCalcular1 = new javax.swing.JButton();
    btnSalir = new javax.swing.JButton();
    jLabel9 = new javax.swing.JLabel();
    txtExamenFinal = new javax.swing.JTextField();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jLabel1.setFont(new java.awt.Font("Miracode", 0, 18)); // NOI18N
    jLabel1.setText("Alumno:");

    jLabel2.setFont(new java.awt.Font("Miracode", 0, 18)); // NOI18N
    jLabel2.setText("Asistencia:");

    jLabel3.setFont(new java.awt.Font("Miracode", 0, 18)); // NOI18N
    jLabel3.setText("Trabajo Practico:");

    jLabel4.setFont(new java.awt.Font("Miracode", 0, 18)); // NOI18N
    jLabel4.setText("Examen Parcial:");

    jLabel5.setFont(new java.awt.Font("Miracode", 0, 18)); // NOI18N
    jLabel5.setText("TrabajoFinal:");

    jLabel6.setFont(new java.awt.Font("Miracode", 0, 18)); // NOI18N
    jLabel6.setText("Nota:");

    jLabel7.setFont(new java.awt.Font("Miracode", 0, 18)); // NOI18N
    jLabel7.setText("Nota Final:");

    txtNotaFinal.setEditable(false);

    txtNota.setEditable(false);

    txtAsistencia.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        txtAsistenciaActionPerformed(evt);
      }
    });

    jLabel8.setFont(new java.awt.Font("Miracode", 0, 24)); // NOI18N
    jLabel8.setText("Calculo De Notas");

    btnLimpiar.setFont(new java.awt.Font("Miracode", 0, 18)); // NOI18N
    btnLimpiar.setText("Limpiar");
    btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnLimpiarActionPerformed(evt);
      }
    });

    btnCalcular1.setFont(new java.awt.Font("Miracode", 0, 18)); // NOI18N
    btnCalcular1.setText("Calcular");
    btnCalcular1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnCalcular1ActionPerformed(evt);
      }
    });

    btnSalir.setFont(new java.awt.Font("Miracode", 0, 18)); // NOI18N
    btnSalir.setText("Salir");
    btnSalir.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnSalirActionPerformed(evt);
      }
    });

    jLabel9.setFont(new java.awt.Font("Miracode", 0, 18)); // NOI18N
    jLabel9.setText("ExamenFinal:");

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(btnSalir)
        .addGap(15, 15, 15))
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(205, 205, 205)
            .addComponent(jLabel8))
          .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
              .addGap(183, 183, 183)
              .addComponent(jLabel9)
              .addGap(18, 18, 18)
              .addComponent(txtExamenFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
              .addGap(135, 135, 135)
              .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                  .addComponent(jLabel1)
                  .addComponent(jLabel3))
                .addGroup(jPanel1Layout.createSequentialGroup()
                  .addGap(72, 72, 72)
                  .addComponent(jLabel2)
                  .addGap(18, 18, 18)
                  .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtAlumno)
                    .addComponent(txtAsistencia, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createSequentialGroup()
                  .addGap(24, 24, 24)
                  .addComponent(jLabel4)
                  .addGap(18, 18, 18)
                  .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtTrabajoPractico)
                    .addComponent(txtExamenParcial, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createSequentialGroup()
                  .addGap(48, 48, 48)
                  .addComponent(jLabel5)
                  .addGap(18, 18, 18)
                  .addComponent(txtTrabajoFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))))
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(82, 82, 82)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(txtNotaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(txtNota, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGap(18, 18, 18)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addComponent(btnCalcular1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))))
        .addContainerGap(153, Short.MAX_VALUE))
    );
    jPanel1Layout.setVerticalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(14, 14, 14)
            .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(47, 47, 47)
            .addComponent(jLabel8)))
        .addGap(57, 57, 57)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
          .addComponent(txtAlumno, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(18, 18, 18)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(txtAsistencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabel2))
        .addGap(14, 14, 14)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel3)
          .addComponent(txtTrabajoPractico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(18, 18, 18)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel4)
          .addComponent(txtExamenParcial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(17, 17, 17)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel5)
          .addComponent(txtTrabajoFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(28, 28, 28)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel9)
          .addComponent(txtExamenFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addComponent(btnCalcular1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(jLabel6)
              .addComponent(txtNota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(jLabel7)
              .addComponent(txtNotaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        .addGap(58, 58, 58))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void txtAsistenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAsistenciaActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_txtAsistenciaActionPerformed

  private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
    int respuesta = JOptionPane.showConfirmDialog(this, "Estas Seguro De Salir De La Ventana?", "Confirmar Salida", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
    
    if(respuesta == JOptionPane.YES_OPTION){ 
    System.exit(0);
    }
    
  }//GEN-LAST:event_btnSalirActionPerformed

  private void btnCalcular1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcular1ActionPerformed
    // Declaracion de variables
    try{
    String alumno;
    int asistencia;
    double trabajoPractico, examenParcial, trabajoFinal, nota, examenFinal;
    
    // Conversiones y Asignacion de variables a los txt
    alumno = txtAlumno.getText();
    asistencia = Integer.parseInt(txtAsistencia.getText());
    trabajoPractico = Double.parseDouble(txtTrabajoPractico.getText());
    trabajoFinal = Double.parseDouble(txtTrabajoFinal.getText());
    examenParcial = Double.parseDouble(txtExamenParcial.getText());
    examenFinal = Double.parseDouble(txtExamenFinal.getText());
    
    //Calculo Matematico
    nota = (asistencia + trabajoPractico + trabajoFinal + examenFinal + examenParcial);
    txtNota.setText(""+nota);
    
    txtNota.setText(""+nota);
    if(nota >= 70 && nota <= 79){
      txtNotaFinal.setText("C");
    }
    else if(nota >= 80 && nota <= 89){
      txtNotaFinal.setText("B");
    }
    else if(nota >= 90 && nota <= 100){
      txtNotaFinal.setText("A");
    }
    else if(nota >= 101){
      JOptionPane.showMessageDialog(null, "La nota maxima es 100 puntos");
    }
    else{
      txtNotaFinal.setText("F");
    }
    }catch (Exception error){
      JOptionPane.showMessageDialog(this, "Error: " + error);
    }
  }//GEN-LAST:event_btnCalcular1ActionPerformed

  private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
    // TODO add your handling code here:
    txtAlumno.setText("");
    txtAsistencia.setText("");
    txtNota.setText("");
    txtTrabajoPractico.setText("");
    txtTrabajoFinal.setText("");
    txtNotaFinal.setText("");
    txtExamenFinal.setText("");
    txtExamenParcial.setText("");
  }//GEN-LAST:event_btnLimpiarActionPerformed


  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnCalcular1;
  private javax.swing.JButton btnLimpiar;
  private javax.swing.JButton btnSalir;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JLabel jLabel7;
  private javax.swing.JLabel jLabel8;
  private javax.swing.JLabel jLabel9;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JTextField txtAlumno;
  private javax.swing.JTextField txtAsistencia;
  private javax.swing.JTextField txtExamenFinal;
  private javax.swing.JTextField txtExamenParcial;
  private javax.swing.JTextField txtNota;
  private javax.swing.JTextField txtNotaFinal;
  private javax.swing.JTextField txtTrabajoFinal;
  private javax.swing.JTextField txtTrabajoPractico;
  // End of variables declaration//GEN-END:variables
}
