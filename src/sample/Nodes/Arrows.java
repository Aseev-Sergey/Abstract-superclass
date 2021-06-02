package sample.Nodes;

import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;

public class Arrows extends Node {

    private Polygon arrowHead;
    private Line arrowLine;

    public Arrows(){

        super("Соединяющая стрелка");
        arrowLine = new Line(startX+30, startY, startX+50,startY);
        arrowHead = new Polygon(new double[]{
                startX+50, startY-10,
                startX+70, startY,
                startX+50, startY+10
        });
    }

    public Polygon getArrowHead() {
        return arrowHead;
    }

    public Line getArrowLine() {
        return arrowLine;
    }

    @Override
    public void draw(Pane pane) {
        pane.getChildren().addAll(arrowLine,arrowHead,name);
    }
}