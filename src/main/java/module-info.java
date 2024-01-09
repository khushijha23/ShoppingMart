module com.shopping.shopping {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.shopping.shopping to javafx.fxml;
    exports com.shopping.shopping;
}