package programas.clear.crossingbridge;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class CrossingBridge {
    public static int solution(int bridge_length, int weight, int[] truck_weights) {
        int time = 1;
        int bridgeOnWeight = 0;
        Queue<Truck> trucks = new LinkedList<>();
        Queue<Truck> bridgeOnTruck = new LinkedList<>();
        ArrayList<Truck> clearTruck = new ArrayList<>();

        //리스트에 트럭들을 담는다.
        for (int truck_weight : truck_weights) {
            trucks.add(new Truck(truck_weight, bridge_length));
        }

        while(clearTruck.size() != truck_weights.length) {
            time ++;
            if (!trucks.isEmpty()) {
                if (weight >= bridgeOnWeight + trucks.peek().getWeight()) {
                    bridgeOnWeight += trucks.peek().getWeight();
                    bridgeOnTruck.add(trucks.poll());
                }
            }
            for (Truck truck : bridgeOnTruck) {
                truck.move();
            }
            if (bridgeOnTruck.peek().isOutBridge()) {
                bridgeOnWeight -= bridgeOnTruck.peek().getWeight();
                clearTruck.add(bridgeOnTruck.poll());
            }
        }

        return time;
    }

}
class Truck {
    int point = 0;
    int weight = 0;
    int bridgeLength = 0;
    public Truck(int weight, int bridgeLength) {
        this.weight = weight;
        this.bridgeLength = bridgeLength;
    }

    public void move() {
        this.point ++;

    }

    public boolean isOutBridge() {
        return  bridgeLength <= point;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
