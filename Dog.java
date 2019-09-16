import java.util.*;
public class Dog extends Animal implements Comparable<Dog> {
	public Dog(String boiName, int leggy){
		name = boiName;
		legs = leggy;
	}
	public String toString(){
		return name;
	}
	public int getLegs(){
		return legs;
	}
	public int compareTo(Dog d2) {
			int num = this.getLegs() - d2.getLegs();
			if (num==0){
				return this.toString().compareTo(d2.toString());
			}
			return num;
	}
}