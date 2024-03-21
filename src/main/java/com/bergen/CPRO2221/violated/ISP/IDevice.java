package com.bergen.CPRO2221.violated.ISP;

public interface IDevice {
    void turnOn();
    void turnOff(); // For Lights
    void setTemperature(int temperature); // For thermostats
    void recordVideo(); // Not relevant for all devices
}
