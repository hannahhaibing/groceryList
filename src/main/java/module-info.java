module com.example {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.svgs to javafx.fxml;
    exports com.svgs;
}
