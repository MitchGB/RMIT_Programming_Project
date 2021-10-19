package rmit.f21b.game.navigation;

import rmit.f21b.game.Player;

import java.util.function.Consumer;

public class MapSection {

    public final String name;
    public final String description;
    public Consumer<Player> enterEvent;
    public boolean visited = false;

    public MapSection(String name,String description){
        this.name = name;
        this.description = description;
    }

    public MapSection(String name,String description, Consumer<Player> enterEvent){
        this.name = name;
        this.description = description;
        this.enterEvent = enterEvent;
    }

    public void onEnter(Player player){
        visited = true;
        if(enterEvent != null)
            enterEvent.accept(player);
    }
}
