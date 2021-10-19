package com.diego.reto3.intento1.reto3Intento1;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "message")
public class Message {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer idMessage;
    private  String messageText;
    @ManyToOne
    @JsonIgnoreProperties({"messages", "doctor","reservations"})
    @JoinColumn(name="doctor_id")
    private Doctor doctor;

    @ManyToOne
    @JsonIgnoreProperties({"messages", "client","reservations"})
    @JoinColumn(name="client_idClient")
    private Client client;

    public Integer getIdMessage() {
        return idMessage;
    }

    public void setIdMessage(Integer idMessage) {
        this.idMessage = idMessage;
    }

    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
}
