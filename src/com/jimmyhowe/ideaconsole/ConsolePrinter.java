package com.jimmyhowe.ideaconsole;

public abstract class ConsolePrinter
{
    protected void printLine(String message)
    {
        System.out.println(message);
    }

    public void out(String message)
    {
        printLine(message);
    }

    /**
     * @param message Message to output.
     */
    public abstract void primary(String message);

    /**
     * @param message Message to output.
     */
    public abstract void secondary(String message);

    /**
     * @param message Message to output.
     */
    public abstract void success(String message);

    /**
     * @param message Message to output.
     */
    public abstract void info(String message);

    /**
     * @param message Message to output.
     */
    public abstract void warning(String message);

    /**
     * @param message Message to output.
     */
    public abstract void danger(String message);
}
