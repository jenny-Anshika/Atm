class An{
    public static void hii(){
        System.out.println("hii");
    }

    public static void main(String args[]){
        int choice = 1;
        switch(choice){
            case 1: hii();
            break;

            default: System.out.println("bye");
        }
    }
}