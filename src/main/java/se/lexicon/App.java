package se.lexicon;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        System.out.println( "Hello World!" );

        Person person1 = new Person("rasha", "aldarwish", "rasha@123");
        String dpSummary = person1.getSummary();
        System.out.println("desplaySummary:" + dpSummary);
        Person person2 = new Person("Maher ", "ala", "maher@987");
        String dpSummary2 = person2.getSummary();
        System.out.println("desplaySummary:" + dpSummary2);
        TodoItem todo1 = new TodoItem("task1", "handla");
        String dp1 = todo1.getSummary();
        System.out.println("display informatio" + dp1);
        TodoItem todo2 = new TodoItem("dricker", "fanta");
        String dp2 = todo2.getSummary();
        System.out.println("display informatio" + dp2);
        todo1.setCreater(person1);
        String dp3 = todo1.getSummary();
        System.out.println("display informatio" + dp3);
    }

    }

