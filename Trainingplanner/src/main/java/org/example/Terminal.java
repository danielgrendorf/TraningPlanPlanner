package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Terminal {
    public static void scanner() {

        Map<Integer, String> weekdays = new HashMap<>();
        weekdays.put(1, "Monday");
        weekdays.put(2, "Tuesday");
        weekdays.put(3, "Wednesday");
        weekdays.put(4, "Thursday");
        weekdays.put(5, "Friday");
        weekdays.put(6, "Saturday");
        weekdays.put(7, "Sunday");

        Map<Integer, String> trainingTypes = new HashMap<>();
        trainingTypes.put(1, "pushpull");
        trainingTypes.put(2, "brosplit");
        trainingTypes.put(3, "cardio");

        Map<Integer, String> brosplitTypes = new HashMap<>();
        brosplitTypes.put(1, "chest");
        brosplitTypes.put(2, "shoulder");
        brosplitTypes.put(3, "back");
        brosplitTypes.put(4, "biceps");
        brosplitTypes.put(5, "triceps");
        brosplitTypes.put(6, "leg");
        brosplitTypes.put(7, "cardio");

        Map<Integer, String> pushPullLegTypes = new HashMap<>();
        pushPullLegTypes.put(1, "push");
        pushPullLegTypes.put(2, "pull");
        pushPullLegTypes.put(3, "leg");

        int typeCounter = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pick a day!");
        for (Map.Entry<Integer, String> entry : weekdays.entrySet()) {
            System.out.println(entry);
        }

        String day = scanner.nextLine();
        if (!weekdays.containsKey(Integer.parseInt(day))) {
            System.out.println("Invalid input!");
        } else {

            System.out.println("What kind of training would you like?");
            for (Map.Entry<Integer, String> entry : trainingTypes.entrySet()) {
                System.out.println(entry);
            }
            String trainingType = scanner.nextLine();
            typeCounter = Integer.parseInt(trainingType);

            switch (typeCounter) {
                case 1:
                    System.out.println("Push-Pull-Leg, great choice! What bodypart would you like to train?");
                    for (Map.Entry<Integer, String> entry : pushPullLegTypes.entrySet()) {
                        System.out.println(entry);
                    }
                    Integer pplScanner = Integer.parseInt(scanner.nextLine());
                    if (!pushPullLegTypes.containsKey(pplScanner)) {
                        System.out.println("Invalid input!");
                    } else {
                       switch (pplScanner) {
                            case 1:
                                System.out.println(day + ":" + ExerciseLists.exercisesPerBodyParts.get(1));
                                System.out.println(day + ":" + ExerciseLists.exercisesPerBodyParts.get(5));
                                break;
                            case 2:
                                System.out.println(day + ":" + ExerciseLists.exercisesPerBodyParts.get(3));
                                System.out.println(day + ":" + ExerciseLists.exercisesPerBodyParts.get(4));
                                break;
                            case 3:
                                System.out.println(day + ":" + ExerciseLists.exercisesPerBodyParts.get(2));
                                System.out.println(day + ":" + ExerciseLists.exercisesPerBodyParts.get(6));
                                break;
                        }
                    }
                    break;

                case 2:
                    System.out.println("Brosplit, great choice! What bodypart would you like to train?");
                    System.out.println(brosplitTypes);
                    Integer bstScanner = Integer.parseInt(scanner.nextLine());
                    if (!brosplitTypes.containsKey(bstScanner)) {
                        System.out.println("Invalid input!");

                    } else {

                        for (int i = 0; i < ExerciseLists.exercisesPerBodyParts.size(); i++) {
                            if(ExerciseLists.exercisesPerBodyParts.containsKey(bstScanner)){
                                System.out.println(day + ":" + ExerciseLists.exercisesPerBodyParts.get(bstScanner));
                            }
                            break;
                        }
                    }
                    break;

                case 3:
                    System.out.println("Cardio, great choice! What type do you want?");
                    System.out.println(ExerciseLists.exercisesPerBodyParts.get(7));
                    Integer cardioScanner = Integer.parseInt(scanner.nextLine());
                    if (!brosplitTypes.containsKey(cardioScanner)) {
                        System.out.println("Invalid input!");

                    } else {

                        for (int i = 0; i < ExerciseLists.exercisesPerBodyParts.size(); i++) {
                            if(ExerciseLists.exercisesPerBodyParts.containsKey(cardioScanner)){
                                System.out.println(day + ":" + ExerciseLists.exercisesPerBodyParts.get(cardioScanner));
                            }
                            break;
                        }
                    }
                    break;
            }
        }
    }
}
