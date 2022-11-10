package Line;

import java.util.List;

public class Line {

    private List<RationalFraction> lst;

    public Line(List<RationalFraction> lst) {
        this.lst = lst;
    }

    public String Intersection_axes(List<RationalFraction> lst){
        return "Intersection with x :(" + (lst.get(1).div(lst.get(0))) + " ; 0)" +  "\nIntersection with y :(0 ; " + lst.get(1) + ")";
    }

    public String IntersectionPoint(List<RationalFraction> lst, List<RationalFraction> lst2){
        if (lst.get(0) == lst2.get(0)){
            return "No Intersection";
        }
        RationalFraction x = (lst2.get(1).sub(lst.get(1)).div((lst.get(0).sub(lst2.get(0)))));
        RationalFraction y = (lst.get(0).mul(x)).add(lst.get(1));
        return "(" + x + "; " + y + " )";
    }

    public boolean parallel(List<RationalFraction> lst, List<RationalFraction> lst2){
        return lst.get(0).equals(lst.get(0), lst2.get(0));
    }

    @Override
    public String toString(){
        return "y=(" + lst.get(0) + ")x" + "+(" + lst.get(1) + ")b";
    }
}
