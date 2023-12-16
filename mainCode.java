public class mainCode {
    public static void main(String[] args) {
        String filePath = "sampleData.txt";
        coordRead.readLine(filePath);
        coordCache n = new coordCache();
        n.x = coordRead.x;
        n.y = coordRead.y;
        n.prop = coordRead.prop;
        System.out.println("x: "+n.x+" y: "+n.y+" prop: "+n.prop);
    }
}