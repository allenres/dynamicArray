import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MyStringListTest {
    @Test
    void testAdd() {
        //Arrange
        MyStringList myStringList = new MyStringList();
        //Act
        myStringList.add("test");
        myStringList.add("best");
        //Assert
        assertEquals("test", myStringList.get(0));
        assertEquals("best", myStringList.get(1));
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
        MyStringList myStringList = new MyStringList();
        //Act
        myStringList.add("test");
        myStringList.add("pest");
        String actual = myStringList.get(1);
        assertEquals("pest", actual);
    }

    @Test
    void testRemove() {
        //Arrange
        MyStringList myStringList = new MyStringList();
        //Act
        myStringList.add("test");
        myStringList.add("pest");
        String actual = myStringList.remove(0);
        //Assert
        assertEquals("test", actual);
    }

    @Test
    void testSet() {
        MyStringList myStringList = new MyStringList();
        //Act
        myStringList.add("test");
        myStringList.add("pest");

        myStringList.set(1, "car");
        String actual = myStringList.get(1);
        assertEquals("car", actual);
    }

    @Test
    void testSize() {
        MyStringList myStringList = new MyStringList();
        //Act
        myStringList.add("test");
        myStringList.add("pest");
        int actual = 2;
        assertEquals(myStringList.size(), actual);
    }
}
