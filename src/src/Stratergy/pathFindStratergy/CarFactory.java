package src.Stratergy.pathFindStratergy;

import Stratergy.pathFindStratergy.Stratergy.CarPathFinder;
import Stratergy.pathFindStratergy.Stratergy.PathFinder;

public class CarFactory implements PathFinderAbc {
    public PathFinder get_startergy(){
        return new CarPathFinder();
    }
}
