package Extras;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SortingWithLambdasTest {
    String john;
    String tunde;

    @Test
    void testThatListOfEmployeesCanBeAdded(){
        List<String> employee = new ArrayList<>();
        assertNotNull(employee);
    }
    @Test
    void testThatEmployeesCanBeAddedAndSizeCanBeChecked(){
        List<String> employee = new ArrayList<>();
        SortingWithLambdas lambdas = new SortingWithLambdas();
        employee.add(john);
        employee.add(tunde);
        assertEquals(2, employee.size());
    }
    @Test
    void testThatEmployeesCanBeAdded(){
        List<String> employee = new ArrayList<>();
        SortingWithLambdas lambdas = new SortingWithLambdas();
        assertTrue(employee.isEmpty());
    }



}