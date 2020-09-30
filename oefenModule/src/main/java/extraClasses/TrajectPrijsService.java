package extraClasses;

public class TrajectPrijsService {


    TrajectNaarTrajectEenhedenService TnTEenheidService;
    TrajectEenhedenNaarPrijsService TENPrijsService;

    public int getTrajectPrijs(String from, String to) {
        return TENPrijsService.getPriceTrajectEenheden(12);
    }

    public TrajectNaarTrajectEenhedenService getTnTEenheidService() {
        return TnTEenheidService;
    }

    public void setTnTEenheidService(TrajectNaarTrajectEenhedenService tnTEenheidService) {
        TnTEenheidService = tnTEenheidService;
    }

    public TrajectEenhedenNaarPrijsService getTENPrijsService() {
        return TENPrijsService;
    }

    public void setTENPrijsService(TrajectEenhedenNaarPrijsService TENPrijsService) {
        this.TENPrijsService = TENPrijsService;
    }


}
