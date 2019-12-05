package mazebot;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author s241556
 */
public class createMazeCP2 extends javax.swing.JFrame {

    static int labelValue = 0; //static 2d int array to hold all the values for their corresponding jlabels
    static int startUpCount = 0; //int to check if the create frame class has been activated more than once 
    static String Black = "java.awt.Color[r=0,g=0,b=0]"; //String values of colors that the jlabels could change into so they can be checked against each other
    static String White = "java.awt.Color[r=255,g=255,b=255]";
    static String Yellow = "java.awt.Color[r=255,g=255,b=0]";
    static String Green = "java.awt.Color[r=0,g=255,b=0]";
    static String Red = "java.awt.Color[r=255,g=0,b=0]";
    static String Blue = "java.awt.Color[r=0,g=0,b=255]";
    static boolean enableListeners; //static boolean to enable to mouse listeners only when their in the create maze mode

    public createMazeCP2() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        exitButton = new javax.swing.JButton();
        mazeName = new javax.swing.JTextField();
        goBackButton = new javax.swing.JButton();
        saveMazeButton = new javax.swing.JButton();
        whiteButton = new javax.swing.JButton();
        blackButton = new javax.swing.JButton();
        greenButton = new javax.swing.JButton();
        yellowButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                startUpStuff(evt);
            }
        });

        jLabel1.setText("Click on each button to select a color to edit the tile");

        jLabel2.setText("NOTE: Each maze MUST have exactly ONE start point");

        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        mazeName.setText("UntitledMaze");

        goBackButton.setText("Go Back");
        goBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goBackButtonActionPerformed(evt);
            }
        });

        saveMazeButton.setText("Save Maze");
        saveMazeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveMazeButtonActionPerformed(evt);
            }
        });

        whiteButton.setText("White");
        whiteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                whiteButtonActionPerformed(evt);
            }
        });

        blackButton.setText("Black");
        blackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blackButtonActionPerformed(evt);
            }
        });

        greenButton.setText("Green");
        greenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                greenButtonActionPerformed(evt);
            }
        });

        yellowButton.setText("Yellow");
        yellowButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yellowButtonActionPerformed(evt);
            }
        });

        jLabel3.setText("Green = Start Point, Yellow = End point");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(mazeName, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(whiteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(blackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(greenButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(yellowButton, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(goBackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(saveMazeButton)))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(exitButton)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mazeName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(goBackButton)
                    .addComponent(saveMazeButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(whiteButton)
                    .addComponent(greenButton)
                    .addComponent(yellowButton)
                    .addComponent(blackButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        System.exit(0); //If the button is clicked, then the program exits 
    }//GEN-LAST:event_exitButtonActionPerformed
    //ActionListener for the exit button

    private void goBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goBackButtonActionPerformed
        enableListeners = false; //sets enable Listeners to false so they can't be clicked while in the regular mode
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
    //Action listener for the go back button

    private void saveMazeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveMazeButtonActionPerformed
        String mazeData = ""; //string to hold empty maze builder info 
        PrintWriter mazeCreator = null; //Define print writer
        String fileString = "Mazes/" + mazeName.getText() + ".txt";
        try {
            mazeCreator = new PrintWriter(new FileWriter(fileString));
        } catch (IOException ex) {
            Logger.getLogger(createMazeCP2.class.getName()).log(Level.SEVERE, null, ex);
        }
        int startCount = 0;
        for (int rowNum = 0; rowNum < MazeBot.mazeTiles.length; rowNum++) {
            for (int columnNum = 0; columnNum < MazeBot.mazeTiles[rowNum].length; columnNum++) {
                if (String.valueOf(MazeBot.mazeTiles[rowNum][columnNum].getBackground()).equals(Green)) {
                    startCount++;
                }
            }
        }
        if (startCount != 1) { //checks to make sure the maze only has one start point
            JOptionPane.showMessageDialog(null, "Cannot have more than one start point", "Cannot create maze", JOptionPane.ERROR_MESSAGE);
        } else { //Else if there is only one start point
            for (int rowNum = 0; rowNum < MazeBot.mazeTiles.length; rowNum++) {
                for (int columnNum = 0; columnNum < MazeBot.mazeTiles[rowNum].length; columnNum++) {
                    if (String.valueOf(MazeBot.mazeTiles[rowNum][columnNum].getBackground()).equals(Black)) {
                        mazeData += "#";
                    } else if (String.valueOf(MazeBot.mazeTiles[rowNum][columnNum].getBackground()).equals(White)) {
                        mazeData += ".";
                    } else if (String.valueOf(MazeBot.mazeTiles[rowNum][columnNum].getBackground()).equals(Green)) {
                        mazeData += "S";
                    } else if (String.valueOf(MazeBot.mazeTiles[rowNum][columnNum].getBackground()).equals(Yellow)) {
                        mazeData += "E";
                    }
                }
                mazeCreator.println(mazeData);
                //JOptionPane.showMessageDialog(null, mazeData);
                mazeData = "";
            }
            mazeCreator.close();

        }


    }//GEN-LAST:event_saveMazeButtonActionPerformed

    private void startUpStuff(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_startUpStuff
        enableListeners = true; //Sets the enableListeners to true so the labels can be clicked
        startUpCount++; //increases the value of how many times the user has accessed the create maze option
        if (startUpCount == 1) { //If it is one, then this is their first tie accessing it, so it initially creates all the action listeners
            for (int rowNum = 0; rowNum < MazeBot.mazeTiles.length; rowNum++) { //For each row in the mazeTiles
                for (int columnNum = 0; columnNum < MazeBot.mazeTiles[rowNum].length; columnNum++) { //for each column in each row 
                    final int tempRow = rowNum; //Sets the value of the row and column to final 
                    final int tempColumn = columnNum;
                    MazeBot.mazeTiles[rowNum][columnNum].addMouseListener(new MouseAdapter() { //Adds a mouse listener to each jlabel
                        public void mousePressed(MouseEvent e) { //When the mouse is pressed
                            if (enableListeners == true) {
                                if (labelValue== 0) { //If the value is 0
                                    MazeBot.mazeTiles[tempRow][tempColumn].setBackground(Color.BLACK); //when clicked change From white change it to black
                                } else if (labelValue == 1) { //If the value is one
                                    MazeBot.mazeTiles[tempRow][tempColumn].setBackground(Color.GREEN); //when clicked change from black to green, to indicate starting point
                                } else if (labelValue == 2) {//If the value is two
                                    MazeBot.mazeTiles[tempRow][tempColumn].setBackground(Color.YELLOW); //when clicked change from green to yellow to indicate end point
                                } else if (labelValue == 3) { //if the value is three
                                    MazeBot.mazeTiles[tempRow][tempColumn].setBackground(Color.WHITE); //when clicked change from yellow to white
                                }
                            }

                        }

                    });
                }
            }
        } 
    }//GEN-LAST:event_startUpStuff

    private void blackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blackButtonActionPerformed
        //When the button is clicked 
        labelValue = 0; //The value of what the color of the labels should be changed to is zero, meaning they'll be black
        //This is the same for each of the buttons, but for different values for different colors 
    }//GEN-LAST:event_blackButtonActionPerformed
    //Action listener for the black button
    
    private void whiteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_whiteButtonActionPerformed
        labelValue = 3;
    }//GEN-LAST:event_whiteButtonActionPerformed
    //Action listener for the white button
    
    private void greenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_greenButtonActionPerformed
        labelValue = 1;
    }//GEN-LAST:event_greenButtonActionPerformed
    //Action listener for the green button
    
    private void yellowButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yellowButtonActionPerformed
        labelValue = 2;
    }//GEN-LAST:event_yellowButtonActionPerformed
    //Action listener for the yellow button

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
            java.util.logging.Logger.getLogger(createMazeCP2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(createMazeCP2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(createMazeCP2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(createMazeCP2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new createMazeCP2().setVisible(true);
                
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton blackButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JButton goBackButton;
    private javax.swing.JButton greenButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField mazeName;
    private javax.swing.JButton saveMazeButton;
    private javax.swing.JButton whiteButton;
    private javax.swing.JButton yellowButton;
    // End of variables declaration//GEN-END:variables
}
