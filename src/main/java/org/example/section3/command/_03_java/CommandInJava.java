package org.example.section3.command._03_java;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.example.section3.command._01_before.Game;
import org.example.section3.command._01_before.Light;

public class CommandInJava {

    public static void main(String[] args) {
        Light light = new Light();
        Game game = new Game();
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        executorService.submit(light::on);
        executorService.submit(game::start);
        executorService.submit(light::off);
        executorService.submit(game::end);
        executorService.shutdown();
    }
}
