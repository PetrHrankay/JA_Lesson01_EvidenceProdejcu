import java.math.BigDecimal;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        String nameAndSurname = "František Cibule";
        LocalDate birthdate = LocalDate.of(1985, 2, 14);
        int numberOfAgreements = 32;
        double carrotSold = 237.6; // in tons
        String residenceCity = "Jablunkov";
        String licencePlate = "8T3 2343";
        double companyVehicleConsumption = 9.2; // l/100km
        String companyCompIP = "192.138.42.39";

        double averageQuantityPerAgreements = carrotSold / numberOfAgreements;
        System.out.println(
                "The average quantity of sold carrots per contract is " + averageQuantityPerAgreements + " tons.");
    }
}