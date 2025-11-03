public class Wizard extends Enemy{
    String type;
    public Wizard(int h, int d, String t) {
        super(h, d);
        type = t;
    }
    void damageType(){
        if (this.type.equalsIgnoreCase("fire") ){
            System.out.println("this wizard shoots a fireball");
        } else if(this.type.equalsIgnoreCase("ice") ) {
            System.out.println("this wizard shoots an iceball");
        }
    }
}
