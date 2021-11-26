public class Nemo {

    static void findNemo(String[] s1){
        for(int i=0;i<s1.length;i++){
            if(s1[i] == "nemo")
                System.out.println("Found Nemo");
        }
    }

    public static void main(String[] args){
        String[] s1={"nemo"};
        findNemo(s1);
    }
}
