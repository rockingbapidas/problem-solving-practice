package interview;

import kotlin.Pair;

import java.util.*;
import java.util.stream.Collectors;

/*
Priority scheduling is one of the most common scheduling algorithms in batch systems.
Each process is assigned a priority. Process with the highest priority is to be executed first and so on.
Processes with the same priority are executed on first come, first served basis.
Priority can be decided based on memory requirements, time requirements or any other resource requirement.
 */
public class HotstarInterview {

    //Brute Force Solution
    public List<Pair<Integer, Integer>> scheduleTask(int[] time, int[] duration) {
        List<Pair<Integer, Integer>> priority = new ArrayList<>();

        List<Pair<Integer, Integer>> allTask = new ArrayList<>();
        List<Pair<Integer, Integer>> completedTask = new ArrayList<>();

        //Map all tasks as per their duration
        for (int i = 0; i < time.length; i++) {
            allTask.add(new Pair<>(time[i], duration[i]));
        }
        System.out.println(Arrays.toString(allTask.toArray()));

        for (int arrivalTime : time) {
            //Filter task as current day of arrival time
            List<Pair<Integer, Integer>> currentTask = allTask.stream()
                    .filter(pair -> pair.getFirst() == arrivalTime)
                    .collect(Collectors.toList());
            System.out.println(Arrays.toString(currentTask.toArray()));

            if (!currentTask.isEmpty()) {

                currentTask.removeAll(completedTask);

                //Sort task as per duration
                currentTask.sort(Comparator.comparing(Pair<Integer, Integer>::getSecond));

                //Calculate total last duration of all completed task
                int lastDuration = 0;
                if (!completedTask.isEmpty()) {
                    for (Pair<Integer, Integer> integerIntegerPair : completedTask) {
                        lastDuration = lastDuration + integerIntegerPair.getSecond();
                    }
                }

                //Pick new task which one is lesser duration
                Pair<Integer, Integer> priorityTask = currentTask.get(0);

                //Get task id of new task and get time of arrival of new task
                int task = allTask.indexOf(priorityTask);
                int day = lastDuration;
                priority.add(new Pair<>(day, task));
                System.out.println("Day ==>" + day + " | Task ==>" + task);

                //Add new task to completed list
                completedTask.add(priorityTask);
            }
        }
        System.out.println(Arrays.toString(completedTask.toArray()));
        return priority;
    }
}
