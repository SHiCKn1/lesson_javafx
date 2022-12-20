package org.example;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application{

    VBox mainContainer;

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void init() throws Exception {
        super.init();
        //System.out.println("Инициализация");
    }

    @Override
    public void stop() throws Exception {
        super.stop();
        //System.out.println("После закрытия окна");

    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        //System.out.println("Работа приложения");

        Label label1 = new Label("Hello");
        Label label2 = new Label("Hello!!");
        Button button = new Button("Click");


        mainContainer = new VBox();
        mainContainer.getChildren().add(label1);
        mainContainer.getChildren().add(label2);
        mainContainer.getChildren().add(button);

        run(primaryStage);

    }

    public void run(Stage primaryStage) {
        Scene scene = new Scene(mainContainer, 800, 600);
        primaryStage.setTitle("Title");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}