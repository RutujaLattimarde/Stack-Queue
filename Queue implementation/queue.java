import java.util.*;
class Queue{
    int number[];
    int front,rear;
    int size;
    
    Queue(int size){
        number = new int[size];
        front = -1;
        rear = -1;
    }
    
    boolean isFull(){
        if(front == 0 && rear == size-1)
            return true;
        else
            return false;
    }
    
    boolean isEmpty(){
        if(front == -1){
            return true;
        }
        else
            return false;
    }
    
    void enqueue(int item){
        if (isFull()){
            System.out.println("Queue is full");
        }
        else{
            if(front == -1){
                front = 0;
            }
            rear++;
            number[rear]=item;
        }
    }
    
    int dequeue(){
        int item = number[front];
        if(isEmpty()){
            System.out.println("Queue is is Empty");
        }
        else{
            if(front >= rear){
                front = -1;
                rear = -1;
            }
            else{
                front++;
            }
        }
        return item;
    }
    
    void display(){
        int i;
        if(isEmpty()){
            System.out.println("Queue is is Empty");
        }
        else{
            for(i=front; i<=rear; i++)
                System.out.println(number[i]+" ");
        }
    }
    
}
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		int size, option, element;
		char chr;
		System.out.println("Enter size of the queue : ");
		size = sc.nextInt();
		Queue obj = new Queue(size);
		do{
		    System.out.println("Enetr your option:\n 1.Enqueue\n 2.Dequeue\n  3.Display\n");
		    option = sc.nextInt();
		    switch(option){
		        case 1:
		            System.out.println("Enter element to be pushed : ");
		            element = sc.nextInt();
		            obj.enqueue(element);
		            break;
		        case 2:
		            obj.dequeue();
		            break;
		        case 3:
		            obj.display();
		            break;  
		      default:
		      System.out.println("choose correct option");
		    }
		    System.out.println("Want to continue? Y or N ");
		    chr = sc.next().charAt(0);
		}
		while(chr == 'y' || chr == 'Y');
	}
}

