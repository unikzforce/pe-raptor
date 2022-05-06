package io.raptor.peraptor.hex;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.Pane;
import jfxtras.styles.jmetro.JMetroStyleClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class HexPanelController implements Initializable {

    @FXML
    private Pane pane;
    @FXML
    private TableView<HexTableRowModel> hexTableView;

    @FXML
    private TableColumn<HexTableRowModel, Long> address;

    @FXML
    private TableColumn<HexTableRowModel, String> col0;

    @FXML
    private TableColumn<HexTableRowModel, String> col1;

    @FXML
    private TableColumn<HexTableRowModel, String> col2;

    @FXML
    private TableColumn<HexTableRowModel, String> col3;

    @FXML
    private TableColumn<HexTableRowModel, String> col4;

    @FXML
    private TableColumn<HexTableRowModel, String> col5;

    @FXML
    private TableColumn<HexTableRowModel, String> col6;

    @FXML
    private TableColumn<HexTableRowModel, String> col7;

    @FXML
    private TableColumn<HexTableRowModel, String> col8;

    @FXML
    private TableColumn<HexTableRowModel, String> col9;

    @FXML
    private TableColumn<HexTableRowModel, String> colA;

    @FXML
    private TableColumn<HexTableRowModel, String> colB;

    @FXML
    private TableColumn<HexTableRowModel, String> colC;

    @FXML
    private TableColumn<HexTableRowModel, String> colD;

    @FXML
    private TableColumn<HexTableRowModel, String> colE;

    @FXML
    private TableColumn<HexTableRowModel, String> colF;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        pane.getStyleClass().add(JMetroStyleClass.BACKGROUND);
        address.setCellValueFactory(new PropertyValueFactory<>("Address"));
        col0.setCellValueFactory(new PropertyValueFactory<>("Col0"));
        col1.setCellValueFactory(new PropertyValueFactory<>("Col1"));
        col2.setCellValueFactory(new PropertyValueFactory<>("Col2"));
        col3.setCellValueFactory(new PropertyValueFactory<>("Col3"));
        col4.setCellValueFactory(new PropertyValueFactory<>("Col4"));
        col5.setCellValueFactory(new PropertyValueFactory<>("Col5"));
        col6.setCellValueFactory(new PropertyValueFactory<>("Col6"));
        col7.setCellValueFactory(new PropertyValueFactory<>("Col7"));
        col8.setCellValueFactory(new PropertyValueFactory<>("Col8"));
        col9.setCellValueFactory(new PropertyValueFactory<>("Col9"));
        colA.setCellValueFactory(new PropertyValueFactory<>("ColA"));
        colB.setCellValueFactory(new PropertyValueFactory<>("ColB"));
        colC.setCellValueFactory(new PropertyValueFactory<>("ColC"));
        colD.setCellValueFactory(new PropertyValueFactory<>("ColD"));
        colE.setCellValueFactory(new PropertyValueFactory<>("ColE"));
        colF.setCellValueFactory(new PropertyValueFactory<>("ColF"));

        ArrayList<HexTableRowModel> hexModelArrayList = new ArrayList<>();
        try (FileInputStream is = new FileInputStream("C:/Users/unikz/tools/usf.exe")) {
            int b;
            int lineCount=0;
            boolean eof = false;
            long adr = 0L;
            while (!eof) {
                lineCount++;
                ArrayList<Integer> sixteenItems = new ArrayList<>(16);
                for(int i=0; i<16 && !eof; i++) {
                        b = is.read();
                        if (b == -1)
                            eof = true;
                        else
                            sixteenItems.add(b);
                }
                if(sixteenItems.size() > 0)
                    hexModelArrayList.add(new HexTableRowModel(adr, sixteenItems ));
                adr += 16;
            }
        } catch (IOException e) {
//            throw new RuntimeException(e);
        }


        hexTableView.setItems(FXCollections.observableArrayList(hexModelArrayList));
    }

//    private  = FXCollections.observableArrayList(
//        new HexTableRowModel(1L, List.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15))
//    );
}