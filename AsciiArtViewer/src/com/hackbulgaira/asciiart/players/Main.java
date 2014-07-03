package com.hackbulgaira.asciiart.players;

import java.io.IOException;
import java.nio.file.Paths;

import org.jcodec.api.JCodecException;

public class Main {
    public static void main(String[] args) throws IOException, JCodecException, InterruptedException {
        VideoPlayer v = new VideoPlayer(Paths.get(args[0]).toFile());
        v.play();
    }
}
