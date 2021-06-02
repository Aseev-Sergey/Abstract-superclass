package sample.Nodes;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class End extends Node {

    private Circle filled;
    private Circle inner;
    private Circle outer;

    public End(){
        super("Финальный узел");
        outer = new Circle(startX+50, startY+10, 20);
        inner = new Circle(outer.getCenterX(), outer.getCenterY(), outer.getRadius()-5, Color.WHITE);
        filled = new Circle(outer.getCenterX(), outer.getCenterY(), outer.getRadius()-10);
    }

    public Circle getFilled() {
        return filled;
    }

    public Circle getInner() {
        return inner;
    }

    public Circle getOuter() {
        return outer;
    }

    @Override
    public void draw(Pane pane) {
        pane.getChildren().addAll(outer,inner,filled,name);
    }
}
