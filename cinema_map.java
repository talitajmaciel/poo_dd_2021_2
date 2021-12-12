class Cliente {
    private String fone;
    private String id;
    public Cliente(String id, String fone);
    public String toString();
    String getId();
    void setId(String id);
    String getFone();
    void setFone(String fone);
}
class Sala{
    private LinkedHashMap<string, Cliente> cadeiras;
    public Sala(int capacidade);
    public boolean reservar(String id, String fone, int ind);
    public void cancelar(String id);
    public String toString();
    LinkedHashMap<string, Cliente> getCadeiras();
}
class Solver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Sala sala = new Sala(0);
        while(true) {
            String line = scanner.nextLine();
            System.out.println("$" + line);
            String[] ui = line.split(" ");
            if(ui[0].equals("end")) {
                break;
            } else if(ui[0].equals("init")) {
                sala = new Sala(Integer.parseInt(ui[1]));
            } else if(ui[0].equals("show")) {
                System.out.println(sala);
            } else if(ui[0].equals("reservar")) {
                sala.reservar(ui[1], ui[2], Integer.parseInt(ui[3]));
            } else if(ui[0].equals("cancelar")) {
                sala.cancelar(ui[1]);
            } else {
                System.out.println("fail: comando invalido");
            }
        }
    }
}

class Manual {
    public static void main(String[] args) {
        Sala cinema = new Sala(0);
        System.out.println(cinema);
        System.out.print(" ");
        cinema = new Sala(5);
        System.out.println(cinema);
        System.out.print(" - - - - - ");
        cinema = new Sala(4);
        System.out.println(cinema);
        System.out.print(" - - - - ");
        cinema.reservar("davi", "3232", 0);
        cinema.reservar("joao", "3131", 3);
        System.out.println(cinema);
        System.out.print(" davi:3232 - - joao:3131 ");
        cinema.reservar("rute", "3030", 0);
        System.out.print("cadeira ja esta ocupada");
        cinema.reservar("davi", "3234", 2);
        System.out.print("cliente ja esta no cinema");
        cinema.cancelar("davi");
        System.out.println(cinema);
        System.out.print(" - - - joao:3131 ");
        cinema.cancelar("rita");
        System.out.print("cliente nao esta no cinema");
        System.out.println(cinema);
        System.out.print(" - - - joao:3131 ");
    }
}