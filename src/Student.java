public class Student {

    String fullName;
    byte age;
    char gender;
    String group;
    byte number;


     static void mehtod(Student[] array){
        int boyCounter = 0;
        int girlCounter = 0;
        for (int i = 0; i < array.length; i++) {
            if(boyCounter == array[i].gender){
                boyCounter++;
            }else {
                girlCounter++;

            }

        }
        System.out.println("Girl: "+girlCounter);
        System.out.println("boy: "+boyCounter);




    }



}
