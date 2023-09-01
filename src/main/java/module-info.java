module ex.sdkteam.encryptall {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires net.synedra.validatorfx;

    opens ex.sdkteam.encryptall to javafx.fxml;
    exports ex.sdkteam.encryptall;
}