package mazebot;

import java.awt.Color;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * Student: Elias Hawa Teacher: Mr Schwartz
 *
 */
public class controlPanel extends javax.swing.JFrame {

    static String currentFile = "Mazes/defaultMaze.txt";
    int timesRun = 0;
    static boolean mazeFound = false;

    public controlPanel() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        resetButton = new javax.swing.JButton();
        jSpinner1 = new javax.swing.JSpinner();
        jSpinner2 = new javax.swing.JSpinner();
        jSpinner3 = new javax.swing.JSpinner();
        jSpinner4 = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        runBotButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        autoSolveButton = new javax.swing.JButton();
        createMazeButton = new javax.swing.JButton();
        jProgressBar1 = new javax.swing.JProgressBar();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Control Panel");
        setAlwaysOnTop(true);
        setName("Control Panel"); // NOI18N
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Direction 1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 21, 65, -1));

        jLabel2.setText("Direction 2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 21, 65, -1));

        jLabel3.setText("Direction 3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 21, -1, -1));

        jLabel4.setText("Direction 4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(221, 21, -1, -1));

        resetButton.setText("Reset");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });
        getContentPane().add(resetButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 23, 77, 44));

        jSpinner1.setModel(new javax.swing.SpinnerListModel(new String[] {"North", "East", "South", "West"}));
        jSpinner1.setToolTipText("");
        jSpinner1.setValue(jSpinner1.getValue());
        getContentPane().add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 41, -1, -1));

        jSpinner2.setModel(new javax.swing.SpinnerListModel(new String[] {"North", "East", "South", "West"}));
        jSpinner2.setToolTipText("");
        jSpinner2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jSpinner2.setValue(jSpinner2.getValue());
        getContentPane().add(jSpinner2, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 41, -1, -1));

        jSpinner3.setModel(new javax.swing.SpinnerListModel(new String[] {"North", "East", "South", "West"}));
        jSpinner3.setToolTipText("");
        jSpinner3.setValue(jSpinner3.getValue());
        getContentPane().add(jSpinner3, new org.netbeans.lib.awtextra.AbsoluteConstraints(221, 41, -1, -1));

        jSpinner4.setModel(new javax.swing.SpinnerListModel(new String[] {"North", "East", "South", "West"}));
        jSpinner4.setToolTipText("");
        jSpinner4.setValue(jSpinner4.getValue());
        getContentPane().add(jSpinner4, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 41, -1, -1));

        jLabel5.setText("Use the directions to change how the bot naviagtes the maze");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 73, 348, -1));

        runBotButton.setText("Run Bot");
        runBotButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                runBotButtonActionPerformed(evt);
            }
        });
        getContentPane().add(runBotButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 101, 98, -1));

        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });
        getContentPane().add(exitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 101, 70, -1));

        autoSolveButton.setText("Auto-Solve");
        autoSolveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                autoSolveButtonActionPerformed(evt);
            }
        });
        getContentPane().add(autoSolveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 101, 96, -1));

        createMazeButton.setText("Create Maze");
        createMazeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createMazeButtonActionPerformed(evt);
            }
        });
        getContentPane().add(createMazeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(294, 101, -1, -1));

        jProgressBar1.setAutoscrolls(true);
        jProgressBar1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jProgressBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jProgressBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 139, 510, 42));

        File folder = new File("Mazes");
        ArrayList<String> namesOfFiles = new ArrayList<String>();
        File[] listOfFiles = folder.listFiles();
        for (int i = 0; i < listOfFiles.length; i++) {
            if (listOfFiles[i].isFile()) {
                String tempName = listOfFiles[i].getName();
                tempName.substring(tempName.length() - 4, tempName.length());
                namesOfFiles.add(tempName);
            }
            jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
            jComboBox1.setAction(jComboBox1.getAction());
            jComboBox1.setModel(new DefaultComboBoxModel(namesOfFiles.toArray()));
            jComboBox1.addItemListener(new java.awt.event.ItemListener() {
                public void itemStateChanged(java.awt.event.ItemEvent evt) {
                    mazeChange(evt);
                }
            });
            jComboBox1.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mousePressed(java.awt.event.MouseEvent evt) {
                    jComboBox1MousePressed(evt);
                }
            });
            jComboBox1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jComboBox1ActionPerformed(evt);
                }
            });
            getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, 120, 30));

            jLabel6.setText("Select a maze");
            getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, -1, -1));

            pack();
        }// </editor-fold>//GEN-END:initComponents
    }

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        System.exit(0); //If the button is clicked, then the program exits 
    }//GEN-LAST:event_exitButtonActionPerformed
    //Action listener for the exit jbutton

    private void runBotButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_runBotButtonActionPerformed
        if (jSpinner1.getValue().equals("North") && (jSpinner2.getValue().equals("North")) && (jSpinner3.getValue().equals("West")) && (jSpinner4.getValue().equals("West"))) {
            try {
                Desktop.getDesktop().browse(new URL("https://www.math.princeton.edu/sites/default/files/styles/portrait/public/2017-03/conway.jpg?itok=SIuqZXe2").toURI()); //Opens a url
            } catch (Exception f) { //catch exception to open url
                f.printStackTrace();
            }//When this button is pressed, it first checks if two of the same directions have been selected, if they have then the bot doesnt run
        } else if (jSpinner2.getValue().equals(jSpinner1.getValue()) || jSpinner2.getValue().equals(jSpinner3.getValue()) || jSpinner2.getValue().equals(jSpinner4.getValue())) {
            JOptionPane.showMessageDialog(null, "Can't move the same direction twice", "Invalid direction input 2", JOptionPane.ERROR_MESSAGE);
        } else if (jSpinner3.getValue().equals(jSpinner1.getValue()) || jSpinner3.getValue().equals(jSpinner2.getValue()) || jSpinner3.getValue().equals(jSpinner4.getValue())) {
            JOptionPane.showMessageDialog(null, "Can't move the same direction twice", "Invalid direction input 3", JOptionPane.ERROR_MESSAGE);
        } else if (jSpinner4.getValue().equals(jSpinner1.getValue()) || jSpinner4.getValue().equals(jSpinner2.getValue()) || jSpinner4.getValue().equals(jSpinner3.getValue())) {
            JOptionPane.showMessageDialog(null, "Can't move the same direction twice", "Invalid direction input 4", JOptionPane.ERROR_MESSAGE);
        } else if (jSpinner1.getValue().equals(jSpinner2.getValue()) || jSpinner1.getValue().equals(jSpinner3.getValue()) || jSpinner1.getValue().equals(jSpinner4.getValue())) {
            JOptionPane.showMessageDialog(null, "Can't move the same direction twice", "Invalid direction input", JOptionPane.ERROR_MESSAGE);
        } else { //Otherwise if all the directions are unique 
            try { //It calls the runBot method, sending the starting x and y positions as parameters
                runBot(MazeBot.startX, MazeBot.startY);
            } catch (InterruptedException ex) {
                Logger.getLogger(MazeBot.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_runBotButtonActionPerformed
    //Action listener for the run bot button

    private void autoSolveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_autoSolveButtonActionPerformed
        MazeBot.autoSolve = true; //Sets the auto solve boolean to true so the program doesnt grab the directions from the jspinners
        int straightPathCount = 0; //sets the straight path count to zero
        int currentBest = (MazeBot.mazeTiles.length * MazeBot.mazeTiles.length); //Initially has the current best set to the size of the maze as the path will only be smaller
        String bestDirections[] = new String[4]; //string array to hold the best directions that the program has found so far to display at the end of the auto solve function
        File directionFile = new File("allPossibleDirections.txt"); //file variable to hold the text file to read all the directions in order
        Scanner directionRetriever = null; //creates a null scanner
        try {
            directionRetriever = new Scanner(directionFile); //sets the scanner to get the file
            //A file is used to manually tell the program to run all 24 sets of directions in stead of me typing out the same line of code 24 times 
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MazeBot.class.getName()).log(Level.SEVERE, null, ex);
        }
        directionRetriever.useDelimiter(","); //Sets the delimiter of the scanner to "," so it reads the strings properly 
        while (directionRetriever.hasNext()) { //While the scanner still has strings 
            MazeBot.userSetDirections[0] = directionRetriever.next(); //The user set directions are set to the following 4 values that the scanner reads
            MazeBot.userSetDirections[1] = directionRetriever.next();
            MazeBot.userSetDirections[2] = directionRetriever.next();
            MazeBot.userSetDirections[3] = directionRetriever.next();
            try { //try catch to retrieve file
                runBot(MazeBot.startX, MazeBot.startY); //After this, the runBot method is called with the directions retrieved by the scanner and the static x and y start positions
            } catch (InterruptedException ex) {
                Logger.getLogger(MazeBot.class.getName()).log(Level.SEVERE, null, ex);
            }
            straightPathCount = countStraightTiles(straightPathCount); //The value of straight path count is retrived from calling this method, which counts all the tiles the bot took to reach the exit
            currentBest = checkPath(straightPathCount, currentBest, bestDirections); //The current best value is determined by the sending the straight path count from this method and comparing with already current best value
            straightPathCount = 0; //The straight path count is then reset for the next set of directions to be checked
            try {
                Thread.sleep(100); //Thread.sleep to display the path the bot took
            } catch (InterruptedException ex) {
                Logger.getLogger(controlPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                resetMaze(); //The method to reset the maze is called
            } catch (FileNotFoundException ex) {
                Logger.getLogger(MazeBot.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InterruptedException ex) {
                Logger.getLogger(MazeBot.class.getName()).log(Level.SEVERE, null, ex);
            }
            jProgressBar1.setValue(jProgressBar1.getValue() + 4);//Because there are 24 possible different combinations of 4 directions, the loop will run 4 times
            jProgressBar1.update(jProgressBar1.getGraphics()); //updates the graphics of the progressbar
        }
        jProgressBar1.setValue(jProgressBar1.getValue() + 4); //Complete the progressbar
        MazeBot.autoSolve = false; //Turns auto solve off
    }//GEN-LAST:event_autoSolveButtonActionPerformed
    //Action listener for the auto solve button

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        try {
            resetMaze(); //calls the resetMaze method from the mazeBot class
        } catch (FileNotFoundException ex) {
            Logger.getLogger(controlPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(controlPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_resetButtonActionPerformed
    //Action listener for the reset maze button 

    private void createMazeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createMazeButtonActionPerformed
        setNewMaze(); //Calls the set new maze method to clear the board 
        MazeBot.createMazeBorder(); //Calls the create maze border method 
        initializeCreateMazeCP(); //Opens up the create maze control panel
    }//GEN-LAST:event_createMazeButtonActionPerformed
    //Action listener for the create maze button

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        mazeFound = false;
        File fileToFind = new File("Mazes/" + (String) jComboBox1.getSelectedItem()); //sets the file to find as the item that the user selected in the jcombobox
        File folder = new File("Mazes"); //creates a file variable of the folder in which all the files are stored in 
        File[] listOfFiles = folder.listFiles(); //File array that gets all the files inide the folder
        int i = 0;
        timesRun++;
        while (mazeFound == false) { //while it hasn't found the maze    
            if (listOfFiles[i].equals(fileToFind)) { //If the name of the file in element that is being checked matches the name of the file to find
                currentFile = String.valueOf(listOfFiles[i]);
                File mazeToAdd = new File(currentFile); //Defines a file variable as the source default maze file 
                Scanner mazeReader = null;
                try {
                    mazeReader = new Scanner(mazeToAdd); //Declares scanner to read the file
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(controlPanel.class.getName()).log(Level.SEVERE, null, ex);
                }
                String textFileLine = ""; //empty string to hold each line in the file 
                int rowNum = 0; //Integer to how the row number of the file in correspondance with it's position in the 2d jlabel array
                while (mazeReader.hasNext()) { //while there are still lines to read in the text file 
                    textFileLine = mazeReader.nextLine(); //sets the string variable as the next line of the file
                    for (int columnNum = 0; columnNum < MazeBot.mazeTiles[rowNum].length; columnNum++) { //For loop that run for every column in each row
                        if (String.valueOf(textFileLine.charAt(columnNum)).equals("#")) { //If the character is "#"
                            MazeBot.mazeTiles[rowNum][columnNum].setBackground(Color.BLACK); //Sets the background color to black
                        } else if (String.valueOf(textFileLine.charAt(columnNum)).equals(".")) {//If the character is "."
                            MazeBot.mazeTiles[rowNum][columnNum].setBackground(Color.WHITE); //Sets the background color to white 
                        } else if (String.valueOf(textFileLine.charAt(columnNum)).equals("E")) { //If the character is "E"
                            MazeBot.mazeTiles[rowNum][columnNum].setBackground(Color.YELLOW); //Sets the background color to yellow to indicate the end point
                        } else if (String.valueOf(textFileLine.charAt(columnNum)).equals("S")) { // If the character is "S"
                            MazeBot.startX = rowNum; //sets the x and y coordiantes of the start value 
                            MazeBot.startY = columnNum;
                            MazeBot.mazeTiles[rowNum][columnNum].setBackground(Color.GREEN); //Sets the background color to green to indicate start point
                        }
                        MazeBot.mazeTiles[rowNum][columnNum].update(MazeBot.mazeTiles[rowNum][columnNum].getGraphics());
                        //Thread.sleep(2); //Thread.sleep to make the graphics load in a fancy way
                    }
                    rowNum++; //Increases the count of rowNum
                } //The add new maze method is called passing the name of the file 
                mazeFound = true;
            }
            i++;
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void mazeChange(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_mazeChange

    }//GEN-LAST:event_mazeChange

    private void jComboBox1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox1MousePressed

    }//GEN-LAST:event_jComboBox1MousePressed
    //jComboBox listener

    public static void setToTrue() {
        JOptionPane.showMessageDialog(null, "");
        mazeFound = false;
    }

    public static boolean addNewMaze(String fileName) throws InterruptedException, FileNotFoundException {
        File mazeToAdd = new File(fileName); //Defines a file variable as the source default maze file 
        Scanner mazeReader = new Scanner(mazeToAdd); //Declares scanner to read the file  
        String textFileLine = ""; //empty string to hold each line in the file 
        int rowNum = 0; //Integer to how the row number of the file in correspondance with it's position in the 2d jlabel array
        while (mazeReader.hasNext()) { //while there are still lines to read in the text file 
            textFileLine = mazeReader.nextLine(); //sets the string variable as the next line of the file
            for (int columnNum = 0; columnNum < MazeBot.mazeTiles[rowNum].length; columnNum++) { //For loop that run for every column in each row
                if (String.valueOf(textFileLine.charAt(columnNum)).equals("#")) { //If the character is "#"
                    MazeBot.mazeTiles[rowNum][columnNum].setBackground(Color.BLACK); //Sets the background color to black
                } else if (String.valueOf(textFileLine.charAt(columnNum)).equals(".")) {//If the character is "."
                    MazeBot.mazeTiles[rowNum][columnNum].setBackground(Color.WHITE); //Sets the background color to white 
                } else if (String.valueOf(textFileLine.charAt(columnNum)).equals("E")) { //If the character is "E"
                    MazeBot.mazeTiles[rowNum][columnNum].setBackground(Color.YELLOW); //Sets the background color to yellow to indicate the end point
                } else if (String.valueOf(textFileLine.charAt(columnNum)).equals("S")) { // If the character is "S"
                    MazeBot.startX = rowNum; //sets the x and y coordiantes of the start value 
                    MazeBot.startY = columnNum;
                    MazeBot.mazeTiles[rowNum][columnNum].setBackground(Color.GREEN); //Sets the background color to green to indicate start point
                }
                MazeBot.mazeTiles[rowNum][columnNum].update(MazeBot.mazeTiles[rowNum][columnNum].getGraphics());
                Thread.sleep(2); //Thread.sleep to make the graphics load in a fancy way
            }
            rowNum++; //Increases the count of rowNum
        }
        return (true);
    }

    public void runBot(int rowNum, int columnNum) throws InterruptedException {
        if (MazeBot.autoSolve == false) { //checks if auto solve is turned on 
            MazeBot.userSetDirections[0] = String.valueOf(jSpinner1.getValue()); //If it isn't then the method uses the directions from the jspinner and not from the text file
            MazeBot.userSetDirections[1] = String.valueOf(jSpinner2.getValue());
            MazeBot.userSetDirections[2] = String.valueOf(jSpinner3.getValue());
            MazeBot.userSetDirections[3] = String.valueOf(jSpinner4.getValue());
        }
        if (String.valueOf(MazeBot.mazeTiles[rowNum][columnNum].getBackground()).equals(MazeBot.Yellow)) { //checks if the spot that the bot is currently on is the end tile
            MazeBot.exitFound = true; //If so then exitFound is set to true, and the program stops running
        } else {//Otherwise, if the exit hasn't been found 
            MazeBot.mazeTiles[rowNum][columnNum].setBackground(Color.BLUE); //Change the color of the tile to blue 
            MazeBot.mazeTiles[rowNum][columnNum].update(MazeBot.mazeTiles[rowNum][columnNum].getGraphics()); //Updates the graphics of the current JLabel
            Thread.sleep(50); //Thread.sleep to make it look nice
        }

        for (int run = 0; run < MazeBot.userSetDirections.length; run++) { //Because the user can pick whatever set of directions they choose, the directions are then placed in an arrya
            //The array is read from with a for loop
            String currentDirection = MazeBot.userSetDirections[run]; //A string value of the direction at the current index of the array is stored
            if ((currentDirection.equals("North")) && (MazeBot.exitFound == false) && ((String.valueOf(MazeBot.mazeTiles[rowNum - 1][columnNum].getBackground()).equals(MazeBot.White)) || (String.valueOf(MazeBot.mazeTiles[rowNum - 1][columnNum].getBackground()).equals(MazeBot.Yellow)))) {
                //A really long if statement to make sure that the exit hasn't been found, that the tile is blank in that direction or that the exit is in that direction
                //If all of those checks pass, then the method is called again
                runBot(rowNum - 1, columnNum);
            } //This is the same process for all 4 directions
            if ((currentDirection.equals("East")) && (MazeBot.exitFound == false) && ((String.valueOf(MazeBot.mazeTiles[rowNum][columnNum + 1].getBackground()).equals(MazeBot.White)) || (String.valueOf(MazeBot.mazeTiles[rowNum][columnNum + 1].getBackground()).equals(MazeBot.Yellow)))) {
                runBot(rowNum, columnNum + 1);
            }
            if ((currentDirection.equals("South")) && (MazeBot.exitFound == false) && ((String.valueOf(MazeBot.mazeTiles[rowNum + 1][columnNum].getBackground()).equals(MazeBot.White)) || (String.valueOf(MazeBot.mazeTiles[rowNum + 1][columnNum].getBackground()).equals(MazeBot.Yellow)))) {
                runBot(rowNum + 1, columnNum);
            }
            if ((currentDirection.equals("West")) && (MazeBot.exitFound == false) && ((String.valueOf(MazeBot.mazeTiles[rowNum][columnNum - 1].getBackground()).equals(MazeBot.White)) || (String.valueOf(MazeBot.mazeTiles[rowNum][columnNum - 1].getBackground()).equals(MazeBot.Yellow)))) {
                runBot(rowNum, columnNum - 1);
            }
        }

        if (MazeBot.exitFound == true) { //If the exit has been found
            MazeBot.mazeTiles[rowNum][columnNum].setBackground(Color.RED); //The program sets all the tiles actually used to go straight to the end to red
        }

    } //method that will run the mazeBot

    public static boolean resetMaze() throws FileNotFoundException, InterruptedException {
        MazeBot.exitFound = false; //Sets the exitFound to false so the maze can run again
        clearBoard(); //Calls the createMazeBorder method
        addNewMaze(currentFile); //calls the add new maze method passing the current file so the same maze is loaded again
        return (true);
    } //Method to clear or reset the maze

    public static boolean clearBoard() throws InterruptedException {
        for (int rowNum = 0; rowNum < MazeBot.mazeTiles.length; rowNum++) {
            for (int columnNum = 0; columnNum < MazeBot.mazeTiles[rowNum].length; columnNum++) {
                MazeBot.mazeTiles[rowNum][columnNum].setBackground(Color.WHITE);
                Thread.sleep(1);
                MazeBot.mazeTiles[rowNum][columnNum].update(MazeBot.mazeTiles[rowNum][columnNum].getGraphics());
            }
        }
        return (true);
    }

    public static int countStraightTiles(int straightPathCount) {
        for (int rowNum = 0; rowNum < MazeBot.mazeTiles.length; rowNum++) { //For each row 
            for (int columnNum = 0; columnNum < MazeBot.mazeTiles[rowNum].length; columnNum++) { //For each column in each row 
                if ((String.valueOf(MazeBot.mazeTiles[rowNum][columnNum].getBackground()).equals(MazeBot.Red)) || (String.valueOf(MazeBot.mazeTiles[rowNum][columnNum].getBackground()).equals(MazeBot.Blue))) {
                    //If the color value of the current tile is either red or blue
                    straightPathCount++; //The count increases by one
                } //This is used with the auto solve function to compare the fastest route 
            }
        }
        return (straightPathCount); //returns the straight path count as a value 
    } //Method that counts the total amount of tiles the bot went through before reaching the exit 

    public static int checkPath(int straightPathCount, int currentBest, String[] bestDirections) {
        if (straightPathCount < currentBest) { //The straightPathCount from above is compared to the current fastest route (default set to 26*26 - size of the maze)
            currentBest = straightPathCount; //If its smaller, the currentBest value is updated 
            bestDirections[0] = MazeBot.userSetDirections[0];  //Each element in the best directions array is updated with the corresponding value from the userSetDirections that were set in that instance 
            bestDirections[1] = MazeBot.userSetDirections[1];
            bestDirections[2] = MazeBot.userSetDirections[2];
            bestDirections[3] = MazeBot.userSetDirections[3];
        }
        return (currentBest); //Returns the value of the current best
    }

    public static boolean setNewMaze() {
        for (int rowNum = 0; rowNum < MazeBot.mazeTiles.length; rowNum++) { //for every row in the maze tile array
            for (int columnNum = 0; columnNum < MazeBot.mazeTiles[rowNum].length; columnNum++) { //for every column in each row 
                MazeBot.mazeTiles[rowNum][columnNum].setBackground(Color.WHITE); //set the background color to white 
            }
        }
        return (true); //return to where the method was called 
    } //Method that creates a blank slate of a maze for the user to maze their own maze

    public boolean initializeCreateMazeCP() {
        createMazeCP2 MazeControlPanel = new createMazeCP2(); //creates new object of the create maze control panel
        this.setVisible(false); //Sets the control panel visible to false
        MazeControlPanel.setVisible(true); //sets the create maze control panel visible to true
        return (true); //return statement 
    } //Method to create the control panel to create a new maze

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Dark".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(controlPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(controlPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(controlPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(controlPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new controlPanel().setVisible(true);
            }
        });
    } //Main method that sets the frame to be visible

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton autoSolveButton;
    private javax.swing.JButton createMazeButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JSpinner jSpinner3;
    private javax.swing.JSpinner jSpinner4;
    private javax.swing.JButton resetButton;
    private javax.swing.JButton runBotButton;
    // End of variables declaration//GEN-END:variables
}
