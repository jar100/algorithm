package study.collections;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TaskTest {

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

        assertThat(phoneTasks.toString()).isEqualTo("[phone Mike, phone Paul]");
        assertThat(codingTasks.toString()).isEqualTo("[code db, code gui, code logic]");

        assertThat(mondayTasks.toString()).isEqualTo("[code logic, phone Mike]");
        assertThat(tuesdayTasks.toString()).isEqualTo("[code db, code gui, phone Paul]");

        // add
        mondayTasks.add(new PhoneTask("Ruth", "567 1234"));
        assertThat(mondayTasks.toString()).isEqualTo("[code logic, phone Mike, phone Ruth]");

        // add collections
        Collection<Task> allTasks = new ArrayList<>(mondayTasks);
        allTasks.addAll(tuesdayTasks);
        assertThat(allTasks.toString()).isEqualTo("[code logic, phone Mike, phone Ruth, code db, code gui, phone Paul]");


        //remove
        boolean wasPresent = mondayTasks.remove(mikePhone);
        assertThat(wasPresent).isTrue();
        assertThat(mondayTasks.toString()).isEqualTo("[code logic, phone Ruth]");

        // remove all
        mondayTasks.clear();
        assertThat(mondayTasks).isNull();

        // remove to collections
        Collection<Task> tuesdayNonphoneTasks = new ArrayList<>(tuesdayTasks);
        tuesdayNonphoneTasks.removeAll(phoneTasks);
        assertThat(tuesdayNonphoneTasks.toString()).isEqualTo("[code db, code gui]");

        Collection<Task> phoneTuesdayTasks = new ArrayList<>(tuesdayTasks);
        phoneTuesdayTasks.retainAll(phoneTasks);
        assertThat(phoneTuesdayTasks.toString()).isEqualTo("[phone Paul]");


        Collection<PhoneTask> tuesdayPhoneTasks = new ArrayList<>(phoneTasks);
        tuesdayPhoneTasks.retainAll(tuesdayTasks);
        assertThat(tuesdayPhoneTasks.toString()).isEqualTo("[phone Paul]");


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
