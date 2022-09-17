public class main {

    public static void main(String[] args) {


        {


            animal[] arr;


            arr = new animal[2];



            arr[0] = new animal("Dog", "Dog food");



            arr[1] = new animal("Cat", "Cat food");


            System.out.println(

                    "Animal description:");

            arr[0].display();


            System.out.println(

                    "Animal description:");

            arr[1].display();

        }
    }
}


