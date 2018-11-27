package edu.insightr.gildedrose;

public class Conjured_Mana_Cake extends Item implements IVisitable{

    public Conjured_Mana_Cake(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void accept(IVisitor v){
        v.visit(this);
    }
}
