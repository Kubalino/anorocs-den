package ac.bootcamp.row1game.menu.sound;

public enum GameSound {

    MAIN_MENU("bgm");

    private String path;

    GameSound(String sound) {

        path = "/mainMenu/sound/" + sound + ".wav";
    }


    public String getPath() {

        return path;
    }
}