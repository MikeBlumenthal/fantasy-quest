package Players;

import Interfaces.IDefend;
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
}
