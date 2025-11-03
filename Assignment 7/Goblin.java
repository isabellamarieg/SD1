public class Goblin extends Enemy{
    
    public Goblin(int h, int d) {
        super(h, d);
    }

    @Override
    public void attack() {
        System.out.println("The goblin gobbles!");
    }

}
