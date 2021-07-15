package ourDiary;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class DiaryUserTest {
    User joy;
    Diary relatinshipDiary;

    @BeforeEach
    void startEachTestWithThis(){
        relatinshipDiary = new Diary();
        joy = new User("joy", relatinshipDiary);
    }

    @Test
    void userHasADiary(){
        //given
        Diary relationshipDiary = new Diary();
        //when
        User joy = new User("Joy", relationshipDiary);
        assertNotNull(joy.getDiary());
    }

    @Test
    void userCanWriteOnDiary(){
    //given
        joy.createEntry("""
    Today I was heartbroken, 
    I bought ice-cream and chicken, after tasting the icecream, 
    I discovered my account was empty
    """);
    }


}
