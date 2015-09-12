package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals {
	public List<Interval> merge(List<Interval> intervals) {
		if(intervals==null||intervals.size()==0){
			return new ArrayList<Interval>();
		}
		Comparator<Interval> comp = new Comparator<Interval>()  
			    {  
			        public int compare(Interval i1, Interval i2)  
			        {  
			            if(i1.start==i2.start)  
			                return i1.end-i2.end;  
			            return i1.start-i2.start;  
			        }  
			    };  
        Collections.sort(intervals, comp);
        List<Interval> l = new ArrayList<Interval>();
        l.add(intervals.get(0));
        for(int i=1;i<intervals.size();i++){
        	Interval t = l.get(l.size()-1);
        	Interval v = intervals.get(i);
        	if(v.start<=t.end){
        		t.end = Math.max(v.end, t.end);
        	}else{
        		l.add(v);
        	}
        }
        return l;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
