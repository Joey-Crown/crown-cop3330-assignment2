package ex34;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    @DisplayName("Test searches for removed name")
    void main() {


        String[] names = { "John Smith", "Jackie Jackson", "Chris Jones", "Amanda Cullen", "Jeremy Goodwin" };
        for (int i = 0; i < 30; i++) {
            int rand = (int) Math.floor(Math.random() * names.length);
            String removedName = names[rand];

            String[] newNames = new String[names.length - 1];
            int pos = 0;

            for (int j = 0; j < names.length; j++) {
                if (!names[j].equals(removedName)) {
                    newNames[pos] = names[j];
                    pos++;
                }
            }

            for (int k = 0; k < newNames.length; k++) {
                Assertions.assertNotEquals(removedName, newNames[k]);
            }
        }


    }
}