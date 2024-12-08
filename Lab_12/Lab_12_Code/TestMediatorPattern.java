public class TestMediatorPattern {
    
    public static void main(String[] args) {
        ChatRoom chatRoom = new ChatRoom();

        Participant alice = new ConcreteParticipant(chatRoom, "Alice");
        Participant bob = new ConcreteParticipant(chatRoom, "Bob");
        Participant charlie = new ConcreteParticipant(chatRoom, "Charlie");

        chatRoom.addParticipant(alice);
        chatRoom.addParticipant(bob);
        chatRoom.addParticipant(charlie);

        alice.sendMessage("Hello, everyone!");
        bob.sendMessage("Hi Alice!");
        charlie.sendMessage("Hello Alice and Bob!");
    }
}
