package ac.bootcamp.row1game;

public class Player extends Character{



    @Override
    public void attack(CharacterType target) {

        int damage = Randomizer.getRandom(50, 100);

        if(0.8 > getHIT_CHANCE()) {
            System.out.println("It's a " + damage + " hit!");
            target.hit(damage);

        } if(isBlocking() == true) {
            System.out.println("Attack Blocked!");
            target.hit(0);
            player.isBlocking() = false;
        }
    }

    @Override
    public void block() {

        player.isBlocking() = true;

    }

    @Override
    public void heal() {

        player.getHealth = getHealth() + 50;

    }



}
