package goemtkt.abstractfactory.factory;

import goemtkt.abstractfactory.component.Car;
import goemtkt.abstractfactory.component.StageTwoCar;
import goemtkt.abstractfactory.component.StageTwoTree;
import goemtkt.abstractfactory.component.Tree;

public class SecondGameFactory extends GameFactory {

    @Override
    public Tree makeTree() {
        return new StageTwoTree();
    }

    @Override
    public Car makeCar() {
        return new StageTwoCar();
    }
    
}