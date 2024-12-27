class Phone {
    String communicationInterface;
    String color;
    public Phone(String communicationInterface, String color) {
        this.communicationInterface = communicationInterface;
        this.color = color;
    }
    public void makeCall(String number) {
        System.out.println("Dialing: " + number);
    }
    @Override
    public String toString() {
        return "Phone{" +
                "communicationInterface='" + communicationInterface + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
    public void displayCallHistory() {
        System.out.println("no history");
    }
}
class CellPhone extends Phone {
    String[] callHistory = new String[10];
    int callHistoryIndex = 0;
    public CellPhone(String communicationInterface, String color) {
        super(communicationInterface, color);
    }
    @Override
    public void makeCall(String number) {
        System.out.println("Dialing: " + number);
        if (callHistoryIndex < 10) {
            callHistory[callHistoryIndex++] = number;
        } else {

        }
    }
    @Override
    public String toString() {
        return "CellPhone{" +
                "} " + super.toString();
    }
    @Override
    public void displayCallHistory() {
        System.out.println("Call History:");
        for (int i = 0; i < callHistoryIndex; i++) {
            System.out.println(callHistory[i]);
        }
    }
}
class Smartphone extends CellPhone {
    Persony[] friends;
    int friendsCount = 0;
    public Smartphone(String communicationInterface, String color) {
        super(communicationInterface, color);
        friends = new Persony[10]; // Adjust size as needed
    }
    public void addFriend(Persony friend) {
        if (friendsCount < 10) {
            friends[friendsCount++] = friend;
        } else {
            // Handle friends array overflow
        }
    }
    @Override
    public void makeCall(String number) {
        if (friendsCount > 0 && callHistoryIndex % 2 == 0) { // Call friend on even calls
            for (int i = 0; i < friendsCount; i++) {
                if (friends[i].phoneNumber.equals(number)) {
                    super.makeCall(friends[i].name + " " + friends[i].surname + " " + number);
                    return;
                }
            }
        }
        super.makeCall(number);
    }
    @Override
    public String toString() {
        return "Smartphone{" +
                "} " + super.toString();
    }
    @Override
    public void displayCallHistory() {
        System.out.println("Call History:");
        for (int i = 0; i < callHistoryIndex; i++) {
            int j;
            for (j = 0; j < friendsCount; j++) {
                if (callHistory[i].startsWith(friends[j].name + " " + friends[j].surname + " ")) {
                    System.out.println(callHistory[i]);
                    break;
                }
            }
            if (j == friendsCount) { // Not found in friends list
                System.out.println(callHistory[i]);
            }
        }
    }
}