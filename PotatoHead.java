public class PotatoHead{
    private boolean blackHat;
    private String eye_color;
    private int shoes;
    private String mustache;
    public PotatoHead(){
        blackHat = true;
        eye_color = "black";
        shoes = 1;
        mustache = "curled";
    }

    public PotatoHead(String e, boolean b, int s, String m ){
        blackHat = b;
        eye_color = e;
        shoes = s;
        mustache = m;
    }

    public String get_eye_color(){
        return eye_color;
    }

    public int get_shoes(){
        return shoes;
    }

    public boolean get_blackHat(){
        return blackHat;
    }

    public String get_mustache(){
        return mustache;
    }

    public void set_eye_color(String y){
        eye_color = y;
    }

    public void set_blackHat(boolean h){
        blackHat = h;
    }

    public void set_shoes(int s){
        shoes = s;
    }

    public void set_mustache(String e){
        mustache = e;
    }



    public String talk(){
        return "Look I'm woody! Howdy! Howdy! Howdy!";
    }




    public String toString(){
        return "this potato head has " + this.eye_color + " eyes.";
    }

    public void rng(){
        int x = (int) (3 * Math.random()) + 1;
        if(x == 1){
            System.out.println("I'm a G nome and you've been GNOMED!!!");
        } else{
            System.out.println("I'm a potato");
        }

    }





    public static void main(String[] args){
        PotatoHead bob = new PotatoHead();
        System.out.println(bob.toString());
        System.out.println(bob.talk());
        bob.rng();
    }
}