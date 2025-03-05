package com.example.结构型模式.过滤器模式;

import java.util.List;

interface Criteria {
    List<Person> meetCriteria(List<Person> persons);
}
