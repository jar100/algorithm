package study.collections;

import org.junit.Test;
import programas.BaseTest;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class TaskTest extends BaseTest {

    @Test
    public void taskTest() {
        PhoneTask mikePhone = new PhoneTask("Mike", "987 6543");
        PhoneTask paulPhone = new PhoneTask("Paul", "123 4567");
        CodingTask databaseCode = new CodingTask("db");
        CodingTask interfaceCode = new CodingTask("gui");
        CodingTask logicCode = new CodingTask("logic");

        Collection<PhoneTask> phoneTasks = new ArrayList<PhoneTask>();


        Collection<CodingTask> codingTasks = new ArrayList<CodingTask>();
        Collection<Task> mondayTasks = new ArrayList<Task>();
        Collection<Task> tuesdayTasks = new ArrayList<Task>();
        Collections.addAll(phoneTasks, mikePhone, paulPhone);
        Collections.addAll(codingTasks, databaseCode, interfaceCode, logicCode);
        Collections.addAll(mondayTasks, logicCode, mikePhone);
        Collections.addAll(tuesdayTasks, databaseCode, interfaceCode, paulPhone);

        softly.assertThat(phoneTasks.toString()).isEqualTo("[phone Mike, phone Paul]");
        softly.assertThat(codingTasks.toString()).isEqualTo("[code db, code gui, code logic]");

        softly.assertThat(mondayTasks.toString()).isEqualTo("[code logic, phone Mike]");
        softly.assertThat(tuesdayTasks.toString()).isEqualTo("[code db, code gui, phone Paul]");

        // add
        mondayTasks.add(new PhoneTask("Ruth", "567 1234"));
        softly.assertThat(mondayTasks.toString()).isEqualTo("[code logic, phone Mike, phone Ruth]");

        // add collections
        Collection<Task> allTasks = new ArrayList<>(mondayTasks);
        allTasks.addAll(tuesdayTasks);
        softly.assertThat(allTasks.toString()).isEqualTo("[code logic, phone Mike, phone Ruth, code db, code gui, phone Paul]");


        //remove
        boolean wasPresent = mondayTasks.remove(mikePhone);
        softly.assertThat(wasPresent).isTrue();
        softly.assertThat(mondayTasks.toString()).isEqualTo("[code logic, phone Ruth]");

        // remove all
        mondayTasks.clear();
        softly.assertThat(mondayTasks).isEmpty();

        // remove to collections
        Collection<Task> tuesdayNonphoneTasks = new ArrayList<>(tuesdayTasks);
        tuesdayNonphoneTasks.removeAll(phoneTasks);
        softly.assertThat(tuesdayNonphoneTasks.toString()).isEqualTo("[code db, code gui]");

        Collection<Task> phoneTuesdayTasks = new ArrayList<>(tuesdayTasks);
        phoneTuesdayTasks.retainAll(phoneTasks);
        softly.assertThat(phoneTuesdayTasks.toString()).isEqualTo("[phone Paul]");


        Collection<PhoneTask> tuesdayPhoneTasks = new ArrayList<>(phoneTasks);
        tuesdayPhoneTasks.retainAll(tuesdayTasks);
        softly.assertThat(tuesdayPhoneTasks.toString()).isEqualTo("[phone Paul]");


        Queue<Task> taskQueue = new ArrayDeque<>();
        taskQueue.offer(mikePhone);
        taskQueue.offer(paulPhone);

        Task nextTask = taskQueue.poll();
        for (int i = 0; i < 2; i++) {
            nextTask = taskQueue.poll();
        }

        if (nextTask == null) {
            System.out.println("널");
        }
        System.out.println(taskQueue.size());

        try {
            Task nextTask2 = taskQueue.remove();
// process nextTask
        } catch (NoSuchElementException e) {
// but we *never* run out of tasks!
            System.out.println("익셉션발생");
        }




    }

}
