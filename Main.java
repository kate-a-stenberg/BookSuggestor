/*
FINAL PROJECT
Main file
12/7/2023
Kate Stenberg
 */

import java.io.FileNotFoundException;


public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        ViewI v = new View(); // assign the view
        ModelI m = new Model(); // assign the model
        ControllerI c = new Controller(m, v); // assign the controller

        c.go(); // go

    }
}