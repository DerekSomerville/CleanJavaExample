// A student has a student number, name, grades assignments in a course and percentage allocation for the course.
// Display the students first initial and last name with their course grade. To calculate the course grade you
// total each assignment mark times the assignment percentage allocation.
class St {
    private int n;
    private String fn;
    private int[] g;
    private int[] p;

    St(int d, String n, int[] g, int[] p ){
        this.n = d;
        this.fn = n;
        this.g = g;
        this.p = p;
    }
    public void cg(){
        double g = 1.0;
        String sg;
        int c = 0;
        for (int m:this.g){
            g = g + (m * p[c]/100);
            c = c + 1;
        }
        if ((22 - g) < 5) {
            sg = "A" + (int)((22 - g) + 1);
        } else if ((22 - g) < 7) {
            sg = "B" + (int)((22 - g) -4);
        } else if ((22 - g) < 10) {
            sg = "C" + (int)((22 - g) -7);
        } else {
            sg = "H";
        }
        System.out.println(g);
        System.out.println(fn.substring(0,1) + " " + fn.split(" ")[1] + " got " + sg);
    }

    public static void main(String[] arg){
        int[] a = {15,19,18};
        int[] b = {25,25,50};
        St st = new St(20012, "Derek Somerville",a,b );
        st.cg();
    }
}