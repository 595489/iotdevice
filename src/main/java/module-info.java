module no.hvl.dat110.aciotdevice {
    requires javafx.controls;
    requires javafx.fxml;


    opens no.hvl.dat110.aciotdevice.main to javafx.fxml;
    exports no.hvl.dat110.aciotdevice.main;

    opens no.hvl.dat110.aciotdevice.controller to javafx.fxml;
    exports no.hvl.dat110.aciotdevice.controller;

    opens no.hvl.dat110.aciotdevice.ui to javafx.fxml;
    exports no.hvl.dat110.aciotdevice.ui;

    opens no.hvl.dat110.aciotdevice.client to javafx.fxml;
    exports no.hvl.dat110.aciotdevice.client;

    opens no.hvl.dat110.aciotdevice.pins to javafx.fxml;
    exports no.hvl.dat110.aciotdevice.pins;
}