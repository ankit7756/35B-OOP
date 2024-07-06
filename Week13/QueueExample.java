package Week13;

public class QueueExample {
    public static void main(String[] args) {

    }
}

class QueueDataStructure{
    int capacity;
    int front;
    int rear;
    int currentSize = 0;
    int[] queue_arr;
    QueueDataStructure(int capacity){
        this.capacity = capacity;
        front = 0;
        rear = -1;
        queue_arr = new int[this.capacity];
    }
    boolean isFull(){
        return this.currentSize == this.capacity;
    }
    boolean isEmpty(){
        return this.currentSize == 0;
    }
    int peek(){
        if(isEmpty()){
            System.out.println("Empty");
            return -1;
        }
        return queue_arr[front];
    }
    void enquene(int data){
        if(isFull()){
            System.out.println("Full");
        } else {
            rear ++;
            if(rear == capacity-1){
                rear =0;
            }
            queue_arr[rear] = data;
            currentSize++;
        }
    }
    int dequeue(){
        if(isFull()){
            System.out.println("Empty");
            return -1;
        } else{
            front ++;
            currentSize --;
            if(front == capacity){
                int ret = queue_arr[front -1];
                return ret;
            }else{
                return queue_arr[front --];
            }
        }
    }
}