package com.company;

public class AfterDecorator extends AbstractDecorator {

    public  AfterDecorator(Component comp){
        super(comp);
    }

    @Override
    public void DoAction() {
        super.DoAction();
        AfterAction();
    }

    private void AfterAction(){
        System.out.println("Hello i am after decorator i do actions after main action and i am still Component");
    }
}
