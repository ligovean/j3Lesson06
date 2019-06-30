public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("chat/fxml/sample.fxml"));


        primaryStage.setTitle("Chat");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.setMaxWidth(300);
        primaryStage.setMinWidth(300);
        primaryStage.setMinHeight(275);
        primaryStage.getIcons().add(new Image("chat/img/btnArr1.png"));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}