public class Zoo {
    Animal [] animals ;
    String name;
    String city;
    int nbrCages = 25 ;

    public Zoo(String name , String city, int nbrCages) {
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
        animals = new Animal[nbrCages];
    }
    void displayZoo() {
        System.out.println(name + " " + city + " " + nbrCages);
    }
    @Override
    public String toString() {
        return ("zoo name is "+ name + "zoo city is "+ city + "cage number is "+ nbrCages) ;
    }
}
