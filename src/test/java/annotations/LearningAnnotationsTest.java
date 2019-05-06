package annotations;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

import static org.junit.jupiter.api.Assertions.*;

class LearningAnnotationsTest {

    @Test
    @Disabled
    @DisplayName("Test that I don't want to run because it will fail, lets skip")
    void disabledTest(){
        fail("This test will fail if I remove the @Disabled");
    }

    @Test
    @EnabledOnOs(OS.WINDOWS)
    void runOnlyOnWindows(){
        System.out.println("Run only won WindowsOS.");
    }

    @Test
    @EnabledOnOs(OS.LINUX)
    void runOnlyOnLinux(){
        System.out.println("Run only won LinuxOS.");
    }
}