package sample.Nodes;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Operation extends Node {

    final private double ARC = 50;
    private Rectangle oper;

    public Operation(){
        super("Узел управления");
        oper = new Rectangle(120, 60, Color.WHITE);
        oper.setX(startX);
        oper.setY(startY);
        oper.setArcHeight(ARC);
        oper.setArcWidth(ARC);
    }

    public Rectangle getOper() {
        return oper;
    }

    @Override
    public void draw(Pane pane) {
        pane.getChildren().addAll(oper,name);
    }
}
