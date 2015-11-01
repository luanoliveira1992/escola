package escola.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import escola.model.Aluno;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class EscolaApp extends Application {

	public static Stage primaryStage;
	public static BorderPane rootLayout;
	public static List<Aluno> alunos;

	@Override
	public void start(Stage primaryStage) {

		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("Sistema de Gerenciamento Escolar");
		alunos = new ArrayList<Aluno>();

		initRootLayout();
		showAlunoOverview();
	}

	/**
	 * Inicializa o root layout (layout base).
	 */
	public void initRootLayout() {
		try {
			// Carrega o root layout do arquivo fxml.
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(EscolaApp.class.getResource("../view/RootLayout.fxml"));
			rootLayout = (BorderPane) loader.load();

			// Mostra a scene (cena) contendo oroot layout.
			Scene scene = new Scene(rootLayout);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Mostra o aluno overview dentro do root layout.
	 */
	public void showAlunoOverview() {
		try {
			// Carrega o person overview.
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(EscolaApp.class.getResource("../view/manterAluno.fxml"));
			AnchorPane personOverview = (AnchorPane) loader.load();

			// Coloca o layout do aluno dentro do root.
			rootLayout.setCenter(personOverview);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
