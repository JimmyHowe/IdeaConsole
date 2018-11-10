package com.jimmyhowe.ideaconsole.support;

import java.util.ArrayList;
import java.util.List;

import static com.jimmyhowe.ideaconsole.support.ControlSequenceIndicators.SGR_END;
import static com.jimmyhowe.ideaconsole.support.SelectGraphicRenditionParameters.CYAN_FOREGROUND;

public class ColorCodeBuilder
{
    protected List<Integer> codes = new ArrayList<>();

    /**
     * @param delimiter Delimiter
     * @param ints      Array of Strings
     *
     * @return Imploded Array
     */
    public static String implode(String delimiter, int[] ints)
    {
        StringBuilder builder = new StringBuilder();

        for ( int i = 0; i < ints.length; i++ )
        {
            builder.append(ints[i]);

            if ( i != ints.length - 1 )
            {
                builder.append(delimiter);
            }
        }

        return builder.toString();
    }

    public ColorCodeBuilder underline()
    {
        codes.add(SelectGraphicRenditionParameters.UNDERLINE);

        return this;
    }

    public ColorCodeBuilder cyanForeground()
    {
        codes.add(CYAN_FOREGROUND);

        return this;
    }

    public String build()
    {
        return null;
    }

    public String simple(int... codes)
    {
        String parameters = implode(";", codes);

        return buildControlSequence(parameters);
    }

    public String buildControlSequence(String parameters)
    {
        return ControlSequenceIndicators.ESCAPE + parameters + SGR_END;
    }
}
