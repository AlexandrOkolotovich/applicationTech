package by.jwd.app.main;

import by.jwd.app.factory.Technics;
import by.jwd.app.factory.TechnicsFactory;
import by.jwd.app.factory.TechnicsType;

public class Main {
    public static void main(String[] args) {
        TechnicsFactory factory = new TechnicsFactory();

        Technics oven = factory.getTechnics(TechnicsType.OVEN);
        Technics laptop = factory.getTechnics(TechnicsType.LAPTOP);
        Technics refrigerator = factory.getTechnics(TechnicsType.REFRIGERATOR);
        Technics speakers = factory.getTechnics(TechnicsType.SPEAKERS);
        Technics tabletPC = factory.getTechnics(TechnicsType.TABLETPC);
        Technics vacuumCleaner = factory.getTechnics(TechnicsType.VACUUMCLEANER);

        oven.setTechnicalSpecifications();
        laptop.setTechnicalSpecifications();
        refrigerator.setTechnicalSpecifications();
        speakers.setTechnicalSpecifications();
        tabletPC.setTechnicalSpecifications();
        vacuumCleaner.setTechnicalSpecifications();
    }
}
