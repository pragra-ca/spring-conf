package co.pragra.leaening.springsession2.domain;

public class Electric implements Engine{
    @Override
    public String getEngineType() {
        return "Electric";
    }

    @Override
    public Double getEnginePower() {
        return 800.0;
    }
}
