package ge.automation;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class FirstClass {


    @Test
    public void firstTest() {
        System.out.println("hello world");

    }

    @Test (priority = 3)
    public void firstTest1() {
        System.out.println("hello world 1 ");
    }
        @Test (priority = 1)
        public void firstTest2 () {
            System.out.println("hello world 2 ");
        }
            @Test
            public void firstTest3 () {
                System.out.println("hello world 3");
            }

        }

