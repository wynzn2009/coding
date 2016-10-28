/**
 * 
 */
package sorting;
import java.util.LinkedList;
import java.util.List;

/**
 * @author wyn
 * 57
 */
public class InsertInterval {
	public static List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        int start = 0;
        int end = 0;
        Interval t = new Interval(newInterval.start, newInterval.end);
        if(null==intervals||intervals.size()==0){
        	List<Interval> in = new LinkedList<Interval>();
        	in.add(newInterval);
        	return in;
        }
        for(int i=0;i<intervals.size();i++){
        	Interval temp = intervals.get(i);
        	int l = temp.start;
        	int r = temp.end;
        	if(l<=newInterval.end&&r>=newInterval.start){
        		t = new Interval(Math.min(l, newInterval.start), Math.max(r, newInterval.end));
        		start = i;
        		end = start+1;
        		break;
        	}
        	if(l>newInterval.end&&r>newInterval.start){
        		start = i;
        		end = i;
        		break;
        	}
        }
        if(intervals.get(intervals.size()-1).end<newInterval.start){
        	start = intervals.size();
        	end = start;
        }
        LinkedList<Interval> list = new LinkedList<Interval>(intervals);
        if(start ==end){
        	list.add(start, newInterval);
        	return list;
        }
		for(int j=end;j<intervals.size();j++){
			Interval temp = intervals.get(j);
			int l = temp.start;
        	int r = temp.end;
        	if(l>newInterval.end||r<newInterval.start){
        		break;
        	}else{
        		t = new Interval(t.start, Math.max(t.end, r));
        		end++;
        	}
		}
		for(int k=start;k<end;k++){
			list.remove(start);
		}
		list.add(start, t);
		return list;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<Interval> intervals = new LinkedList<Interval>();
		intervals.add(new Interval(1, 5));
//		intervals.add(new Interval(6, 8));
		Interval i = new Interval(2, 3);
		InsertInterval.insert(intervals, i);
		

	}

}
