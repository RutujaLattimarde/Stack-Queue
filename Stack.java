import java.util.*;

class stack{
    int number[];
    int top;
    int size;
    
    //constructor
    public stack(int size){
        top = -1;
        
        number = new int[size];
    }
    
    boolean isFull(){
        
            return top >= number.length-1;
    }
    
    boolean isEmpty(){
        
            return top == -1;
    }
    
    void push(int item){
        if(isFull()){
            System.out.println("stack is full");
        }
        else{
            top = top+1;
            number[top]=item;
        }
    }
    
    void pop(){
        if(isEmpty()){
            System.out.println("stack is empty");
        }
        else{
            
            System.out.println("Popped element is : "+ number[top] );
            top--;
        }
    }
    
    void peek(){
        System.out.println("Peek element is : "+ number[top] );
    }
    
    void display(){
        for (int i=top; i>=0; i-- ){
            System.out.println(number[i]);
        } 
    }
    
}
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size, option, element;
		char chr;
		System.out.println("Enter size of the stack : ");
		size = sc.nextInt();
		stack obj = new stack(size);
		do{
		    System.out.println("Enetr your option:\n 1.Push\n 2.Pop\n 3.Peek\n 4.Display\n");
		    option = sc.nextInt();
		    switch(option){
		        case 1:
		            System.out.println("Enter element to be pushed : ");
		            element = sc.nextInt();
		            obj.push(element);
		            break;
		        case 2:
		            obj.pop();
		            break;
		        case 3:
		            obj.peek();
		            break;
		        case 4:
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
