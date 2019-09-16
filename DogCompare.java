import java.util.*;
public class DogCompare implements Comparator<Dog>{
		public int compare(Dog a1, Dog a2){
			int num = a1.toString().compareTo(a2.toString());
			if (num==0){
				return a1.getLegs() - a2.getLegs();
			}
			return num;
		}
}