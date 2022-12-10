public class Family {
    Person[] members;

    public Family(Person[] members) {
        this.members = members;
    }

    public int adults(){
        int counter =0;

        for(Person i: members){
            if(i.getAge()>=18){
                counter++;
            }
        }
        return counter;
    }
}
