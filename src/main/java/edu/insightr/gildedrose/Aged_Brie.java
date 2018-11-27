package edu.insightr.gildedrose;

public class Aged_Brie extends Item implements IVisitable{


    public Aged_Brie(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void accept(IVisitor v){
        v.visit(this);
    }
}
