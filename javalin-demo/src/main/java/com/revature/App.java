package com.revature;

import io.javalin.Javalin;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Javalin app = Javalin.create(/*config*/);
        app.get("/", ctx -> ctx.result("Hello World"));
        app.start(7071);
    }
}

/**
 * maven - as a dependency manager and build tool
 * structure of maven (arc/main+test)
 * mvnrespository, an online library of all open source maven projects
 * different stages of mvn lifecycles - eg validate, compile, test, package
 * getting Javalin into our porjects
 */