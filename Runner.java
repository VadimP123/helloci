package Exception;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Runner {
    public static void main(String[] args) {


        Student student = new Student("Vadim", "Avramenko");
        System.out.println(student);


        SubjectMark subjectMark = new SubjectMark();
        subjectMark.addSubj("математика", Arrays.asList());
        subjectMark.addSubj("Физика", Arrays.asList(5,5,7));

        System.out.println(subjectMark);
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put (1, "Mark");
        map.put (2, "Tarryn");
        List<String> list = new ArrayList<String>(map.values());
        for (String s : list) {
            System.out.println(s);
        }

    }
}
