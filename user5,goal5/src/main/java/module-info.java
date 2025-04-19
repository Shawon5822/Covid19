module oop_project.ugoal5 {
    requires javafx.controls;
    requires javafx.fxml;


    opens oop_project.ugoal5 to javafx.fxml;
    exports oop_project.ugoal5;
}