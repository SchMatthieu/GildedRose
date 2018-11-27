package edu.insightr.gildedrose;

public class Dexterity_Vest extends Item implements IVisitable{

    public Dexterity_Vest(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void accept(IVisitor v){
        v.visit(this);
    }
}
