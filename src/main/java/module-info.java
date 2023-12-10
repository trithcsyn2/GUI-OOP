module com.example.oopgui {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.oopgui to javafx.fxml;
    exports com.example.oopgui;
}