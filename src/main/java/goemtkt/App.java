package goemtkt;

import java.util.ArrayList;

import goemtkt.abstractfactory.Stage;
import goemtkt.abstractfactory.component.Component;
import goemtkt.abstractfactory.factory.FirstGameFactory;
import goemtkt.abstractfactory.factory.GameFactory;
import goemtkt.abstractfactory.factory.SecondGameFactory;


public class App {
    public static void main(String[] args) {
        GameFactory[] gameFactory = new GameFactory[2];
        gameFactory[0] = new FirstGameFactory();
        gameFactory[1] = new SecondGameFactory();

        System.out.println("----------게임 시작-----------");
        for(int i=0; i<gameFactory.length; i++){

            Stage eachStage = gameFactory[i].createStage();
            ArrayList<Component> components = eachStage.getComponents();
            for(Component component : components){
                component.draw();
            }

            System.out.println("-------------스테이지 끝----------");
        }
        
    }
}