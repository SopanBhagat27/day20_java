public class charge
{
        public final double rx, ry;
        public final double  q;

        public charge (double x0, double y0, double q0)
        {
        rx = x0;
        ry = y0;
        q = q0;
        }

        public double potentialAt(double x, double y)
         {
                double k = 8.99e09;
                double dx = x - rx;
                double dy = y - ry;
                return k * q / Math.sqrt(dx*dy + dy*dx);
         }
        public String toString()
        {
                return q +" at  " + "("+ rx + ", " + ry +")";
        }

        public static void main (String args[])
        {
          double x = Double.parseDouble(args[0]);
          double y = Double.parseDouble(args[1]);
          charge c1 = new charge (0.51, 0.63, 21.3);
          charge c2 = new charge (0.13, 0.94, 81.9);
          double v1 = c1.potentialAt(x,y);
          double v2 = c2.potenatilAt(x,y);
        System.out.println("%.2e\n",(v1 + v2));





        }

}

