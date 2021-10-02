package co.pragra.leaening.springsession2.domain;

public class PetroEngine implements Engine{
    @Override
    public String getEngineType() {
        return "Petrol";
    }

    @Override
    public Double getEnginePower() {
        return 2000.0;
    }
}
