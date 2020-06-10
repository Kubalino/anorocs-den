package ac.bootcamp.row1game;

import javax.sound.midi.*;

public class AudioEngine {
    private MidiChannel[] mChannels;
    public AudioEngine(){

        try {
            // Create a new Sythesizer and open it.
            Synthesizer midiSynth = MidiSystem.getSynthesizer();
            midiSynth.open();
            //iniciar tema do jogo e parar
            MidiCore.setUpPlayer();
            //get and load default instrument and channel lists
            Instrument[] instr = midiSynth.getDefaultSoundbank().getInstruments();
            mChannels = midiSynth.getChannels();
            //midiSynth.loadInstrument(instr[101]);//load an instrument
            midiSynth.loadAllInstruments(midiSynth.getDefaultSoundbank());


        } catch (MidiUnavailableException e) {
        }
    }

    public void atack() {
        mChannels[0].programChange(126);
        mChannels[0].noteOn(34, 100);
    }

    public void heal() {
        mChannels[1].programChange(85);
        mChannels[1].noteOn(75, 100);
        try {
            Thread.sleep(2000);
        }
        catch( InterruptedException e ) { }
        mChannels[1].noteOff(75);
    }

    public void spell() {
        mChannels[9].noteOn(57, 100);
    }

    public void block() {
        mChannels[2].programChange(90);
        mChannels[2].noteOn(30, 100);
    }

    public void youDie() {
        mChannels[5].programChange(103);
        mChannels[5].noteOn(30, 100);
        try {
            Thread.sleep(2000);
        }
        catch( InterruptedException e ) { }
        mChannels[5].noteOff(30);
    }

    public void youWin() {
        mChannels[3].programChange(62);
        mChannels[3].noteOn(66, 100);
        try {
            Thread.sleep(2000);
        }
        catch( InterruptedException e ) { }
    }

    public void newMonster() {
        mChannels[4].programChange(125);
        mChannels[4].noteOn(78, 100);
    }
}
