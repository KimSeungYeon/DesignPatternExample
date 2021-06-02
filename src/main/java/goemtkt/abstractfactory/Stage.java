package goemtkt.abstractfactory;

import java.util.ArrayList;

import goemtkt.abstractfactory.component.Component;

public class Stage {
    private ArrayList<Component> stageComponents;

    public Stage(){
        stageComponents = new ArrayList<Component>();
    }

    public ArrayList<Component> getComponents(){
        return stageComponents;
    }

    public void addComponent(Component component){
        stageComponents.add(component);
    }

    public void removeComponent(Component component){
        stageComponents.remove(component);
    }
}