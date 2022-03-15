package AdvertismentMessage;

public class Message {
    String phrase;
    String event;
    String author;
    String city;

    public Message(String phrase, String event, String author, String city) {
        this.phrase = phrase;
        this.event = event;
        this.author = author;
        this.city = city;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s - %s.", this.phrase, this.event, this.author, this.city);
    }
}
