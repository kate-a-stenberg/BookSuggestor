/*
FINAL PROJECT
ControllerI interface file
12/7/2023
Kate Stenberg
 */

import java.io.FileNotFoundException;

/**
 * This interface contains all operations that all ControllerI classes should support
 */
public interface ControllerI {

    /**
     * runs all this application's operations through either the model or the view
     * @throws FileNotFoundException if the file needed by the model doesn't exist
     */
    void go() throws FileNotFoundException;

}
