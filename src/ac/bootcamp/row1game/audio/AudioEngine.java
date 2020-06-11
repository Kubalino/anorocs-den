package ac.bootcamp.row1game.audio;



public class AudioEngine {

    private SoundFX fx = new SoundFX();

    public AudioEngine(){
        MidiCore.setUpPlayer();
    }
    public void attack() {
        fx.attack();
    }
    public void strongAttack() {
        fx.strongAttack();
    }
    public void heal() {
        fx.heal();
    }
    public void spell() {
        fx.spell();
    }
    public void block() {
        fx.block();
    }
    public void youDie() {
        fx.youDie();
    }
    public void youWin() {
        fx.youWin();
    }
    public void newMonster() {
        fx.newMonster();
    }

}
