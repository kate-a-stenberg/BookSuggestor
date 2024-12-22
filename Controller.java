/*
FINAL PROJECT
Controller1 class file
12/7/2023
Kate Stenberg
 */

import java.io.FileNotFoundException;

public class Controller implements ControllerI {

    /**
     * This class represents a Controller1, which handles all operations in an application.
     * It has attributes model and view.
     */

    private ModelI model;
    private ViewI view;

    /**
     * Constructs a Controller1 with all arguments
     * @param model the ModelI to use with the controller
     * @param view the ViewI to use with the controller
     */
    public Controller(ModelI model, ViewI view) {
        this.model = model;
        this.view = view;
    }

    /**
     * runs all this application's operations through either the model or the view
     * @throws FileNotFoundException if the file needed by the model doesn't exist
     */
    @Override
    public void go() throws FileNotFoundException {
        // asks the model to make the book list
        model.makeBookList();
        // gets the book from the view and tells the model to use it
        model.setOrigBook(view.getBook());
        // asks the model to compare and get results
        model.makeResultsList();
        // asks the model to sort results
        model.sortResults();
        // asks the model tofilter results
        model.filterResults();
        // gets the results from the model and asks the view to display the results
        view.showResults(model.getResults());
    }

}
