package com.example.结构型模式.过滤器模式;

import java.util.ArrayList;
import java.util.List;

class CriteriaMale implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> malePersons = new ArrayList<>();
        for (Person person : persons) {
            if (person.getGender().equalsIgnoreCase("Male")) {
                malePersons.add(person);
            }
        }
        return malePersons;
    }
}
