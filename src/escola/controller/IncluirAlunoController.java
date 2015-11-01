package escola.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import escola.model.Aluno;
import escola.model.Turma;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class IncluirAlunoController implements Initializable {

	@FXML
	private TextField txNome;
	@FXML
	private TextField txEmail;
	@FXML
	private TextField txMae;
	@FXML
	private TextField txPai;
	@FXML
	private TextField txContatoMae;
	@FXML
	private TextField txContatoPai;
	@FXML
	private TextField txSenha;

	@FXML
	private ComboBox cbTurma;

	@FXML
	private Button btSalvar;
	
	private Aluno aluno;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
	
		Turma turma1 = new Turma();
		turma1.setDescricao("Primeiro Ano A");
		
		Turma turma2 = new Turma();
		turma2.setDescricao("Primeiro Ano B");
		
		cbTurma.getItems().setAll(turma1.getDescricao(),turma2.getDescricao());
		
		btSalvar.setOnAction(new EventHandler<ActionEvent>() {  
            @Override  
            public void handle(ActionEvent arg0) {  
               aluno = new Aluno();
               recuperarValoresAluno();
               EscolaApp.alunos.add(aluno);
               showAlunoOverview();
            }  
     });  

	}
	
	private void recuperarValoresAluno(){
		aluno.setNome(this.txNome.getText());
		aluno.setEmail(this.txEmail.getText());
		aluno.setNomeMae(this.txMae.getText());
		aluno.setNomePai(this.txPai.getText());
		aluno.setContatoMae(this.txContatoMae.getText());
		aluno.setContatoPai(this.txContatoPai.getText());
		aluno.setSenha(this.txSenha.getText());
		//aluno.setTurma(this.cbTurma.getValue());
		
		
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
            EscolaApp.rootLayout.setCenter(personOverview);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

	public TextField getTxNome() {
		return txNome;
	}

	public void setTxNome(TextField txNome) {
		this.txNome = txNome;
	}

	public TextField getTxEmail() {
		return txEmail;
	}

	public void setTxEmail(TextField txEmail) {
		this.txEmail = txEmail;
	}

	public TextField getTxMae() {
		return txMae;
	}

	public void setTxMae(TextField txMae) {
		this.txMae = txMae;
	}

	public TextField getTxPai() {
		return txPai;
	}

	public void setTxPai(TextField txPai) {
		this.txPai = txPai;
	}

	public TextField getTxContatoMae() {
		return txContatoMae;
	}

	public void setTxContatoMae(TextField txContatoMae) {
		this.txContatoMae = txContatoMae;
	}

	public TextField getTxContatoPai() {
		return txContatoPai;
	}

	public void setTxContatoPai(TextField txContatoPai) {
		this.txContatoPai = txContatoPai;
	}

	public TextField getTxSenha() {
		return txSenha;
	}

	public void setTxSenha(TextField txSenha) {
		this.txSenha = txSenha;
	}

	public ComboBox getCbTurma() {
		return cbTurma;
	}

	public void setCbTurma(ComboBox cbTurma) {
		this.cbTurma = cbTurma;
	}

	public Button getBtSalvar() {
		return btSalvar;
	}

	public void setBtSalvar(Button btSalvar) {
		this.btSalvar = btSalvar;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	
	

}
