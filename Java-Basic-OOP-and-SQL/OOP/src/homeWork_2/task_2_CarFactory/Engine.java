package homeWork_2.task_2_CarFactory;

public class Engine {
    private String model;
    private int power;
    private int volume;
    private String engineType;

    public Engine(String model, int power, int volume, String engineType) {
        this.model = model;
        this.power = power;
        this.volume = volume;
        this.engineType = engineType;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    @Override
    public String toString() {
        return "Engine:" + '\n' +
                "model: " + model + '\n' +
                "power: " + power + '\n' +
                "volume: " + volume + '\n' +
                "engineType: " + engineType + '\n';
    }
}
