package edu.insightr.gildedrose;

public interface IVisitor {

    void visit(Aged_Brie a);
    void visit(Backstage b);
    void visit(Conjured_Mana_Cake c);
    void visit(Dexterity_Vest d);
    void visit(Elixir_of_the_Mongoose e);
    void visit(Sulfuras s);
    void visit(Item item);
    void visit(Inventory inventory);
}
