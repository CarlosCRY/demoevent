module com.ccasais.demoevent {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.ccasais.demoevent to javafx.fxml;
    exports com.ccasais.demoevent;
}