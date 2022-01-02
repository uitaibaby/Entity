package com.company.seventhCourse;

abstract class Entity{
    private String name;
    private int force;
    private int hp = 15;
    private boolean destroyed = false;

    public Entity(String name) {
        this.name = name;
        System.out.println(name + " was created");
    }

    protected Entity() {
    }

    protected int getForce(){
        return force;
    }

    public boolean isDestroyed(){
        return destroyed;
    }

    protected boolean damage(int dhp){
        hp -= dhp;
        if (hp < 0){
            destroyed = true;
            System.out.println(name + " was destroyed");
            return true;
        }
        return false;
    }

}
