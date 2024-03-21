package com.bergen.CPRO2221.violated.ISP;

public class Thermostat implements IDevice {

    @Override
    public void turnOn() {
        // Logic to activate the thermostat. Applicable to Thermostat
    }

    @Override
    public void turnOff() {
        // Logic to deactivate the thermostat. Applicable to Thermostat
    }

    @Override
    public void setTemperature(int temperature) {
        // Sets the desired temperature. Applicable to Thermostat
    }

    @Override
    public void recordVideo() {
        // Not applicable for a thermostat
    }
}