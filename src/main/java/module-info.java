module ucf.assingments.project4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ucf.assignments.project4 to javafx.fxml;
    exports ucf.assignments.project4;
}