package br.com.visão;

import br.com.controle.Horas;
import javax.swing.JOptionPane;

public class TelaHoras extends javax.swing.JFrame {
    Horas h = new Horas();
   
    public TelaHoras() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jTmatricula = new javax.swing.JTextField();
        jLmatricula = new javax.swing.JLabel();
        jRmais = new javax.swing.JRadioButton();
        jRmenos = new javax.swing.JRadioButton();
        jLopcao = new javax.swing.JLabel();
        jBvotacao = new javax.swing.JButton();
        jBfim = new javax.swing.JButton();
        jBLimpar = new javax.swing.JButton();
        jLresultadomais = new javax.swing.JLabel();
        jLresultadomenos = new javax.swing.JLabel();
        jLresultadof = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLmatricula.setText("Insira sua Matricula");

        buttonGroup1.add(jRmais);
        jRmais.setText("44 Horas Semanais");

        buttonGroup1.add(jRmenos);
        jRmenos.setText("40 Horas Semanais");

        jLopcao.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLopcao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLopcao.setText("Insira sua Opção de voto");

        jBvotacao.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jBvotacao.setText("Realizar Voto");
        jBvotacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBvotacaoActionPerformed(evt);
            }
        });

        jBfim.setText("Finalizar Votação");
        jBfim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBfimActionPerformed(evt);
            }
        });

        jBLimpar.setText("Limpar Votos");
        jBLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimparActionPerformed(evt);
            }
        });

        jLresultadomais.setText("Votos em 44 horas");

        jLresultadomenos.setText("Votos em 40 horas");

        jLresultadof.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLresultadof.setForeground(new java.awt.Color(255, 0, 0));
        jLresultadof.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jRmais)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRmenos))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLmatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jTmatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(70, 70, 70))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(jLopcao, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jBfim)
                                    .addComponent(jLresultadomais, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(45, 45, 45)
                                        .addComponent(jLresultadomenos, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(39, 39, 39)
                                        .addComponent(jBLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLresultadof, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(jBvotacao)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLmatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTmatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLopcao, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRmais)
                    .addComponent(jRmenos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBvotacao, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBfim, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBLimpar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLresultadomais, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLresultadomenos, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLresultadof, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBvotacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBvotacaoActionPerformed
        String matricula = jTmatricula.getText().trim();
        if (matricula.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, insira sua matrícula.", "Erro", JOptionPane.ERROR_MESSAGE);
        return; 
    }
        if(jRmais.isSelected()){
            h.setVoto(1);            
        }
        else if(jRmenos.isSelected()){
            h.setVoto(2);
        }
    jTmatricula.setText("");
    }//GEN-LAST:event_jBvotacaoActionPerformed

    private void jBfimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBfimActionPerformed
        jLresultadomais.setText("Votos em 44 Horas: "+h.getVotoMais());
        jLresultadomenos.setText("Votos em 40 Horas: "+h.getVotoMenos());
        
        if (h.getVotoMais() > h.getVotoMenos()){
        jLresultadof.setText("O mais Votado foi: 44horas Semanais com: "+h.getVotoMais()+" votos");
        }else if (h.getVotoMenos() > h.getVotoMais()){
        jLresultadof.setText("O mais Votado foi: 40horas Semanais com: "+h.getVotoMenos()+" votos");
        }else jLresultadof.setText("A votação deu em empate");
    }//GEN-LAST:event_jBfimActionPerformed

    private void jBLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimparActionPerformed
        h.zerarVotos();
        jLresultadomais.setText("Votos em 44 Horas: " + h.getVotoMais());
        jLresultadomenos.setText("Votos em 40 Horas: " + h.getVotoMenos());
    }//GEN-LAST:event_jBLimparActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaHoras().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jBLimpar;
    private javax.swing.JButton jBfim;
    private javax.swing.JButton jBvotacao;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLmatricula;
    private javax.swing.JLabel jLopcao;
    private javax.swing.JLabel jLresultadof;
    private javax.swing.JLabel jLresultadomais;
    private javax.swing.JLabel jLresultadomenos;
    private javax.swing.JRadioButton jRmais;
    private javax.swing.JRadioButton jRmenos;
    private javax.swing.JTextField jTmatricula;
    // End of variables declaration//GEN-END:variables
}
