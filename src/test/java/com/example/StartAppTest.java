package com.example;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StartAppTest {

    @Autowired private Studio studio;
    @Autowired private StudioReader studioReader;

    @Test
    public void contextok() throws Exception {
    }

    @Test
    public void fullStudio() throws Exception {
        FullStudio fs = new FullStudio("1", "Denver", studio.getAreacode());
        System.out.println("stdio is: " + fs);
        assertEquals("303", studio.getAreacode());
    }

    @Test
    public void loadstudioreader() throws Exception {
        assertEquals("303",studioReader.getMessage());
    }
}