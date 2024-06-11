package com.assignment;

import com.assignment.exceptions.EmptyListException;
import com.assignment.exceptions.NoMajorityException;
import java.util.ArrayList;

public class CalculateMajority {

    public Integer findMajorityElement(ArrayList<Integer> nums) throws NoMajorityException, EmptyListException {
        if (nums == null || nums.isEmpty()) {
            throw new EmptyListException();
        }
        if(nums.size() == 1)
            return nums.get(0);
        int currentMajority = nums.get(0);
        int weight = 1;

        for(int i = 1; i < nums.size(); i++) {
            if(nums.get(i) == currentMajority)
                weight++;
            else
                if (weight == 1)
                    currentMajority = nums.get(i);
                else
                    weight--;
        }

        int candidateEntries = 0;
        for(Integer number: nums)
            if(number == currentMajority)
                candidateEntries++;

        if(candidateEntries > nums.size()/2)
            return currentMajority;
        else
            throw new NoMajorityException(nums);
    }
}