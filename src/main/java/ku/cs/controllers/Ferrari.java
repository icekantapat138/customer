package ku.cs.controllers;

import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import ku.cs.App;

import java.io.IOException;

public class Ferrari {
    @FXML  private ImageView image;

    @FXML
    public void initialize() {
        String path = getClass().getResource("/image/ferraripage.jpg").toExternalForm();
        image.setImage(new Image(path));
    }

    @FXML
    private void homeHyperlink() throws IOException {
        App.setRoot("website");
    }
}
