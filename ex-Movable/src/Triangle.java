public class Triangle extends Polygon {

    public Triangle(Point p1, Point p2, Point p3) {
        vertices = new Point[3];
        vertices[0] = p1;
        vertices[1] = p2;
        vertices[2] = p3;
    }

    public String getType() {
        return "Triangle";
    }

    @Override
    public void ScaleUp(int scale) {
        /*vertices[0].setX(vertices[0].getX()*scale);
        vertices[1].setX(vertices[1].getX()*scale);
        vertices[2].setX(vertices[2].getX()*scale);
        vertices[0].setY(vertices[0].getY()*scale);
        vertices[1].setY(vertices[1].getY()*scale);
        vertices[2].setY(vertices[2].getY()*scale);*/
        /*for(Point biggerx:vertices){
            biggerx.setX(biggerx.getX()*scale);
        }
        for(Point biggery:vertices){
            biggery.setY(biggery.getY()*scale);
        }*/
        for(Point bigger:vertices){
            bigger.setX(bigger.getX()*scale);
            bigger.setY(bigger.getY()*scale);
        }


    }
}