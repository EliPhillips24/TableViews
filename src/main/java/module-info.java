module com.example.tableviews {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tableviews to javafx.fxml;
    exports com.example.tableviews;
}