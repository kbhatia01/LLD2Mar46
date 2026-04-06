package src.Stratergy.pathFindStratergy;

//package Stratergy.pathFindStratergy;
//
//import Stratergy.modes;
//
//import java.util.HashMap;
//import java.util.Map;
//
//class PathFinderFactory {
//    static Map<modes, PathFinderAbc> pathFinderMap = new HashMap<>();
//
//    PathFinderFactory(){
//        pathFinderMap.put(modes.CAR, new CarFactory());
//    }
//
//    static PathFinderAbc  getPathFinder(modes mode){
//        return pathFinderMap.get(mode);
//    }
//}


import Stratergy.modes;
import Stratergy.pathFindStratergy.Stratergy.BikePathFinder;
import Stratergy.pathFindStratergy.Stratergy.CarPathFinder;
import Stratergy.pathFindStratergy.Stratergy.PathFinder;
import Stratergy.pathFindStratergy.Stratergy.TruckPathFinder;

public class PathFinderFactory {

    public PathFinder getPathFinder(modes mode){
        if(mode == modes.CAR){
            return new CarPathFinder();
        }
        if (mode == modes.BIKE){
            return new BikePathFinder();
        }
        if (mode == modes.TRUCK){
            return new TruckPathFinder();
        }
        return null;
    }
}
