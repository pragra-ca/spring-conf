package co.pragra.leaening.springsession2.domain;

public class DieselEngine implements Engine{
    @Override
    public String getEngineType() {
        return "Diesel";
    }

    @Override
    public Double getEnginePower() {
        return 1000.0;
    }
}
