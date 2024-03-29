package com.tecgames.controller;

import com.tecgames.model.Admin;
import com.tecgames.model.UsuarioDados;
import com.tecgames.model.Venda;
import com.tecgames.model.VendaDados;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

/**
 * Class BuscarVendasController, controller for the BuscarVendas screen
 * */
public class BuscarVendasController implements Initializable {

    public Button logout;
    public TableView<Venda> TabelaVendas;
    public TableColumn<Venda,Integer> colunaId;
    public TableColumn<Venda,Integer> colunaIdUsuario;
    public TableColumn<Venda,Double> colunaValor;
    public Label labelVendaId;
    public Label labelVendaNomeUsuario;
    public Label labelVendaIdJogos;
    public Label labelVendaData;
    public Label labelVendaValor;
    public Label labelVendaHora;
    public TextField fieldBusca;

    private Admin adminLogado;
    private VendaDados vendaDao;
    private List<Venda> listVendas;
    private ObservableList<Venda> observableListVendas;

    public Admin getAdminLogado() {
        return this.adminLogado;
    }


    /**
     * Sets controller initial data
     * */
    public void initData(Admin adminLogado){
        this.adminLogado = adminLogado;
    }


    /**
     * Defines the initial behavior of the controller
     * */
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        vendaDao = new VendaDados();
        carregarDadosTabela();


        TabelaVendas.getSelectionModel().selectedItemProperty().addListener(
                (observable, oldValue, newValue) -> selecionarItemTabelaVendas(newValue));

    }

    /**
     * Loads the content of table
     * */
    public void carregarDadosTabela() {
        colunaId.setCellValueFactory(new PropertyValueFactory<>("idvenda"));
        colunaIdUsuario.setCellValueFactory(new PropertyValueFactory<>("idusuario"));
        colunaValor.setCellValueFactory(new PropertyValueFactory<>("valortotal"));

        listVendas = vendaDao.carregaArquivoVendas();

        observableListVendas = FXCollections.observableArrayList(listVendas);

        FilteredList<Venda> filteredData = new FilteredList<>(observableListVendas, b -> true);

        //adicionando um listener em campo de pesquisa, para fazer a busca na tabela e mostrar o conteudo referente oque está no campo de texto de pesquisa
        fieldBusca.textProperty().addListener((observable, oldValue, newValue) -> {
            filteredData.setPredicate(venda -> {


                if (newValue == null || newValue.isEmpty()) {
                    return true;
                }

                String lowerCaseFilter = newValue.toLowerCase();

                if (String.valueOf(venda.getIdusuario()).toLowerCase().indexOf(lowerCaseFilter) != -1 ) {
                    return true;
                } else if (String.valueOf(venda.getIdvenda()).toLowerCase().indexOf(lowerCaseFilter) != -1) {
                    return true;
                } else if (String.valueOf(venda.getValortotal()).toLowerCase().indexOf(lowerCaseFilter) != -1) {
                    return true;
                } else if (venda.getData().toLowerCase().indexOf(lowerCaseFilter) != -1) {
                    return true;
                } else if (venda.getHora().toLowerCase().indexOf(lowerCaseFilter) != -1) {
                    return true;
                } else if (String.valueOf(venda.getIdjogos()).toLowerCase().indexOf(lowerCaseFilter) != -1) {
                    return true;
                }
                else
                    return false;
            });
        });


        SortedList<Venda> sortedData = new SortedList<>(filteredData);

        sortedData.comparatorProperty().bind(TabelaVendas.comparatorProperty());

        TabelaVendas.setItems(sortedData);

    }

    /**
     * Selects one item in the table and display info
     * */
    public void selecionarItemTabelaVendas(Venda venda){

        if(venda != null)  {
            UsuarioDados us = new UsuarioDados();

            String nomeUsuario = us.buscarUsuario(venda.getIdusuario()).getNome();//capturando nome do usuario a qual está relacionado a venda

            labelVendaId.setText(String.valueOf(venda.getIdvenda()));
            labelVendaNomeUsuario.setText(nomeUsuario);
            labelVendaData.setText(String.valueOf(venda.getData()));
            labelVendaHora.setText(String.valueOf(venda.getHora()));
            labelVendaValor.setText(String.valueOf(venda.getValortotal()));
            labelVendaIdJogos.setText(String.valueOf(venda.getIdjogos()));
        } else {
            labelVendaId.setText("");
            labelVendaNomeUsuario.setText("");
            labelVendaData.setText("");
            labelVendaHora.setText("");
            labelVendaValor.setText("");
            labelVendaIdJogos.setText("");
        }

    }

    /**
     * logout of the system
     * */
    @FXML
    protected void onLogoutButtonClick() throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/com/tecgames/view/login-view.fxml"));
        Scene scene = new Scene(root, 1000, 600); //cena

        //This line gets the Stage(window) information
        Stage window = (Stage) logout.getScene().getWindow();

        window.setScene(scene);
    }

    /**
     * Back page
     * */
    @FXML
    protected void onVoltarButtonClick() throws IOException {

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/com/tecgames/view/homeadmin-view.fxml"));
        Parent page = loader.load();
        Scene scene = new Scene(page, 1000, 600); //cena

        HomepageAdminController controller = loader.getController();
        controller.initData(getAdminLogado());

        //This line gets the Stage(window) information
        Stage window = (Stage) logout.getScene().getWindow();

        window.setScene(scene);

    }

}
