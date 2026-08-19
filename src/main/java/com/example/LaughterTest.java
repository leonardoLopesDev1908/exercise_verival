// package com.example;

// import org.junit.jupiter.api.BeforeEach;
// import org.junit.jupiter.api.DisplayName;
// import org.junit.jupiter.api.Test;
// import org.junit.jupiter.params.ParameterizedTest;
// import org.junit.jupiter.params.provider.CsvSource;
// import org.junit.jupiter.params.provider.ValueSource;

// import static org.junit.jupiter.api.Assertions.assertFalse;
// import static org.junit.jupiter.api.Assertions.assertTrue;

class LaughterTest {
        
    private Laughter laughterService;

    @BeforeEach
    public void setUp() {
        laughterService = new Laughter();
    }

    @Test
    public void shouldReturnSForSimpleLaughter() {
        assertEquals(laughterService.isFunniest("hahaha"), 'S');
    }

    @Test 
    public void shouldReturnSForCompleXLaughter() {
        assertEquals(laughterService.isFunniest("huaauhahhuahau"), 'S');
    }

    @Test
    public void shouldReturnSForSingleChar() {
        assertEquals(laughterService.isFunniest("a"), 'S');
    }
    
    @Test
    public void shouldReturnNForComplexLaughter() {
        assertEquals(laughterService.isFunniest("riajkjdhhihhjak"), 'N');
    }
}
