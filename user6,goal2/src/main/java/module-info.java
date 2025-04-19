module oop_project.goal2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens oop_project.goal2 to javafx.fxml;
    exports oop_project.goal2;
}