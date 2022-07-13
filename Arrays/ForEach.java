public class ForEach {
    public static void main(String[] args) {
        String [] names = {"Fernando","Maria","Pedro","Luisa"};
        for (int i=0;i<names.length;i++){
            System.out.println(names[i]);
        }
        for (String i:names){       //for-each
            System.out.println(i);
        }
    }
}
