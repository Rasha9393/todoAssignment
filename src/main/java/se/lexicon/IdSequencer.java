package se.lexicon;

public class IdSequencer {
    private static int sequencer=1;
    public static int nextId(){
        return ++sequencer;
    }
}
