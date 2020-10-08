package Exception;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubjectMark{

    List<String> listStudentMArk  = new ArrayList<>();;

    Map<String, List<Integer>> subjectMark1 = new HashMap<>();

    Map<String, List<Integer>> addSubj(String nameSubj, List<Integer> mark){
            subjectMark1.put(nameSubj, mark);
            return subjectMark1;
   }




//    List<String> addMarksToStudent(){
//        for(Map.Entry<String, List<Integer>> map : subjectMark1.entrySet()){
//
//            listStudentMArk.add((map.getKey(), map.getValue());
//
//        }
//        return listStudentMArk;
//    }



    float getSummSubjMark(String nameSubj) {
        float sum = 0;
        float count = 0;
        for (Integer integerTmp : subjectMark1.get(nameSubj)) {
            count++;
             sum += integerTmp;
        }
        return sum/count;
    }

    @Override
    public String toString() {
        return "SubjectMark{" +
                "subjectMark=" + subjectMark1 +
                '}';
    }
}
