package prototype;

import java.util.List;

public class Game {
    public static void main(String[] args){
        Enemy goblinPrototype = new Enemy(
                "Goblin",
                100,
                15,
                "Club",
                List.of("Slash", "Dodge")
        );

        Enemy goblin1 = (Enemy) goblinPrototype.clone();
        Enemy goblin2 = (Enemy) goblinPrototype.clone();
        Enemy goblin3 = (Enemy) goblinPrototype.clone();
    }
}
