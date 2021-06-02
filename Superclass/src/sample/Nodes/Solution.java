package sample.Nodes;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Solution extends Node {

    private Rectangle sol;

    public Solution(){
        super("Узел решения");
        sol = new Rectangle(100, 100, Color.WHITE);
        sol.setX(startX);
        sol.setY(startY);
        sol.setRotate(45);
    }

    public Rectangle getSol() {
        return sol;
    }

    @Override
    public void draw(Pane pane) {
        pane.getChildren().addAll(sol, name);
    }
}
