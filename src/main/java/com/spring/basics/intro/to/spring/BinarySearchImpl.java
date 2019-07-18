package com.spring.basics.intro.to.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {

    @Autowired
    private sort sort;

    public BinarySearchImpl(sort sort){
        super();
        this.sort = sort;
    }

    public int binarySearch(int[] numbers, int numberToSearchFor){
        BubbleSortAlgorithm bubbleSortAlgorithm = new BubbleSortAlgorithm();
//        int[] sortedNumbers = sort.sort(numbers);
        return 3;
    }


}
