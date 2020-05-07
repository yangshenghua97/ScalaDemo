package Pragmatic_Scala_Expressive.Part1.chapter1;

import java.util.List;

public class CodeJavaFPDemo {
    public static int findMax(List<Integer>temps){
        int highTemp = Integer.MAX_VALUE;
        for(Integer temp:temps){
            highTemp = Math.max(highTemp,temp);
        }
        return highTemp;
    }
}
