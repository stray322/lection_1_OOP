package lection_3;

public interface IConference<T> {
    void startConference(T time);
    void createTopic(T topic);
}