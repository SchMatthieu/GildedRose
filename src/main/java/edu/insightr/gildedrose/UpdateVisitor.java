package edu.insightr.gildedrose;

public class UpdateVisitor implements IVisitor {

    @Override
    public void visit(Aged_Brie a) {
        System.out.println("Update Aged Brie");
    }

    @Override
    public void visit(Backstage b) {
        System.out.println("Update Backstage passes to a TAFKAL80ETC concert");
    }

    @Override
    public void visit(Conjured_Mana_Cake c) {
        System.out.println("Update Conjured Mana Cake");
    }

    @Override
    public void visit(Dexterity_Vest d) {
        System.out.println("Update Dexterity Vest");
    }

    @Override
    public void visit(Elixir_of_the_Mongoose e) {
        System.out.println("Update Elixir of the Mongoose");
    }

    @Override
    public void visit(Sulfuras s) {
        System.out.println("Update Sulfuras, Hand of Ragnaros");
    }

    @Override
    public void visit(Item item) {
        System.out.println("Update Item");
    }
}
