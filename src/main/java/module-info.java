module no.hvl.dat110.aciotdevice {
    requires javafx.controls;
    requires javafx.fxml;


    opens no.hvl.dat110.aciotdevice.main to javafx.fxml;
    exports no.hvl.dat110.aciotdevice.main;
}