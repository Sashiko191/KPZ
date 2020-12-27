package com.company;

public class BeforeDecorator extends AbstractDecorator {
    public  BeforeDecorator(Component comp)
    {
        super(comp);
    }

    @Override
    public void DoAction() {
        BeforeAction();
        super.DoAction();
    }

    private void BeforeAction(){
        System.out.println("I am before decorator. I do action before main action and i am still Component)");
    }
}
