module io.raptor.peraptor {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires org.jfxtras.styles.jmetro;


    opens io.raptor.peraptor to javafx.fxml;
    exports io.raptor.peraptor;
    exports io.raptor.peraptor.hex;
    opens io.raptor.peraptor.hex to javafx.fxml;
}