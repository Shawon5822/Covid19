module oop_project.patient {
    requires javafx.controls;
    requires javafx.fxml;


    opens oop_project.patient to javafx.fxml;
    exports oop_project.patient;
}