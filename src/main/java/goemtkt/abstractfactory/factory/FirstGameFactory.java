package goemtkt.abstractfactory.factory;

import goemtkt.abstractfactory.component.Car;
import goemtkt.abstractfactory.component.StageOneCar;
import goemtkt.abstractfactory.component.StageOneTree;
import goemtkt.abstractfactory.component.Tree;

public class FirstGameFactory extends GameFactory {

    @Override
    public Tree makeTree() {
        return new StageOneTree();
    }

    @Override
    public Car makeCar() {
        return new StageOneCar();
    }
    
}