package sample.Nodes;

import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;

public class Begin extends Node {

    private Circle filled;

    public Begin(){
        super("Начальный узел");
        filled = new Circle( startX+50, startY+10,20);
    }

    public Circle getFilled() {
        return filled;
    }

    @Override
    public void draw(Pane pane) {
        pane.getChildren().addAll(filled, name);
    }
}
