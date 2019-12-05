package mazebot;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Elias
 */
public class createMazeCP extends javax.swing.JFrame {

    static int[][] labelValues = new int[26][26];

    public createMazeCP() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        saveMazeButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        mazeName = new javax.swing.JTextField();
        exitButton = new javax.swing.JButton();
        goBackButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Create Maze Control Panel");
        setAlwaysOnTop(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                startUpStuff(evt);
            }
        });

        saveMazeButton.setText("Save Maze");
        saveMazeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveMazeButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Click on each tile to cycle through the possible colors");

        jLabel2.setText("NOTE: Each maze MUST have exactly one start point and end point ");

        mazeName.setText("UntitledMaze");

        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        goBackButton.setText("Go Back");
        goBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goBackButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(mazeName, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(goBackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(saveMazeButton))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(exitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel2))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(exitButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mazeName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(goBackButton)
                    .addComponent(saveMazeButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveMazeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveMazeButtonActionPerformed

    }//GEN-LAST:event_saveMazeButtonActionPerformed
    //button to save the current maze shape

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        System.exit(0); //If the button is clicked, then the program exits 
    }//GEN-LAST:event_exitButtonActionPerformed
    //Exit button action performed

    private void goBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goBackButtonActionPerformed
        intializeLabelValues();
        MazeBot.createMazeBorder(); //creates the maze border
        try { //try catch statement to get the file for the default maze
            MazeBot.createDefaultMaze(); //creates the default maze shape
        } catch (FileNotFoundException ex) {
            Logger.getLogger(createMazeCP.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(createMazeCP.class.getName()).log(Level.SEVERE, null, ex);
        }
        controlPanel cp = new controlPanel(); //creates new control panel object
        cp.setVisible(true); //sets it visible to true
        this.setVisible(false); //sets the current object visible to false
    }//GEN-LAST:event_goBackButtonActionPerformed
    //button to go back to regular maze bot 
    
    private void startUpStuff(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_startUpStuff
        intializeLabelValues();
        for (int rowNum = 0; rowNum < MazeBot.mazeTiles.length; rowNum++) { //For each row in the mazeTiles
            for (int columnNum = 0; columnNum < MazeBot.mazeTiles[rowNum].length; columnNum++) { //for each column in each row 
                final int tempRow = rowNum; //Sets the value of the row and column to final 
                final int tempColumn = columnNum;
                MazeBot.mazeTiles[rowNum][columnNum].addMouseListener(new MouseAdapter() { //Adds a mouse listener to each jlabel
                    public void mousePressed(MouseEvent e) { //When the mouse is pressed
                        if (labelValues[tempRow][tempColumn] == 0) { //If the corresponding label value was 0
                            MazeBot.mazeTiles[tempRow][tempColumn].setBackground(Color.BLACK); //when clicked change From white change it to black
                            labelValues[tempRow][tempColumn] = 1; //Set the value to one
                        } else if (labelValues[tempRow][tempColumn] == 1) { //If the value was one
                            MazeBot.mazeTiles[tempRow][tempColumn].setBackground(Color.GREEN); //when clicked change from black to green, to indicate starting point
                            labelValues[tempRow][tempColumn] = 2; //change to 2
                        } else if (labelValues[tempRow][tempColumn] == 2) {//If the value was two
                            MazeBot.mazeTiles[tempRow][tempColumn].setBackground(Color.YELLOW); //when clicked change from green to yellow to indicate end point
                            labelValues[tempRow][tempColumn] = 3; //set value to 3
                        } else if (labelValues[tempRow][tempColumn] == 3) {
                            MazeBot.mazeTiles[tempRow][tempColumn].setBackground(Color.WHITE); //when clicked change from yellow to white
                            labelValues[tempRow][tempColumn] = 0; //set value to 0 to cycle back
                        }
                    }

                });
            }
        }
    }//GEN-LAST:event_startUpStuff


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
            java.util.logging.Logger.getLogger(createMazeCP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(createMazeCP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(createMazeCP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(createMazeCP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() { //When the controlPanel opens 
                new createMazeCP().setVisible(true); //Sets the frame visible to true 
            }
        });
    }

    public static boolean intializeLabelValues() {
        for (int rowNum = 0; rowNum < labelValues.length; rowNum++) { //for each row 
            for (int columnNum = 0; columnNum < labelValues[rowNum].length; columnNum++) { //for each column in each row
                labelValues[rowNum][columnNum] = 0; //set the value of the corresponding jlabel to 0
            } //This method is also called when going back to the regular display
        }
        return (true); //return statement
    } //boolean method to intialize all the label values to 0

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exitButton;
    private javax.swing.JButton goBackButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField mazeName;
    private javax.swing.JButton saveMazeButton;
    // End of variables declaration//GEN-END:variables
}
