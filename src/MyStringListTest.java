import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MyStringListTest {
    @Test
    void testAdd() {

    }

    @Test
    void testCapacity() {
        //Arrange
        MyStringList myStringList = new MyStringList();
        //Act
        int actual = myStringList.capacity();
        //Assert
        assertEquals(5, actual);
    }

    @Test
    void testGet() {

    }

    @Test
    void testRemove() {

    }

    @Test
    void testSet() {

    }

    @Test
    void testSize() {
        MyStringList myStringList = new MyStringList();
    }
}
