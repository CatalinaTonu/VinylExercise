package com.example.workshops2session2;

import com.example.workshops2session2.Model.Model;
import com.example.workshops2session2.Model.ModelManager;
import com.example.workshops2session2.View.ViewHandler;
import com.example.workshops2session2.ViewModel.ViewModelFactory;
import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;

public class StartApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Model model = new ModelManager();
        ViewModelFactory viewModelFactory = new ViewModelFactory(model);
        ViewHandler viewHandler = new ViewHandler(viewModelFactory);
        viewHandler.start(stage);

    }

    public static void main(String[] args) {
        launch();
    }
}