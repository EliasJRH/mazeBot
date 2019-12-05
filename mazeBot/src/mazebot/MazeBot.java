package mazebot;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerListModel;
import javax.swing.border.Border;

/**
 *
 * Student: Elias Hawa Teacher: Mr Schwartz Assignment: Mazebot
 *
 */
public class MazeBot {

    static JLabel mazeTiles[][] = new JLabel[26][26]; //public 2d jlabel array to hold all the tiles of the maze
    static String[] directions = new String[]{"North", "East", "South", "West"}; //Public string array to hold the directions displayed in the jspinners
    static JSpinner d1 = new JSpinner(new SpinnerListModel(directions)); //Jspinners for all 4 directions, the spinnerlistmodel is set to the directions array
    static JSpinner d2 = new JSpinner(new SpinnerListModel(directions));
    static JSpinner d3 = new JSpinner(new SpinnerListModel(directions));
    static JSpinner d4 = new JSpinner(new SpinnerListModel(directions));
    static boolean exitFound = false; //boolean to check if the exit has been found 
    static String[] userSetDirections = new String[4]; //Blank array to hold the directions that the user picks in the order they pick them 
    static String Black = "java.awt.Color[r=0,g=0,b=0]"; //String values of colors that the jlabels could change into so they can be checked against each other
    static String White = "java.awt.Color[r=255,g=255,b=255]";
    static String Yellow = "java.awt.Color[r=255,g=255,b=0]";
    static String Green = "java.awt.Color[r=0,g=255,b=0]";
    static String Red = "java.awt.Color[r=255,g=0,b=0]";
    static String Blue = "java.awt.Color[r=0,g=0,b=255]";
    static JFrame maze = new JFrame("Maze bot"); //public frame to hold the maze 
    static controlPanel controlPanel = new controlPanel(); //static control panel class
    static boolean autoSolve = false; //boolean to check if the auto solve feature is enabled
    static int startX = 0, startY = 0; //static ints to hold the x and y positions of the startig coordinate

    public static void main(String[] args) throws FileNotFoundException, InterruptedException {
        createMazeFrame(); //Calls the createMazeFrame method
        createMazeBorder(); //Calls the createMazeBorder method
        createControlPanel(); //Calls the createControlPanel method
        createDefaultMaze(); //Calls the createDeafultMaze method
    } //main method to call all the other methods

    public static boolean createMazeFrame() {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize(); //gets the screen size of the monitor
        int width = (int) screenSize.getWidth(); //sets int width to the width of the screen
        int height = (int) screenSize.getHeight(); //sets int height to the height of the screen
        maze.setSize(width, height); //sets the size of the frame  
        maze.setResizable(false); //makes it so that the frame isnt resizable
        maze.setVisible(true); //sets the frame to make it visible
        maze.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //sets the frame so the program stops when its closed 
        maze.setLayout(new GridLayout(26, 26)); //Creates a grid layout the same size as the grid for the game of life 
        for (int rowNum = 0; rowNum < mazeTiles.length; rowNum++) {
            for (int columnNum = 0; columnNum < mazeTiles[rowNum].length; columnNum++) {
                mazeTiles[rowNum][columnNum] = new JLabel(); //Initailizes the jlabel
                Border blackline = BorderFactory.createLineBorder(Color.black); //creates a black border with border factory
                mazeTiles[rowNum][columnNum].setBorder(blackline); //adds the black border to each label
                maze.add(mazeTiles[rowNum][columnNum]); //Adds each jlabel to the frame, each jlabel is added in sequence of the grid layout so it's already organized 
                mazeTiles[rowNum][columnNum].setOpaque(true); //sets the opaqueness of each jlabel to true, this is so the color of the jlabel can be seen to be changed 
            }
        }
        maze.validate(); //validates board so graphics properly load 
        return (true); //return statement
    } //method to create the actualy JFrame that contains the maze

    public static boolean createMazeBorder() { //creates the outline a default shape as the maze
        for (int rowNum = 0; rowNum < mazeTiles.length; rowNum++) { //for every row
            for (int columnNum = 0; columnNum < mazeTiles.length; columnNum++) { //for every column in each row 
                if (rowNum == 0 || rowNum == 25) { //If the row number is the first or the last 
                    mazeTiles[rowNum][columnNum].setBackground(Color.BLACK); //set every jlabel background color to black
                } else { //else
                    mazeTiles[rowNum][0].setBackground(Color.BLACK); //Only set the first and last JLabels to black to create a full square
                    mazeTiles[rowNum][25].setBackground(Color.BLACK);
                }
            }
        }
        return (true); //returns the method to where it was called from  
    } //method to add the border of the maze

    public static boolean createDefaultMaze() throws FileNotFoundException, InterruptedException {
        File defaultMaze = new File(controlPanel.currentFile); //Defines a file variable as the source default maze file 
        Scanner mazeReader = new Scanner(defaultMaze); //Declares scanner to read the file  
        String textFileLine = ""; //empty string to hold each line in the file 
        int rowNum = 0; //Integer to how the row number of the file in correspondance with it's position in the 2d jlabel array
        while (mazeReader.hasNext()) { //while there are still lines to read in the text file 
            textFileLine = mazeReader.nextLine(); //sets the string variable as the next line of the file
            for (int columnNum = 0; columnNum < mazeTiles[rowNum].length; columnNum++) { //For loop that run for every column in each row
                if (String.valueOf(textFileLine.charAt(columnNum)).equals("#")) { //If the character is "#"
                    mazeTiles[rowNum][columnNum].setBackground(Color.BLACK); //Sets the background color to black
                } else if (String.valueOf(textFileLine.charAt(columnNum)).equals(".")) {//If the character is "."
                    mazeTiles[rowNum][columnNum].setBackground(Color.WHITE); //Sets the background color to white 
                } else if (String.valueOf(textFileLine.charAt(columnNum)).equals("E")) { //If the character is "E"
                    mazeTiles[rowNum][columnNum].setBackground(Color.YELLOW); //Sets the background color to yellow to indicate the end point
                } else if (String.valueOf(textFileLine.charAt(columnNum)).equals("S")) { // If the character is "S"
                    startX = rowNum; //sets the x and y coordiantes of the start value 
                    startY = columnNum;
                    mazeTiles[rowNum][columnNum].setBackground(Color.GREEN); //Sets the background color to green to indicate start point
                }
                Thread.sleep(2); //Thread.sleep to make the graphics load in a fancy way
            }
            rowNum++; //Increases the count of rowNum
        }
        return (true); //return statement
    } //creates the default maze design from the textfile in the program files 

    public static boolean createControlPanel() {
        controlPanel.setVisible(true); //calls the class controlPanel, because it extends JFrame, we can set the whole class structure to true to display the frame
        return (true);
    } //Method to call the controlPanel class to set up the control panel

    public static boolean setNewMaze() {
        for (int rowNum = 0; rowNum < mazeTiles.length; rowNum++) { //for every row in the maze tile array
            for (int columnNum = 0; columnNum < mazeTiles[rowNum].length; columnNum++) { //for every column in each row 
                mazeTiles[rowNum][columnNum].setBackground(Color.WHITE); //set the background color to white 
            }
        }
        return (true); //return to where the method was called 
    } //Method that creates a blank slate of a maze for the user to maze their own maze

    public static boolean initializeCreateMazeCP() {
        createMazeCP createMazeCP = new createMazeCP();
        controlPanel.setVisible(false); //Sets the default control panel visible to false
        createMazeCP.setVisible(true);
        return (true); //return statement 
    } //Method to create the control panel to create a new maze

}
