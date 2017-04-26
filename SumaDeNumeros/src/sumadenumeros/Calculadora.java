package sumadenumeros;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Calculadora extends javax.swing.JFrame {

    public Calculadora() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jEtiqueta = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jEtiNo1 = new javax.swing.JLabel();
        jEtiNo2 = new javax.swing.JLabel();
        jNo2 = new javax.swing.JTextField();
        jSuma = new javax.swing.JButton();
        jMultiplicacion = new javax.swing.JButton();
        jResta = new javax.swing.JButton();
        jDivision = new javax.swing.JButton();
        jLimpiar = new javax.swing.JButton();
        jSalir = new javax.swing.JButton();
        jNo1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                formKeyTyped(evt);
            }
        });

        jEtiqueta.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jEtiqueta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jEtiqueta.setText("Calculadora");

        jEtiNo1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jEtiNo1.setText("Numero 1:");

        jEtiNo2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jEtiNo2.setText("Numero 2:");

        jNo2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jNo2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jSuma.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jSuma.setText("+");
        jSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSumaActionPerformed(evt);
            }
        });

        jMultiplicacion.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jMultiplicacion.setText("x");
        jMultiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMultiplicacionActionPerformed(evt);
            }
        });

        jResta.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jResta.setText("-");
        jResta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRestaActionPerformed(evt);
            }
        });

        jDivision.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jDivision.setText("/");
        jDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDivisionActionPerformed(evt);
            }
        });

        jLimpiar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLimpiar.setText("Limpiar");
        jLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLimpiarActionPerformed(evt);
            }
        });

        jSalir.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jSalir.setText("Salir");
        jSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSalirActionPerformed(evt);
            }
        });

        jNo1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jNo1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jEtiNo2)
                        .addGap(8, 8, 8)
                        .addComponent(jNo2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMultiplicacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDivision, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jEtiNo1)
                        .addGap(8, 8, 8)
                        .addComponent(jNo1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSuma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jResta)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLimpiar)
                    .addComponent(jSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
            .addComponent(jSeparator1)
            .addComponent(jEtiqueta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jEtiqueta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jEtiNo1)
                    .addComponent(jSuma)
                    .addComponent(jResta)
                    .addComponent(jLimpiar)
                    .addComponent(jNo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jEtiNo2)
                    .addComponent(jMultiplicacion)
                    .addComponent(jDivision)
                    .addComponent(jSalir)
                    .addComponent(jNo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 9, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSumaActionPerformed
        String a=jNo1.getText();
        int no1= Integer.parseInt(a);
        String b=jNo2.getText();
        int no2= Integer.parseInt(b);
        int c=no1+no2;
        JOptionPane.showMessageDialog(null,"La suma es: "+c);
    }//GEN-LAST:event_jSumaActionPerformed

    private void jRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRestaActionPerformed
        String a=jNo1.getText();
        int no1= Integer.parseInt(a);
        String b=jNo2.getText();
        int no2= Integer.parseInt(b);
        int c=no1-no2;
        int d=no2-no1;
        JOptionPane.showMessageDialog(null,"La resta del numero 1 menos el numero 2 es: "+c);
        JOptionPane.showMessageDialog(null,"La resta del numero 2 menos el numero 1 es: "+d);
    }//GEN-LAST:event_jRestaActionPerformed

    private void jLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLimpiarActionPerformed
        jNo1.setText("");
        jNo2.setText("");
    }//GEN-LAST:event_jLimpiarActionPerformed

    private void jMultiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMultiplicacionActionPerformed
        String a=jNo1.getText();
        int no1= Integer.parseInt(a);
        String b=jNo2.getText();
        int no2= Integer.parseInt(b);
        int c=no1*no2;
        JOptionPane.showMessageDialog(null,"La multiplicacion es: "+c);
    }//GEN-LAST:event_jMultiplicacionActionPerformed

    private void jDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDivisionActionPerformed
        String a=jNo1.getText();
        float no1= Integer.parseInt(a);
        String b=jNo2.getText();
        float no2= Integer.parseInt(b);
        float c=no1/no2;
        float d=no2/no1;
        JOptionPane.showMessageDialog(null,"La division del numero 1 entre el numero 2 es: "+c);
        JOptionPane.showMessageDialog(null,"La division del numero 2 entre el numero 1 es: "+d);
    }//GEN-LAST:event_jDivisionActionPerformed

    private void jSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSalirActionPerformed
        System.exit(0); 
    }//GEN-LAST:event_jSalirActionPerformed

    private void formKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyTyped
        char caracter=evt.getKeyChar();
        if((caracter<'0')||(caracter>'9')){
            evt.consume();
        }
    }//GEN-LAST:event_formKeyTyped

    public boolean validar(JTextField a){
        if(a.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"No es posible realizar operaciones");
            return false;
        }
        return true;
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jDivision;
    private javax.swing.JLabel jEtiNo1;
    private javax.swing.JLabel jEtiNo2;
    private javax.swing.JLabel jEtiqueta;
    private javax.swing.JButton jLimpiar;
    private javax.swing.JButton jMultiplicacion;
    private javax.swing.JTextField jNo1;
    private javax.swing.JTextField jNo2;
    private javax.swing.JButton jResta;
    private javax.swing.JButton jSalir;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jSuma;
    // End of variables declaration//GEN-END:variables
}
