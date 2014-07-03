package com.hackbulgaira.asciiart.players;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import org.jcodec.api.FrameGrab;
import org.jcodec.api.JCodecException;
import org.jcodec.common.SeekableByteChannel;

public class VideoPlayer extends SequencePlayer {
    
    private FrameGrab grab;

    public VideoFilePlayer(File file) throws IOException, JCodecException {
        super(file);
        grab = new FrameGrab((SeekableByteChannel) sourceFile);
    }
        
    @Override
    public void play() throws IOException {
        BufferedImage frame = null;
        while ((frame = grab.getFrame()) != null) {
            PictureAsciiPlayer picPlayer = new PictureAsciiPlayer(frame);
            picPlayer.play();
            Thread.sleep(20);
        }
    }
}
