package Players;

import Items.Item;

import java.util.ArrayList;

public abstract class Player{
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
}
