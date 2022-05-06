package io.raptor.peraptor.hex;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.SimpleLongProperty;
import javafx.beans.property.SimpleStringProperty;

import java.util.List;

public class HexTableRowModel {

    public HexTableRowModel(Long address, List<Integer> values) {
        if (values.size() < 16) {
            values = List.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);
        }
        this.address = new SimpleLongProperty(address);
        this.col0 = new SimpleStringProperty(String.format("%02x", values.get(0)));
        this.col1 = new SimpleStringProperty(String.format("%02x", values.get(1)));
        this.col2 = new SimpleStringProperty(String.format("%02x", values.get(2)));
        this.col3 = new SimpleStringProperty(String.format("%02x", values.get(3)));
        this.col4 = new SimpleStringProperty(String.format("%02x", values.get(4)));
        this.col5 = new SimpleStringProperty(String.format("%02x", values.get(5)));
        this.col6 = new SimpleStringProperty(String.format("%02x", values.get(6)));
        this.col7 = new SimpleStringProperty(String.format("%02x", values.get(7)));
        this.col8 = new SimpleStringProperty(String.format("%02x", values.get(8)));
        this.col9 = new SimpleStringProperty(String.format("%02x", values.get(9)));
        this.colA = new SimpleStringProperty(String.format("%02x", values.get(10)));
        this.colB = new SimpleStringProperty(String.format("%02x", values.get(11)));
        this.colC = new SimpleStringProperty(String.format("%02x", values.get(12)));
        this.colD = new SimpleStringProperty(String.format("%02x", values.get(13)));
        this.colE = new SimpleStringProperty(String.format("%02x", values.get(14)));
        this.colF = new SimpleStringProperty(String.format("%02x", values.get(15)));
    }

    private SimpleLongProperty address;
    private SimpleStringProperty col0;
    private SimpleStringProperty col1;
    private SimpleStringProperty col2;
    private SimpleStringProperty col3;
    private SimpleStringProperty col4;
    private SimpleStringProperty col5;
    private SimpleStringProperty col6;
    private SimpleStringProperty col7;
    private SimpleStringProperty col8;
    private SimpleStringProperty col9;
    private SimpleStringProperty colA;
    private SimpleStringProperty colB;
    private SimpleStringProperty colC;
    private SimpleStringProperty colD;
    private SimpleStringProperty colE;
    private SimpleStringProperty colF;

    public long getAddress() {
        return address.get();
    }

    public SimpleLongProperty addressProperty() {
        return address;
    }

    public String getCol0() {
        return col0.get();
    }

    public SimpleStringProperty col0Property() {
        return col0;
    }

    public String getCol1() {
        return col1.get();
    }

    public SimpleStringProperty col1Property() {
        return col1;
    }

    public String getCol2() {
        return col2.get();
    }

    public SimpleStringProperty col2Property() {
        return col2;
    }

    public String getCol3() {
        return col3.get();
    }

    public SimpleStringProperty col3Property() {
        return col3;
    }

    public String getCol4() {
        return col4.get();
    }

    public SimpleStringProperty col4Property() {
        return col4;
    }

    public String getCol5() {
        return col5.get();
    }

    public SimpleStringProperty col5Property() {
        return col5;
    }

    public String getCol6() {
        return col6.get();
    }

    public SimpleStringProperty col6Property() {
        return col6;
    }

    public String getCol7() {
        return col7.get();
    }

    public SimpleStringProperty col7Property() {
        return col7;
    }

    public String getCol8() {
        return col8.get();
    }

    public SimpleStringProperty col8Property() {
        return col8;
    }

    public String getCol9() {
        return col9.get();
    }

    public SimpleStringProperty col9Property() {
        return col9;
    }

    public String getColA() {
        return colA.get();
    }

    public SimpleStringProperty colAProperty() {
        return colA;
    }

    public String getColB() {
        return colB.get();
    }

    public SimpleStringProperty colBProperty() {
        return colB;
    }

    public String getColC() {
        return colC.get();
    }

    public SimpleStringProperty colCProperty() {
        return colC;
    }

    public String getColD() {
        return colD.get();
    }

    public SimpleStringProperty colDProperty() {
        return colD;
    }

    public String getColE() {
        return colE.get();
    }

    public SimpleStringProperty colEProperty() {
        return colE;
    }

    public String getColF() {
        return colF.get();
    }

    public SimpleStringProperty colFProperty() {
        return colF;
    }
}
