module com.example.flags {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.flags to javafx.fxml;
    exports com.example.flags;
}