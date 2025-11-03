public class App {
    public static void main(String[] args) throws Exception {

        Enemy enemy1 = new Enemy(50, 25);
        enemy1.attack();

        Wizard wizard1 = new Wizard(50, 20, "fire");
        Wizard wizard2 = new Wizard(50, 30, "ice");

        wizard1.attack();
        wizard2.attack();
        wizard1.damageType();
        wizard2.damageType();

        Goblin goblin1 = new Goblin(50, 10);

        goblin1.attack();

    }
}
