// Write your code here

package com.example.todo.model;


public class Todo{
    private int id;
    private String todo;
    private String status;
    private String priority;

    public Todo(int id,String todo,String status,String priority){
        this.id=id;
        this.todo=todo;
        this.status=status;
        this.priority=priority;
    }


    public int getTodoId(){
        return id;
    }
    public String getTodo(){
        return todo;
    }
    public String getStatus(){
        return status;
    }
    public String getPriority(){
        return priority;
    }

}