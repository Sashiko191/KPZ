package com.company;

public abstract class AbstractDecorator implements Component{
    protected  Component component;

    public  AbstractDecorator(Component comp){
        component = comp;
    }

    @Override
    public void DoAction() {
        if(component != null) {
            component.DoAction();
        }
    }
}
