public class TotalEnergyGenerated {
    public static double calculateTotalEnergy(double morningEnergy, double eveningEnergy) {
        return morningEnergy + eveningEnergy;
    
    }
    public static void main(String[] args) {
        double totalEnergy = calculateTotalEnergy(14.5, 8.3);
        System.out.println("Total Energy Generated: " + totalEnergy + "KWh");
    }
}