package com.hackbulgaira.asciiart.players;

import java.io.File;

public abstract class AsciiPlayer {
    private final static int columns = 140;
    protected File sourceFile;
    
    AsciiPlayer(File file){
        sourceFile = file;
    }
    
    public void play(){}
}
