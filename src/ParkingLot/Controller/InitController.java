package ParkingLot.Controller;

import ParkingLot.Service.InitialisationService;

public class InitController {
   private InitialisationService initialisationService;
   public InitController(InitialisationService initialisationService){
       this.initialisationService=initialisationService;
   }

    public void init(){
        initialisationService.init();
    }
}
