package escola.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import escola.model.Aluno;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;

public class ManterAlunoController implements Initializable {

	@FXML
	private Button btNovo;
	
	@FXML
	private TableColumn clNome;
	
	@FXML
	private TableColumn clEmail;
	
	@FXML
	private TableColumn clMae;
	
	@FXML
	private TableColumn clPai;
	
	@FXML
	private TableView<Aluno> tbAlunos;

	@Override
	public void initialize(URL location, ResourceBundle resources) {

		/*
		 * Seta ação para o botão btNovo que está no fxml. Esta ação faz mudar
		 * de página
		 */
		btNovo.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				showAlunoOverview();
			}
		});
		
		 ObservableList<Aluno> alunos =
		            FXCollections.observableArrayList(EscolaApp.alunos);
		 tbAlunos.setItems(alunos);
		 
		
		

	}

	/**
	 * Mostra o aluno overview dentro do root layout.
	 */
	public void showAlunoOverview() {
		try {
			// Carrega o person overview.
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(EscolaApp.class.getResource("../view/incluirAluno.fxml"));
			AnchorPane personOverview = (AnchorPane) loader.load();

			// Coloca o layout do aluno dentro do root.
			EscolaApp.rootLayout.setCenter(personOverview);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
