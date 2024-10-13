package services;

import java.util.List;

public class CalculationService {

	//public static Integer max(List<Integer> list) {
	public static <T extends Comparable<T>> T max(List<T> list) {
          if (list.isEmpty()) {
               throw new IllegalStateException("List can't be empty");
		  }
		//Integer max = list.get(0);
		//for (Integer item : list) {
		//} 
		T max = list.get(0);
		for (T item : list) {
            if (item.compareTo(max) > 0) {
                 max = item;
          }
		}   
        return max;
		}
	}            