package edu.insightr.gildedrose;

public class Elixir_of_the_Mongoose extends Item implements IVisitable{

    public Elixir_of_the_Mongoose(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void accept(IVisitor v){
        v.visit(this);
    }
}
