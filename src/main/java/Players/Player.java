package Players;

import Interfaces.IDefend;
import Items.Item;

import java.util.ArrayList;

public abstract class Player implements IDefend{
    String name;
    int hitPoints;
    ArrayList<Item> bag;

    public Player(String name, int hitPoints){
        this.name = name;
        this.hitPoints = hitPoints;
        this.bag = new ArrayList<>();
    }

    public String getName(){
        return name;
    }

    public int getHitPoints(){
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public ArrayList<Item> getBag(){
        return bag;
    }

    public void addToBag(Item item){
        bag.add(item);
    }

    public Item getFromBag(Item item){
        int i = this.bag.indexOf(item);
        return bag.remove(i);
    }

    @Override
    public void defend(int damage) {
        int HP = getHitPoints();
        int newHP = HP - damage;
        this.setHitPoints(newHP);
    }
}
