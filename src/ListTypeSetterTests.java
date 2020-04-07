/*  Meghana Woodruff    wood143
    William Okuno       Okuno006
    lab 8
*/

public class ListTypeSetterTests {
    //KEY:
        //*// Objectives of sections
         // what is happening //
        // expected output

    public static void main(String[] args) {
        //*// test that the currentSize function shows the correct value after the constructor is called //*//
            // Init list to size 10 //
        ListTypeSetter list = new ListTypeSetter(10);
            // Make sure current size is 0 //
        System.out.println(list.currentSize());

        //*// test that the currentSize function shows the correct value after addToList is called //*//
        //*// test that addToList adds correctly //*//
        //*// test that the output is formatted as expected //*//
            // Add two items to list //
        list.addToList("william");
        list.addToList("meghana");
            // Make sure current size is 2 //
        System.out.println(list.currentSize()); // 2
            // Make sure Output is correct //
        System.out.println(list.toString()); // * william \n * meghana

        //*// test that the currentSize function shows the correct value after reset is called //*//
        //*// test that reset correctly resets the object //*//
        //*// test that the output format is as expected after a reset //*//
             // Reset //
        list.reset();
            // Make sure Output is correct //
        System.out.println(list.toString()); // \n
        System.out.println(list.currentSize()); // 0

        //*// test that addToList adds correctly, and order is preserved //*//
        //*// test that the output format is as expected after a reset //*//
            // Add three items to list //
        list.addToList("daniel");
        list.addToList("william");
        list.addToList("meghana");
            // Make sure Output is correct //
        System.out.println(list.toString()); // * daniel \n * william \n * meghana

    }

}
