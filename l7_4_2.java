package Line;


import java.util.ArrayList;
import java.util.List;

public class l7_4_2 {
    public static void main(String[] args){
        List<RationalFraction> line = new ArrayList<>(){
            {
                add(new RationalFraction(1, -1));
                add(new RationalFraction(2, 3));
            }
        };
        List<RationalFraction> line_2 = new ArrayList<>(){
            {
                add(new RationalFraction(1, 1));
                add(new RationalFraction(2, 3));
            }
        };
        Line line1 = new Line(line);
        System.out.println(line1);
        //System.out.print(line1.Intersection_axes(line));
        Line line2 = new Line(line_2);
        System.out.println(line2);
        System.out.print(line1.parallel(line, line_2));
        //System.out.print(line2.Intersection_axes(line_2)+ "\n");
        //System.out.print(line1.IntersectionPoint(line, line_2));
    }
}
