package com.bergen.CPRO2221.violated.ISP;

public class Light implements IDevice {

    @Override
    public void turnOn() {
        // Logic to turn on the light. Applicable to Light
    }

    @Override
    public void turnOff() {
        // Logic to turn off the light. Applicable to Light
    }

    @Override
    public void setTemperature(int temperature) {
        // Not applicable for a light
    }

    @Override
    public void recordVideo() {
        // Not applicable for a light
    }
}