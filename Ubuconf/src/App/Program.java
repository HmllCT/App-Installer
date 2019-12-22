package App;


/*
    Data structure that stores Program name and command and installation type
 */

import java.io.Serializable;
import java.util.Objects;

public class Program implements Serializable {
    private String name;
    private Type type;
    private String cmd; //the variable is cmd XD

    public Program(String name, Type type, String cmd) {
        this.name = name;
        this.type = type;
        this.cmd = cmd;
    }

    public Program(String name, String type, String cmd) {
        this.name = name;
        this.type = Type.StringtoEnum(type);
        this.cmd = cmd;
    }

    public String getName() {
        return name;
    }

    public Type getType() {
        return type;
    }

    public String getCmd() {
        return cmd;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Program program = (Program) o;
        return Objects.equals(name, program.name) &&
                type == program.type &&
                Objects.equals(cmd, program.cmd);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type, cmd);
    }


    @Override
    public String toString() {
        return "Program -> " +" " + name + '\n' +
                " Type:" + type + "\n" +
                " Command = " + cmd + '\n';
    }
}
