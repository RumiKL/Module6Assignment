package application;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class moduleSix extends Application{
	public static void main(String[] args) {
		launch(args);
}
	private Stage primaryStage;

	public void start(Stage arg0) throws Exception {
		Button btn = new Button ("Click me");
		btn.setOnAction(new EventHandler<ActionEvent>() {

			public void handle(ActionEvent event) {
											
					HashMap<String, Integer> map = new HashMap<String, Integer>();
									
					Scanner txtFile = null;
					try {
						txtFile = new Scanner(new File ("C:\\Users\\MALew\\Desktop\\Module2\\assignmentmodule2\\The Project Gutenberg eBook of The Raven, by Edgar Allan Poe.txt"));
					} catch (FileNotFoundException e) {
						
						e.printStackTrace();
					}
					
					while (txtFile.hasNext()) {
						String word = txtFile.next();
						if (map.containsKey(word)){
							int count = map.get(word) + 1;
							map.put(word, count);
						}
						else {
							map.put(word, 1);
						}
					}
					txtFile.close();
					
					for (Map.Entry<String, Integer> entry : map.entrySet()) {
						System.out.println(entry);
					}
				}
					
	});
		StackPane root = new StackPane();
		root.getChildren().add(btn);
		Scene scene = new Scene(root,500,300);
		primaryStage.setScene(scene);
		primaryStage.show();
		
	
	
	}
}
