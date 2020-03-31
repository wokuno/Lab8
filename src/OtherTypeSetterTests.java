public class OtherTypeSetterTests {
    public static void main(String[] args) {
        // I didn't want to make four files, so I put all the other tests in one file.
        // just uncomment the test you want to run. Since whitespace is a bit wacky,

        firstLastTypeSetterTest();
        numberedListTypeSetterTest();
        labeledListTypeSetterTest();
        preSpecifiedMarksTypeSetterTest();
    }

    private static void firstLastTypeSetterTest() {
        System.out.println("---FirstLastTypeSetter---");
        FirstLastTypeSetter flts = new FirstLastTypeSetter(10);
        System.out.println(flts.toString()); // no output
        System.out.println(flts.toString().length()); // 0 (confirming no output)

        System.out.println("---FirstLastTypeSetter--- 1 ---");

        flts.addToList("apple");
        System.out.println(flts.toString());
        // (only):  apple

        System.out.println("---FirstLastTypeSetter--- 2 ---");

        flts.addToList("wolf");
        System.out.println(flts.toString());
        // (first):  apple
        // (last):  wolf

        System.out.println("---FirstLastTypeSetter--- 3 ---");

        flts.addToList("onion");
        System.out.println(flts.toString());
        // (first):  apple
        //  * wolf
        // (last): onion

        System.out.println("---FirstLastTypeSetter--- 4 ---");

        flts.addToList("lego");
        System.out.println(flts.toString());
        // (first):  apple
        //  * wolf
        //  * onion
        // (last): lego
    }
    /*
---FirstLastTypeSetter---

0
---FirstLastTypeSetter--- 1 ---
(only): apple
---FirstLastTypeSetter--- 2 ---
(first): apple
(last): wolf
---FirstLastTypeSetter--- 3 ---
(first): apple
 * wolf
(last): onion
---FirstLastTypeSetter--- 4 ---
(first): apple
 * wolf
 * onion
(last): lego
     */

    private static void numberedListTypeSetterTest() {
        System.out.println("---NumberedListTypeSetter---");
        NumberedListTypeSetter nlts = new NumberedListTypeSetter(10);
        System.out.println(nlts.toString()); // no output
        System.out.println(nlts.toString().length()); // 0 (confirming no output)

        System.out.println("---NumberedListTypeSetter--- 1 ---");

        nlts.addToList("apple");
        System.out.println(nlts.toString());
        // 1. apple

        System.out.println("---NumberedListTypeSetter--- 2 ---");

        nlts.addToList("wolf");
        System.out.println(nlts.toString());
        // 1.  apple
        // 2.  wolf

        System.out.println("---NumberedListTypeSetter--- 3 ---");

        nlts.addToList("onion");
        System.out.println(nlts.toString());
        // 1.  apple
        // 2. wolf
        // 3. onion

        System.out.println("---NumberedListTypeSetter--- 4 ---");

        nlts.addToList("lego");
        System.out.println(nlts.toString());
        // 1. apple
        // 2. wolf
        // 3. onion
        // 4. lego
    }
    /*
---NumberedListTypeSetter---

0
---NumberedListTypeSetter--- 1 ---
 1. apple
---NumberedListTypeSetter--- 2 ---
 1. apple
 2. wolf
---NumberedListTypeSetter--- 3 ---
 1. apple
 2. wolf
 3. onion
---NumberedListTypeSetter--- 4 ---
 1. apple
 2. wolf
 3. onion
 4. lego
     */

    private static void labeledListTypeSetterTest() {
        System.out.println("---LabeledListTypeSetter---");
        LabeledListTypeSetter llts = new LabeledListTypeSetter("label", 10);
        System.out.println(llts.toString()); // no output
        //label
        //=====

        System.out.println("---LabeledListTypeSetter--- 1 ---");

        llts.addToList("apple");
        llts.setLabel("the one list");
        System.out.println(llts.toString());
        // the one list
        // ============
        // 1. apple

        System.out.println("---LabeledListTypeSetter--- 2 ---");

        llts.addToList("wolf");
        llts.setLabel("OK, another list");
        System.out.println(llts.toString());
        // OK, another list
        // ================
        // 1.  apple
        // 2.  wolf

        System.out.println("---LabeledListTypeSetter--- 3 ---");

        llts.addToList("onion");
        llts.setLabel("words I like");
        System.out.println(llts.toString());
        // words I like
        // ============
        // 1.  apple
        // 2. wolf
        // 3. onion

        System.out.println("---LabeledListTypeSetter--- 4 ---");

        llts.addToList("lego");
        llts.setLabel("=");
        System.out.println(llts.toString());
        // =
        // =
        // 1. apple
        // 2. wolf
        // 3. onion
        // 4. lego
    }
    /*
---LabeledListTypeSetter---
label
=====

---LabeledListTypeSetter--- 1 ---
the one list
============
 * apple
---LabeledListTypeSetter--- 2 ---
OK, another list
================
 * apple
 * wolf
---LabeledListTypeSetter--- 3 ---
words I like
============
 * apple
 * wolf
 * onion
---LabeledListTypeSetter--- 4 ---
=
=
 * apple
 * wolf
 * onion
 * lego
     */

    private static void preSpecifiedMarksTypeSetterTest() {
        System.out.println("---PreSpecifiedMarksTypeSetter---");
        String[] labels = {"1)", "b.", "C", "the fourth one is as follows", "five is a number", "6."};
        PreSpecifiedMarksTypeSetter psmts = new PreSpecifiedMarksTypeSetter(labels);
        System.out.println(psmts.toString()); // no output
        //label
        //=====

        System.out.println("---PreSpecifiedMarksTypeSetter--- 1 ---");

        psmts.addToList("apple");
        System.out.println(psmts.toString());
        // 1) apple

        System.out.println("---PreSpecifiedMarksTypeSetter--- 2 ---");

        psmts.addToList("wolf");
        System.out.println(psmts.toString());
        // 1)  apple
        // b.  wolf

        System.out.println("---PreSpecifiedMarksTypeSetter--- 3 ---");

        psmts.addToList("onion");
        System.out.println(psmts.toString());
        // 1)  apple
        // b. wolf
        // C onion

        System.out.println("---PreSpecifiedMarksTypeSetter--- 4 ---");

        psmts.addToList("lego");
        System.out.println(psmts.toString());
        // 1) apple
        // b. wolf
        // C onion
        // the fourth one is as follows lego
    }
    /*
---PreSpecifiedMarksTypeSetter---

---PreSpecifiedMarksTypeSetter--- 1 ---
1) apple
---PreSpecifiedMarksTypeSetter--- 2 ---
1) apple
b. wolf
---PreSpecifiedMarksTypeSetter--- 3 ---
1) apple
b. wolf
C onion
---PreSpecifiedMarksTypeSetter--- 4 ---
1) apple
b. wolf
C onion
the fourth one is as follows lego
     */
}
