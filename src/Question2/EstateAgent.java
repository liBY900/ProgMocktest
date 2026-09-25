package Question2;

public abstract class EstateAgent implements iEstateAgent {

    private String agentName;
    private double propertyPrice;

    public EstateAgent(String agentName, double propertyPrice) {
        this.agentName = agentName;
        this.propertyPrice = propertyPrice;
    }

    @Override
    public String getAgentName() {
        return agentName;
    }

    @Override
    public double getPropertyPrice() {
        return propertyPrice;
    }

    @Override
    public double getAgentCommission() {
        return propertyPrice * 0.20;
    }
}