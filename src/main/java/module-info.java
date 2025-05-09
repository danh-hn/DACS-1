module com.example.dacs1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires net.sf.jasperreports.core;


    opens hethongquanlinhahang to javafx.fxml;
    exports hethongquanlinhahang;
}