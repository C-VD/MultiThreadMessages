module com.example.multithreadmessages {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.multithreadmessages to javafx.fxml;
    exports com.example.multithreadmessages;
}