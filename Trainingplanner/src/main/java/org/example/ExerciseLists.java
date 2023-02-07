package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExerciseLists {
    static Map<Integer, List> exercisesPerBodyParts = new HashMap<>();

    public static void adder(){

        List<String> chest = new ArrayList<>();
            chest.add("fekvenyomas");
            chest.add("tarogatas");
            chest.add("pozitiv nyomas");

        List<String> shoulder = new ArrayList<>();
            shoulder.add("oldalemeles");
            shoulder.add("vallbolnyomas");
            shoulder.add("negativ tarogatas");

        List<String> back = new ArrayList<>();
            back.add("lehuzas");
            back.add("athuzas");
            back.add("hiperhajlitas");

        List<String> biceps = new ArrayList<>();
            biceps.add("felhuzas");
            biceps.add("franciarudas emeles");
            biceps.add("kalapacs");

        List<String> triceps = new ArrayList<>();
            triceps.add("homlokraengedes");
            triceps.add("tarkoraengedes");
            triceps.add("letolas");

        List<String> leg = new ArrayList<>();
            leg.add("combfeszito");
            leg.add("terdhajlito");
            leg.add("guggolas");
            leg.add("ulovadli");

        List<String> cardio = new ArrayList<>();
            cardio.add("futas");
            cardio.add("evezes");
            cardio.add("biciklizes");

        exercisesPerBodyParts.put(1, chest);
        exercisesPerBodyParts.put(2, shoulder);
        exercisesPerBodyParts.put(3, back);
        exercisesPerBodyParts.put(4, biceps);
        exercisesPerBodyParts.put(5, triceps);
        exercisesPerBodyParts.put(6, leg);
        exercisesPerBodyParts.put(7, cardio);

    }
}
