package com.jimmyhowe.ideaconsole;

/**
 * IdeaConsole Entry Points
 */
public class IdeaConsole
{
    /**
     * Abstract Console Printer.
     */
    private static ConsolePrinter consolePrinter;

    /**
     * Sets what consolePrinter to use.
     *
     * @param consolePrinter ConsolePrinter instance.
     */
    public static void use(ConsolePrinter consolePrinter)
    {
        IdeaConsole.consolePrinter = consolePrinter;
    }

    /**
     * @param message Message to output.
     */
    public static void out(String message)
    {
        consolePrinter.out(message);
    }

    /**
     * @param message Message to output.
     */
    public static void primary(String message)
    {
        consolePrinter.primary(message);
    }

    /**
     * @param message Message to output.
     */
    public static void secondary(String message)
    {
        consolePrinter.secondary(message);
    }

    /**
     * @param message Message to output.
     */
    public static void success(String message)
    {
        consolePrinter.success(message);
    }

    /**
     * @param message Message to output.
     */
    public static void info(String message)
    {
        consolePrinter.info(message);
    }

    /**
     * @param message Message to output.
     */
    public static void warning(String message)
    {
        consolePrinter.warning(message);
    }

    /**
     * @param message Message to output.
     */
    public static void danger(String message)
    {
        consolePrinter.danger(message);
    }
}
