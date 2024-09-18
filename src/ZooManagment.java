
public class ZooManagment {
    public static void main(String[] args) {

        //instruction 5

        /*


        Zoo myZoo = new Zoo() ;
        myZoo.city = "tunis" ;
        myZoo.name ="da7da7" ;
        myZoo.nbrCages = 25 ;
        System.out.println("zoo name :"+ myZoo.name + "zoo city :"+ myZoo.city + "zoo cage number : " + myZoo.nbrCages ) ;

        Animal lion = new Animal() ;
        lion.age = 10 ;
        lion.family = "carnivores";
        lion.name = "pablo" ;
        lion.isMammal = true;
        System.out.println("name :" + lion.name + "animal age :" + lion.age + "animal family :" + lion.family + "is it mammal " + lion.isMammal ) ;
*/


         //instruction 6
       /* Zoo myZoo = new Zoo("da7da7", "tunis", 25) ;
        System.out.println("zoo name :"+ myZoo.name + "zoo city :"+ myZoo.city + "zoo cage number : " + myZoo.nbrCages ) ;

        Animal lion = new Animal("carnivore","carlos",10 , true) ;
        System.out.println("name :" + lion.name + "animal age :" + lion.age + "animal family :" + lion.family + "is it mammal " + lion.isMammal ) ;
        */



        Zoo myZoo = new Zoo("da7da7", "tunis", 25) ;
    myZoo.displayZoo();
    System.out.println(myZoo);
        System.out.println(myZoo.toString());

        Animal lion = new Animal("carnivore","carlos",10 , true) ;
        System.out.println(lion);
        System.out.println(lion.toString());



    }


    }




