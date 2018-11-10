package com.jimmyhowe.ideaconsole.colors;

import com.jimmyhowe.ideaconsole.ConsolePrinter;
import com.jimmyhowe.ideaconsole.support.ColorCodeBuilder;
import com.jimmyhowe.ideaconsole.support.ControlSequenceIndicators;

import static com.jimmyhowe.ideaconsole.support.SelectGraphicRenditionParameters.*;

/**
 * Prints using Bootstraps color scheme
 */
public class BootstrapColors extends ConsolePrinter
{
    /**
     * Color Coder Builder Instance
     */
    private ColorCodeBuilder colorCodeBuilder = new ColorCodeBuilder();

    /**
     * {@inheritDoc}
     */
    @Override
    public void out(String message)
    {
        printLine(message);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void primary(String message)
    {
        String colorCode = new ColorCodeBuilder().simple(BLUE_FOREGROUND);

        printLine(colorCode + message + ControlSequenceIndicators.DEFAULTS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void secondary(String message)
    {
        String colorCode = new ColorCodeBuilder().simple(WHITE_FOREGROUND);

        printLine(colorCode + message + ControlSequenceIndicators.DEFAULTS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void success(String message)
    {
        String colorCode = new ColorCodeBuilder().simple(BRIGHT_GREEN_FOREGROUND, BOLD);

        printLine(colorCode + message + ControlSequenceIndicators.DEFAULTS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void info(String message)
    {
        String colorCode = new ColorCodeBuilder().simple(CYAN_FOREGROUND);

        printLine(colorCode + message + ControlSequenceIndicators.DEFAULTS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void warning(String message)
    {
        String colorCode = new ColorCodeBuilder().simple(YELLOW_FOREGROUND);

        printLine(colorCode + message + ControlSequenceIndicators.DEFAULTS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void danger(String message)
    {
        String colorCode = colorCodeBuilder.simple(RED_FOREGROUND, BOLD);

        printLine(colorCode + message + ControlSequenceIndicators.DEFAULTS);
    }
}
