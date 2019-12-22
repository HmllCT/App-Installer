package App;

public enum Type {
    Apt,Snap,Flat;


    //method to help get the right Type
    public static Type StringtoEnum(String t){
        if(t.contains("snap"))return Type.Snap;
        else if(t.contains("flat"))return Type.Flat;
        else return Type.Apt;
    }
}

