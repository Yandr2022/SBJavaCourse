package Part1.module4_Numbers_StringsAndDates.lesson24_25_RegEx.homework.task2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class SeparatedWords {
    public static void main(String[] args) {

        String text = "AT the end of a little Swedish town lay an old, overgrown orchard. In the orchard was a cottage, " +
                "and in this cottage lived Pippi Longstocking. She was nine years old, and she lived all alone. She had " +
                "neither mother nor father, which was really rather nice, for in this way there was no one to tell her " +
                "to go to bed just when she was having most fun, and no one to make her take cod-liver-oil when she felt " +
                "like eating peppermints.\nThere was a time when Pippi had had a father, and she had been very fond of him." +
                " Of course, she had had a mother too, but that was long ago.\nPippi’s mother had died when Pippi was just " +
                "a tiny baby lying in her cradle and howling so dreadfully that no one could come near. Pippi believed that " +
                "her mother now lived somewhere up in Heaven and looked down on her little girl through a hole in it." +
                " Pippi often used to wave up to her and say, ‘Don’t worry, I can look after myself!’";

        String[] words = text.split("\\W+");//[^A-Za-z0-9_]

        for (String s : words) {
            System.out.println(s);
        }
    }
}
