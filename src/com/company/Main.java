package com.company;

public class Main {

    public static void main(String[] args) {

        Cola colaLime = new Cola(new WithLime());
        colaLime.showTaste();
        System.out.println();
        Cola colaZero = new Cola(new Zero());
        colaZero.showTaste();
        System.out.println();
        Pepsi pepsiMango = new Pepsi(new WithMango());
        pepsiMango.showTaste();
    }
}

interface Taste {
    void addNew();
}

class WithLime implements Taste {
    @Override
    public void addNew() {
        System.out.println("Taste with Lime");
    }
}

class WithMango implements Taste {
    @Override
    public void addNew() {
        System.out.println("Taste with Mango");
    }
}

class Zero implements Taste {
    @Override
    public void addNew() {
        System.out.println("Taste with zero sugar");
    }
}

abstract class Soda {
    protected Taste taste;

    public Soda(Taste taste) {
        this.taste = taste;
    }

    public abstract void showTaste();
}

class Cola extends Soda {
    public Cola(Taste taste) {
        super(taste);
    }

    @Override
    public void showTaste() {
        System.out.println("Its a cola!");
        taste.addNew();
    }
}

class Pepsi extends Soda {
    public Pepsi(Taste taste) {
        super(taste);
    }

    @Override
    public void showTaste() {
        System.out.println("Its a pepsi!");
        taste.addNew();
    }
}
