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
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafxmvc.model.dao.CidadeDAO;
//import javafxmvc.model.dao.PetDAO;
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
public class page1Controller implements Initializable {

    @FXML
    private TextField textFieldPetNomePet;
    @FXML
    private TextField textFieldPetNomeDono;
    @FXML
    private TextField textFieldPetNomeTelefone;
    @FXML
    private TextField textFieldPetEmail;
    @FXML
    private ComboBox comboBoxRaca;
    @FXML
    private ComboBox comboBoxSexo;
    @FXML
    private ComboBox comboBoxPorte;
    @FXML
    private ComboBox comboBoxCidade;
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
    private final RacaDAO RacaDAO = new RacaDAO();
    private final SexoDAO SexoDAO = new SexoDAO();
    private final PorteDAO PorteDAO = new PorteDAO();
    private final CidadeDAO CidadeDAO = new CidadeDAO();
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        RacaDAO.setConnection(connection);    
        carregarComboBoxRaca();
        SexoDAO.setConnection(connection);    
        carregarComboBoxSexo();
        PorteDAO.setConnection(connection);    
        carregarComboBoxPorte();
        CidadeDAO.setConnection(connection);    
        carregarComboBoxCidade();
    }
   
    public void carregarComboBoxRaca() {

        listRacas = RacaDAO.listar();
        observableListRacas = FXCollections.observableArrayList(listRacas);
        comboBoxRaca.setItems(observableListRacas);
    }

    public void carregarComboBoxSexo() {

        listSexos = SexoDAO.listar();
        observableListSexos = FXCollections.observableArrayList(listSexos);
        comboBoxSexo.setItems(observableListSexos);
    }
     
    public void carregarComboBoxPorte() {

        listPortes = PorteDAO.listar();
        observableListPortes = FXCollections.observableArrayList(listPortes);
        comboBoxPorte.setItems(observableListPortes);
    }
    
    
    public void carregarComboBoxCidade() {

        listCidades = CidadeDAO.listar();
        observableListCidades = FXCollections.observableArrayList(listCidades);
        comboBoxCidade.setItems(observableListCidades);
    }
    
   
/**
    public void selecionarItemTableViewClientes(Cliente cliente) {
        if (cliente != null) {
            labelClienteCodigo.setText(String.valueOf(cliente.getCdCliente()));
            labelClienteNome.setText(cliente.getNome());
            labelClienteCPF.setText(cliente.getCpf());
            labelClienteTelefone.setText(cliente.getTelefone());
        } else {
            labelClienteCodigo.setText("");
            labelClienteNome.setText("");
            labelClienteCPF.setText("");
            labelClienteTelefone.setText("");
        }
    }
     **/


    
    
    
    
    
    
    
    

    
        
         
        
        
        
        
        
     
    }
    

