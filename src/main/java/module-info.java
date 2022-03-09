module com.game.roguelikeccgsim {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.game.roguelikeccgsim to javafx.fxml;
    exports com.game.roguelikeccgsim;
}