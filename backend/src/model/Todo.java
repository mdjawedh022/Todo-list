package model;

public class Todo {
    private int id;
    private String title;
    private boolean completed;


    public Todo(int id, String title, boolean completed){
        this.id=id;
        this.title=title;
        this.completed=completed;
    }

    public Todo(String title){
        this.title=title;
    
    }

    //getters & Setters
    public int getId() {return id;}
    public String getTitle(){return  title;}
    public boolean isCompleted(){return completed;}

    public void setTitle(String title){this.title=title;}
    public void setCompleted(boolean completed){this.completed=completed;}

}