/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxmvc;

import java.net.URL;
import java.sql.Connection;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
//import javafx.scene.control.Alert;
import javafx.scene.control.Button;
//import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
//import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
//import javafx.stage.Stage;
import javafxmvc.model.dao.CidadeDAO;
import javafxmvc.model.dao.PetDAO;
import javafxmvc.model.dao.PorteDAO;
import javafxmvc.model.dao.RacaDAO;
import javafxmvc.model.dao.SexoDAO;
import javafxmvc.model.database.Database;
import javafxmvc.model.database.DatabaseFactory;
import javafxmvc.model.domain.Cidade;
import javafxmvc.model.domain.Pet;
import javafxmvc.model.domain.Porte;
import javafxmvc.model.domain.Raca;
import javafxmvc.model.domain.Sexo;

/**
 * FXML Controller class
 *
 * @author user
 */
public class FXMLPage1Controller implements Initializable {

    @FXML
    private TableView<Pet> tableViewPets;
    @FXML
    private TableColumn<Pet, String> tableColumnPetNomePet;
    @FXML
    private TableColumn<Pet, String> tableColumnPetNomeDono;
    @FXML
    private Button buttonInserir;
    @FXML
    private Button buttonAlterar;
    @FXML
    private Button buttonRemover;
    @FXML
    private Label labelPetNomePet;   
    @FXML
    private Label labelPetNomeDono;
    @FXML
    private Label labelPetTelefone;
    @FXML
    private Label labelPetEmail;   
    @FXML
    private Label labelPetPorte;
    @FXML
    private Label labelPetSexo;
    @FXML
    private Label labelPetCidade;   
    @FXML
    private Label labelPetRaca; 
    
    @FXML
    private List<Pet> listPets;
    @FXML
    private List<Sexo> listSexos;
    @FXML
    private List<Porte> listPortes;
    @FXML
    private List<Raca> listRacas;
    @FXML
    private List<Cidade> listCidades;
    
    @FXML
    private ObservableList<Pet> observableListPets;
    @FXML
    private ObservableList<Sexo> observableListSexos;
    @FXML
    private ObservableList<Porte> observableListPortes;
    @FXML
    private ObservableList<Raca> observableListRacas;
    @FXML
    private ObservableList<Cidade> observableListCidades;
    
     //Atributos para manipulação de Banco de Dados
    private final Database database = DatabaseFactory.getDatabase("postgresql");
    private final Connection connection = database.conectar();
    private final PetDAO PetDAO = new PetDAO();
    private final RacaDAO RacaDAO = new RacaDAO();
    private final SexoDAO SexoDAO = new SexoDAO();
    private final PorteDAO PorteDAO = new PorteDAO();
    private final CidadeDAO CidadeDAO = new CidadeDAO();
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        PetDAO.setConnection(connection);    
        carregarTableViewPet();
        
         // Limpando a exibição dos detalhes do cliente
        selecionarItemTableViewPets(null);

        // Listen acionado diante de quaisquer alterações na seleção de itens do TableView
        tableViewPets.getSelectionModel().selectedItemProperty().addListener(
                (observable, oldValue, newValue) -> selecionarItemTableViewPets(newValue));
    }

    public void carregarTableViewPet() {
        tableColumnPetNomePet.setCellValueFactory(new PropertyValueFactory<>("nomePet"));
        tableColumnPetNomeDono.setCellValueFactory(new PropertyValueFactory<>("nomeDono"));

        listPets = PetDAO.listar();

        observableListPets = FXCollections.observableArrayList(listPets);
        tableViewPets.setItems(observableListPets);
    }
    
     public void selecionarItemTableViewPets(Pet pet) {
        if (pet != null) {
            labelPetNomePet.setText(pet.getNomePet());
            labelPetNomeDono.setText(pet.getNomeDono());
            labelPetTelefone.setText(pet.getTelefone());
            labelPetEmail.setText(pet.getEmail());
            labelPetPorte.setText(String.valueOf(pet.getPorte()));
            labelPetSexo.setText(String.valueOf(pet.getSexo()));
            labelPetCidade.setText(String.valueOf(pet.getCidade()));
            labelPetRaca.setText(String.valueOf(pet.getRaca()));
        } else {
            labelPetNomePet.setText("");
            labelPetNomeDono.setText("");
            labelPetTelefone.setText("");
            labelPetEmail.setText("");
            labelPetPorte.setText("");
            labelPetSexo.setText("");
            labelPetCidade.setText("");
            labelPetRaca.setText("");
        }
    }
}
    
    
    