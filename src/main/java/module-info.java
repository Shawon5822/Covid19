module oop_project.covid19 {
    requires javafx.controls;
    requires javafx.fxml;


    opens oop_project.covid19 to javafx.fxml;
    exports oop_project.covid19;
}