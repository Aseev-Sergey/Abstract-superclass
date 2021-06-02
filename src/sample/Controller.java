package sample;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.scene.layout.Pane;
import sample.Nodes.*;

public class Controller {

    public Pane pane;

    public void clickBegin(ActionEvent actionEvent) {
        clearPane();
        new Begin().draw(pane);
    }

    public void clickEnd(ActionEvent actionEvent) {
        clearPane();
        new End().draw(pane);
    }

    public void clickOperation(ActionEvent actionEvent) {
        clearPane();
        new Operation().draw(pane);
    }

    public void clickSolution(ActionEvent actionEvent) {
        clearPane();
        new Solution().draw(pane);
    }

    public void clickClose(ActionEvent actionEvent) {
        Platform.exit();
    }

    public void clickArrow(ActionEvent actionEvent) {
        clearPane();
        new Arrows().draw(pane);
    }

    private void clearPane(){
        pane.getChildren().clear();
    }
}
