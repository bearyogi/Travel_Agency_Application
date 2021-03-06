package client.java.controllers.employee;

import client.java.controllers.client.Main;
import client.java.controllers.client.SceneCreator;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import client.java.controllers.tools.Clock;

import java.io.IOException;

public class AdminController {
    @FXML
    Label clockLabel;
    Clock clk;
    Thread th;
    @FXML
    public void initialize(){
         clk = new Clock(clockLabel);
         th = new Thread(clk);
        th.start();
    }
    @FXML
    public void logOutButton(MouseEvent event) throws IOException {
        SceneCreator.launchScene("../../../resources/fxml-files/LogInScene.fxml", Main.getUser());
        shutdown();
    }
    @FXML
    public void addTourButton(MouseEvent event) throws IOException {
        SceneCreator.launchScene("../../../resources/fxml-files/ViewToursSceneAdmin.fxml",Main.getUser());
        shutdown();
    }
    @FXML
    public void viewReservationsButton(MouseEvent event) throws IOException {
        SceneCreator.launchScene("../../../resources/fxml-files/ViewTourAndReservationsSceneAdmin.fxml",Main.getUser());
        shutdown();
    }
    @FXML
    public void clientListButton(MouseEvent event) throws IOException {
        SceneCreator.launchScene("../../../resources/fxml-files/ViewALlClientsScene.fxml",Main.getUser());
        shutdown();
    }
    public void shutdown(){
        clk.terminate();
    }
}
