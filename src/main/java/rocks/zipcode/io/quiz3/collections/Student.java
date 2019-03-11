package rocks.zipcode.io.quiz3.collections;

import rocks.zipcode.io.quiz3.objectorientation.enums.LabStatus;

import java.util.Map;
import java.util.TreeMap;

/**
 * @author leon on 10/12/2018.
 */
public class Student implements Comparable{
    Map<Lab, LabStatus> labInfo;

    public Student() {
        this.labInfo = new TreeMap<>();
    }

    public Student(Map<Lab, LabStatus> map) {
        this.labInfo = map;
    }

    public Lab getLab(String labName) {
        for(Lab lab : labInfo.keySet()) {
            if (lab.getName().equals(labName)){
                return lab;
            }
        }
        return null;
    }

    public void setLabStatus(String labName, LabStatus labStatus) {
        Lab key = new Lab(labName);

        this.labInfo.put(key, labStatus);
    }


    public void forkLab(Lab lab) {
        this.labInfo.put(lab, LabStatus.PENDING);
    }

    public LabStatus getLabStatus(String labName) {
        for (Lab lab: labInfo.keySet()) {
            if(lab.getName().equals(labName)){
                return labInfo.get(lab);
            }
        }
        return null;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
