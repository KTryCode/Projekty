package com.Krystiano;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<>();
        addInOrder(placesToVisit,"Warsaw");
        addInOrder(placesToVisit,"Berlin");
        addInOrder(placesToVisit,"Barcelona");
        addInOrder(placesToVisit,"Sunderland");
        addInOrder(placesToVisit,"Helsinki");
        addInOrder(placesToVisit,"Sydney");
        addInOrder(placesToVisit,"Melbourne");
        addInOrder(placesToVisit,"Canberra");

        printList(placesToVisit);
        addInOrder(placesToVisit, "Alaska");
        addInOrder(placesToVisit,"Zambiwawe");
        addInOrder(placesToVisit, "Ryga");
        addInOrder(placesToVisit, "Warsaw");
        printList(placesToVisit);
    }

    private static void printList(LinkedList<String> linkedList){
        Iterator<String> i =linkedList.iterator();
        while(i.hasNext()){
            System.out.println("Now visiting " + i.next());
        }
        System.out.println("------------------");
    }

    private static boolean addInOrder(LinkedList<String> linkedList, String newCity){
        ListIterator<String> stringListIterator = linkedList.listIterator();

        while(stringListIterator.hasNext()){
            int comparison = stringListIterator.next().compareTo(newCity);
            if (comparison==0){
                // equal, do not add
                System.out.println(newCity + " is already visited");
                return false;
            } else if(comparison > 0) {
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            } else if (comparison < 0){
                //move on next city
            }
        }
        stringListIterator.add(newCity);
        return true;
    }
}
