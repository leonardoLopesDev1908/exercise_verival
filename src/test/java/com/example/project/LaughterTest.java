package com.example.project;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.project.Laughter;

class LaughterTest {
        
    private Laughter laughterService;

    @BeforeEach
    public void setUp() {
        laughterService = new Laughter();
    }

    @Test
    public void shouldReturnSForSimpleLaughter() {
        assertEquals(laughterService.exercise("hahaha"), 'S');
    }

    @Test 
    public void shouldReturnSForCompleXLaughter() {
        assertEquals(laughterService.exercise("huaauhahhuahau"), 'S');
    }

    @Test
    public void shouldReturnSForSingleChar() {
        assertEquals(laughterService.exercise("a"), 'S');
    }
    
    @Test
    public void shouldReturnNForComplexLaughter() {
        assertEquals(laughterService.exercise("riajkjdhhihhjak"), 'N');
    }
}
