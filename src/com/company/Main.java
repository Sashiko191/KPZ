package com.company;

public class Main {

    public static void main(String[] args) {
	    Component first = new FirstComponent();
	    Component second = new SecondComponent();

	    Component beforeDec = new BeforeDecorator(first);
	    Component afterDec = new AfterDecorator(first);

	    Component beforeDec2 = new BeforeDecorator(second);
	    Component afterDec2 = new AfterDecorator(second);

	    first.DoAction();
	    second.DoAction();

	    beforeDec.DoAction();
	    afterDec.DoAction();

	    beforeDec2.DoAction();
	    afterDec2.DoAction();
    }
}
