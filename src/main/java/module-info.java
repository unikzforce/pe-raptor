module io.raptor.peraptor {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires org.jfxtras.styles.jmetro;

    requires transitive javafx.web;
    requires transitive javafx.swing;
    requires transitive org.scenicview.scenicview;

    opens io.raptor.peraptor to javafx.fxml;
    exports io.raptor.peraptor;
    exports io.raptor.peraptor.hex;
    opens io.raptor.peraptor.hex to javafx.fxml;
}