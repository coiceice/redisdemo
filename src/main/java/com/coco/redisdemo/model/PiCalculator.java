package  com.coco.redisdemo.model;

import org.springframework.stereotype.Component;

@Component
public class PiCalculator
{ 
    public double calculatePi(double n)
    {
        double pi=0;
        for(int i=1;i<n;i++)
        {
            pi += Math.pow(-1,i+1) / (2*i-1);
        }
        return 4*pi;
    }
}