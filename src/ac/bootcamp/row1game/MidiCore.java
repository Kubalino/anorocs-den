package ac.bootcamp.row1game;

import javax.sound.midi.*;
import java.io.File;

public abstract class MidiCore {

    public static void setUpPlayer()
    {
              try {
            //Cria o sequenciador e inicializa
            Sequencer sequencer = MidiSystem.getSequencer();
            sequencer.open();

            // Cria sequencia apartihr de ficheiro MIDI
            Sequence sequence = MidiSystem.getSequence(new File("resources/audio/chavena14.mid"));
            // Creating a track on our sequence upon which
            // MIDI events would be placed
            Track track = sequence.createTrack();
            // passa a sequencia(Pauta) para o sequenciador
            Track[] tracks = sequence.getTracks();

            sequencer.setLoopCount(Sequencer.LOOP_CONTINUOUSLY);

            sequencer.setSequence(sequence);
            sequencer.start();
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    // esta foda serve para injectar notas e comandos no MIDI, comando,canal nota velocidade...
    public MidiEvent makeEvent(int command, int channel,
                               int note, int velocity, int tick)
    {
        MidiEvent event = null;
        try {

            // ShortMessage stores a note as command type, channel,
            // instrument it has to be played on and its speed.
            ShortMessage a = new ShortMessage();
            a.setMessage(command, channel, note, velocity);

            // A midi event is comprised of a short message(representing
            // a note) and the tick at which that note has to be played
            event = new MidiEvent(a, tick);
        }
        catch (Exception ex) {

            ex.printStackTrace();
        }
        return event;
    }

}