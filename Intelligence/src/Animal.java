class Animal {
    public String name ;
    public String species ;
    public int numberOfLegs ;
    public Animal ( String name , String species , int numberOfLegs ) {
        this . name = name ;
        this . species = species ;
        this . numberOfLegs = numberOfLegs ;
    }


    public String toString () {
        return " Name : " + name + "\t" + " Species : " + species + "\t" + " Number of legs : "
                + numberOfLegs ;
    }

    public void bite() {}
}
class Snake extends Animal {
    public boolean isVenomous ;
    public Snake ( String name, String species, int numberOfLegs, String s, boolean b ) {
        super ( name , " Snake ", 0) ;
        this . isVenomous = isVenomous ;
    }
    public void bite () {
        System . out . println ( isVenomous ? "You should get to the hospital!" :  " You ’re gonnabe ok!") ;
    }
    public String toString () {
        return super . toString () + "\tVenomous : " + isVenomous ;
    }
}
