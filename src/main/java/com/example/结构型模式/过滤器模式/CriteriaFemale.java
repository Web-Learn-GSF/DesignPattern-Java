package com.example.结构型模式.过滤器模式;

import java.util.ArrayList;
import java.util.List;

class CriteriaFemale implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> femalePersons = new ArrayList<>();
        for (Person person : persons) {
            if (person.getGender().equalsIgnoreCase("Female")) {
                femalePersons.add(person);
            }
        }
        return femalePersons;
    }
}
