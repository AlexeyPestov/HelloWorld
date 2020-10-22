package Monitors;

import Types.ComputerType;

public class MonitorFactory {
    public static Monitor createMonitor (ComputerType computerType) {
        if (computerType == ComputerType.HOME)  {
            return new Monitor("Samsung", 50, 50);
        }
        return new Monitor("Dell", 100, 50);
    }
}
