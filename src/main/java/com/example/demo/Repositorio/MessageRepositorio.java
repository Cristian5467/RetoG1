
package com.example.demo.Repositorio;

import com.example.demo.Interface.MessageInterface;
import com.example.demo.Modelo.Message;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MessageRepositorio {
   @Autowired
private MessageInterface messageCrudRepositotory;
   
 public List<Message> getAll(){
     return (List<Message>) messageCrudRepositotory.findAll();
 }
 public Optional < Message > getMessage(int id){
     return messageCrudRepositotory.findById(id);
 }
 public Message save(Message message){
     return messageCrudRepositotory.save(message);
 }
   
}
