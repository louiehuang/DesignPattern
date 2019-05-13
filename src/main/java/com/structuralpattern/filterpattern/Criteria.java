package com.structuralpattern.filterpattern;

import java.util.List;

public interface Criteria {
    List<Person> meetCriteria(List<Person> persons);
}
