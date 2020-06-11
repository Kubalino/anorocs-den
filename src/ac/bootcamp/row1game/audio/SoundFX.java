package ac.bootcamp.row1game.audio;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;

public class SoundFX {
    public void spell(){
        try{
            AudioInputStream audioSpell = AudioSystem.getAudioInputStream(SoundFX.class.getResource("/audio/spell.wav"));
            Clip spell = AudioSystem.getClip();
            spell.open(audioSpell);
            spell.start();
            //time equal frames divide by wav file sampling frequency
            int time=(int) (spell.getFrameLength()/44.1);
            try {
                Thread.sleep(time);
            }
            catch( InterruptedException e ) { }
            spell.stop();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    public void attack(){
        try{
            AudioInputStream audio = AudioSystem.getAudioInputStream(SoundFX.class.getResource("/audio/sword.wav"));
            Clip clip = AudioSystem.getClip();
            clip.open(audio);
            clip.start();
            int time=(int) (clip.getFrameLength()/44.1);
            try {
                Thread.sleep(time);
            }
            catch( InterruptedException e ) { }
            clip.stop();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    public void strongAttack(){
        try{
            AudioInputStream audio = AudioSystem.getAudioInputStream(SoundFX.class.getResource("/audio/magic1.wav"));
            Clip clip = AudioSystem.getClip();
            clip.open(audio);
            clip.start();
            int time=(int) (clip.getFrameLength()/44.1);
            try {
                Thread.sleep(time);
            }
            catch( InterruptedException e ) { }
            clip.stop();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    public void block(){
        try{
            AudioInputStream audio = AudioSystem.getAudioInputStream(SoundFX.class.getResource("/audio/swing.wav"));
            Clip clip = AudioSystem.getClip();
            clip.open(audio);
            clip.start();
            int time=(int) (clip.getFrameLength()/44.1);
            try {
                Thread.sleep(time);
            }
            catch( InterruptedException e ) { }
            clip.stop();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    public void newMonster(){
        try{
            AudioInputStream audio = AudioSystem.getAudioInputStream(SoundFX.class.getResource("/audio/burp.wav"));
            Clip clip = AudioSystem.getClip();
            clip.open(audio);
            clip.start();
            int time=(int) (clip.getFrameLength()/44.1);
            try {
                Thread.sleep(time);
            }
            catch( InterruptedException e ) { }
            clip.stop();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    public void heal(){
        try{
            AudioInputStream audio = AudioSystem.getAudioInputStream(SoundFX.class.getResource("/audio/heal.wav"));
            Clip clip = AudioSystem.getClip();
            clip.open(audio);
            clip.start();
            int time=(int) (clip.getFrameLength()/44.1);
            try {
                Thread.sleep(time);
            }
            catch( InterruptedException e ) { }
            clip.stop();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    public void youDie(){
        try{
            AudioInputStream audio = AudioSystem.getAudioInputStream(SoundFX.class.getResource("/audio/youDie.wav"));
            Clip clip = AudioSystem.getClip();
            clip.open(audio);
            clip.start();
            int time=(int) (clip.getFrameLength()/44.1);
            try {
                Thread.sleep(time);
            }
            catch( InterruptedException e ) { }
            clip.stop();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    public void youWin(){
        try{
            AudioInputStream audio = AudioSystem.getAudioInputStream(SoundFX.class.getResource("/audio/youWin.wav"));
            Clip clip = AudioSystem.getClip();
            clip.open(audio);
            clip.start();
            int time=(int) (clip.getFrameLength()/44.1);
            try {
                Thread.sleep(time);
            }
            catch( InterruptedException e ) { }
            clip.stop();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

}
