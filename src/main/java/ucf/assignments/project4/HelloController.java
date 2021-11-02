/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Jeremiah Pike
 */
package ucf.assignments.project4;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void addList() {
        //adds list

    }

    @FXML
    protected void deleteList() {
        //deletes list
    }
    @FXML
    protected void listView() {
        //switch windows
    }

    @FXML
    protected void editList() {
        //edit list
    }
    @FXML
    protected void addItem() {
        //adds new item to list
    }
    @FXML
    protected void deleteItem() {
        //deltes item from list
    }
    @FXML
    protected void editItem() {
        //edit due date and / or description of item
    }

    @FXML
    protected void doneToggle() {
        //toggles a task as complteted or not
    }

    @FXML
    protected void filterCompleted() {
        //show only completed items of list
    }
    @FXML
    protected void filterIncomplete() {
        //show only incomplete items of list
    }

    @FXML
    protected void exportList() {
        //export list to local machine
    }

    @FXML
    protected void exportAllList() {
        //export all items of all lists
    }

    @FXML
    protected void importSingle() {
        //import a single list
    }

    @FXML
    protected void importMultiple() {
        //import multiple lists
    }
    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}