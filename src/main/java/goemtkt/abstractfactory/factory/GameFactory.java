package goemtkt.abstractfactory.factory;

import goemtkt.abstractfactory.Stage;
import goemtkt.abstractfactory.component.Car;
import goemtkt.abstractfactory.component.Tree;

public abstract class GameFactory {
    abstract Tree makeTree();
    abstract Car makeCar();
    public Stage createStage(){
        Stage stage = new Stage();

        stage.addComponent(makeTree());
        stage.addComponent(makeTree());

        stage.addComponent(makeCar());
        stage.addComponent(makeCar());
        stage.addComponent(makeCar());

        return stage;
    }
}