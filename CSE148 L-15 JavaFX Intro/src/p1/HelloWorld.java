package p1;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class HelloWorld extends Application{

	public static void main(String[] args) {
		launch(args);
	}//launch performs much background stuff

	@Override
	public void start(Stage primaryStage) throws Exception {
		Label nameLbl = new Label("User Name");
		Label passwdLbl = new Label("Password");

		nameLbl.setText("User Name"); //labels have .setText method and .getText method. Same for textfields and buttons
		System.out.println(nameLbl.getText());

		Button btn1 = new Button("Hello!"); //buttons = controls
		Button btn2 = new Button("World!");
		TextField txtField1 = new TextField();// text = controls
		txtField1.setText("John"); //setText for Textfield
		txtField1.setPromptText("Username"); //label inside text field
		PasswordField txtField2 = new PasswordField();
		txtField2.setPromptText("Password");
		//txtField2.setText("Hello");

		HBox box2 = new HBox(30);
		HBox box3 = new HBox(30);
		VBox box1 = new VBox(20); //your container

		box2.getChildren().addAll(nameLbl, txtField1, btn1);
		box3.getChildren().addAll(passwdLbl, txtField2, btn2);

		box1.setAlignment(Pos.CENTER);
		box2.setAlignment(Pos.CENTER);
		box3.setAlignment(Pos.CENTER);

		box1.getChildren().addAll(box2, box3); //ask container to retrieve children from before
		Scene aScene = new Scene(box1, 900, 200);
		primaryStage.setScene(aScene);
		primaryStage.show();
	}

}
