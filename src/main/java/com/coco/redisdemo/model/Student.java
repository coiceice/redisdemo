package  com.coco.redisdemo.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Student
{ 
    private String sno;
    private String sname;
    private String ssex;
    private Idcard idcard;
}