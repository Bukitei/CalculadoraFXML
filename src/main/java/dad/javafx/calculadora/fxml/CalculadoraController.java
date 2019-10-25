package dad.javafx.calculadora.fxml;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import dad.calculadora.Calculadora;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class CalculadoraController implements Initializable{

	private Calculadora calculadora = new Calculadora();
	private StringProperty calculo = new SimpleStringProperty();
	
	@FXML
	private GridPane grid;
	
	@FXML
	private TextField text;
	
	@FXML
	private Button seven, four, one, zero, eight, five, two, nine, six, three, point, CE, mult, rest, plus, C, div, equal;
	
	public CalculadoraController() throws IOException {
		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/HolaMundoView.fxml"));
		loader.setController(this);  //Este será nuestro controlador
		loader.load();
		
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
	
		calculo.bind(text.textProperty());
		
	}
	
	public GridPane getView() {
		return grid;
	}
	
	@FXML
	private void onSevenAction(ActionEvent e) {
		calculo.set("7");
	}
	
	@FXML
	private void onSevenAction(ActionEvent e) {
		calculo.set("7");
	}
	@FXML
	private void onSevenAction(ActionEvent e) {
		calculo.set("7");
	}
	@FXML
	private void onSevenAction(ActionEvent e) {
		calculo.set("7");
	}
	@FXML
	private void onSevenAction(ActionEvent e) {
		calculo.set("7");
	}
	@FXML
	private void onSevenAction(ActionEvent e) {
		calculo.set("7");
	}
	@FXML
	private void onSevenAction(ActionEvent e) {
		calculo.set("7");
	}
	@FXML
	private void onSevenAction(ActionEvent e) {
		calculo.set("7");
	}
	@FXML
	private void onSevenAction(ActionEvent e) {
		calculo.set("7");
	}
	@FXML
	private void onSevenAction(ActionEvent e) {
		calculo.set("7");
	}
	@FXML
	private void onSevenAction(ActionEvent e) {
		calculo.set("7");
	}
	@FXML
	private void onSevenAction(ActionEvent e) {
		calculo.set("7");
	}
	@FXML
	private void onSevenAction(ActionEvent e) {
		calculo.set("7");
	}
	@FXML
	private void onSevenAction(ActionEvent e) {
		calculo.set("7");
	}
	@FXML
	private void onSevenAction(ActionEvent e) {
		calculo.set("7");
	}
	@FXML
	private void onSevenAction(ActionEvent e) {
		calculo.set("7");
	}
	@FXML
	private void onSevenAction(ActionEvent e) {
		calculo.set("7");
	}
	@FXML
	private void onSevenAction(ActionEvent e) {
		calculo.set("7");
	}
	
}
