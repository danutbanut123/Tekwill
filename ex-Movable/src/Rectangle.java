public class Rectangle extends Polygon {

    public Rectangle(Point topRightCorner, int width, int height) {
        vertices = new Point[4];
        vertices[0] = topRightCorner;
        vertices[1] = new Point(topRightCorner.getX(), topRightCorner.getY() - height);
        vertices[2] = new Point(topRightCorner.getX() - width, vertices[1].getY());
        vertices[3] = new Point(vertices[2].getX(), topRightCorner.getY());
    }

    public String getType() {
        return "Rectangle";
    }

    @Override
    public void ScaleUp(int scale) {
        //vertices[0].setX(vertices[0].getX()*scale);
        //vertices[1].setX(vertices[1].getX()*scale);
        //vertices[2].setX(vertices[2].getX()*scale);
        //vertices[3].setX(vertices[3].getX()*scale);

        //vertices[0].setY(vertices[0].getY()*scale);
        //vertices[1].setY(vertices[1].getY()*scale);
       // vertices[2].setY(vertices[2].getY()*scale);
       // vertices[3].setY(vertices[3].getY()*scale);
        
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