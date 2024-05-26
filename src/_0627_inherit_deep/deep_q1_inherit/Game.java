package _0627_inherit_deep.deep_q1_inherit;

// Base class for all game objects
class GameObject {
    protected String name;
    protected int x, y;

    public GameObject(String name, int x, int y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }

    public void move(int deltaX, int deltaY) {
        this.x += deltaX;
        this.y += deltaY;
    }

    public void displayPosition() {
        System.out.println(name + " is at position (" + x + ", " + y + ")");
    }
}

// Player class that inherits from GameObject
class Player extends GameObject {
    private int health;

    public Player(String name, int x, int y, int health) {
        super(name, x, y);
        this.health = health;
    }

    public void attack() {
        System.out.println(name + " attacks with full power!");
    }

    public void displayStatus() {
        System.out.println(name + " has " + health + " health remaining.");
    }
}

// Enemy class that inherits from GameObject
class Enemy extends GameObject {
    private int damage;

    public Enemy(String name, int x, int y, int damage) {
        super(name, x, y);
        this.damage = damage;
    }

    public void attack() {
        System.out.println(name + " attacks and deals " + damage + " damage!");
    }
}

// Item class that inherits from GameObject
class Item extends GameObject {
    private String type;

    public Item(String name, int x, int y, String type) {
        super(name, x, y);
        this.type = type;
    }

    public void use() {
        System.out.println(name + " is used. It is a " + type + ".");
    }
}

// Main class to run the game
public class Game {
    public static void main(String[] args) {
        Player player = new Player("Hero", 0, 0, 100);
        Enemy enemy = new Enemy("Goblin", 10, 10, 15);
        Item potion = new Item("Health Potion", 5, 5, "Healing");

        player.displayPosition();
        player.move(1, 1);
        player.displayPosition();
        player.attack();
        player.displayStatus();

        enemy.displayPosition();
        enemy.attack();

        potion.displayPosition();
        potion.use();
    }
}

