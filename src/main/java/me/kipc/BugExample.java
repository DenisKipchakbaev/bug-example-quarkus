package me.kipc;

import java.io.IOException;

public class BugExample {

    public void produceBug() {
        try {
            throw new IOException();
        } catch (IOException | IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
}
