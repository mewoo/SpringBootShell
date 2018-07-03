package com.example.shell;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

/**
 * Created by hwkim
 * on 2018. 7. 3.
 */
@ShellComponent
public class MyCommands {

    @ShellMethod("a+b = ?")
    public int test(int a, int b) {
        return a + b;
    }
}
