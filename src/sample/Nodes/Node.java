package sample.Nodes;

import javafx.scene.layout.Pane;
import javafx.scene.text.Text;

abstract class Node {

    protected String text;
    protected Text name;
    protected double startX, startY;

    public Node(String input){
        text = input;
        startX = 100;
        startY = 50;
        name = new Text(startX, startY-20, text);
    }

    abstract void draw(Pane pane);

}
