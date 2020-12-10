package by.jwd.app.factory;

public class TechnicsFactory {
    public Technics getTechnics(TechnicsType type){
        Technics toReturn = null;
        switch (type){
            case OVEN:{
                toReturn = new Oven();
                break;
            }
            case LAPTOP:{
                toReturn = new Laptop();
                break;
            }
            case SPEAKERS:{
                toReturn = new Speakers();
                break;
            }
            case TABLETPC:{
                toReturn = new TabletPC();
                break;
            }
            case REFRIGERATOR:{
                toReturn = new Refrigerator();
                break;
            }
            case VACUUMCLEANER:{
                toReturn = new VacuumCleaner();
                break;
            }
            default:
                throw new IllegalArgumentException("Wrong technics type:" + type);
        }

        return toReturn;
    }
}
