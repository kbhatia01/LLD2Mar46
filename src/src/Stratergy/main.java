package src.Stratergy;

import Stratergy.pathFindStratergy.Stratergy.PathFinder;
import Stratergy.pathFindStratergy.PathFinderFactory;

public class main {
    public static void main(){
        String source = "A";
        String destination = "B";
        modes mode = modes.BIKE;

        PathFinderFactory pathFinderFactory = new PathFinderFactory();
        PathFinder pathFinder = pathFinderFactory.getPathFinder(mode);
        pathFinder.findPath(source, destination);



    }
}
