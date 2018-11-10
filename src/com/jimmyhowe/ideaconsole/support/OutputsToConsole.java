package com.jimmyhowe.ideaconsole.support;

public interface OutputsToConsole
{
    void out(String message);

    void primary(String message);

    void secondary(String message);

    void success(String message);

    void info(String message);

    void warning(String message);

    void danger(String message);
}
