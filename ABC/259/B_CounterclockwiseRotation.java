import java.util.*;

public class B_CounterclockwiseRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextInt(), b = sc.nextInt();
        double d = sc.nextInt();
        sc.close();
        Coordinate A = new Coordinate(a, b);
        Coordinate B = new Coordinate(0, 0);
        Coordinate ans = A.rotateFrom(B, d);
        System.out.println(ans.x + " " + ans.y);
    }
}
class Coordinate {

	double x;
	double y;

	public Coordinate(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public Coordinate(Matrix matrix) {
		if (matrix.R != 2 || matrix.C != 1)
			throw new RuntimeException("Illegal matix dimensions.");
		
		this.x = matrix.data[0][0];
		this.y = matrix.data[1][0];
	}
	
	// Rotate B by angle degree from A
	public Coordinate rotateFrom(Coordinate A, double angle) {
		Coordinate B = this;
		Coordinate AB = B.minus(A); //Create AB Vector
		Matrix ABMatrix = new Matrix(AB);
		RoutationMatrix r = new RoutationMatrix(angle);
		Coordinate AC = new Coordinate(r.times(ABMatrix));
		Coordinate C = A.plus(AC); //OC Vector = OA Vector + AC Vector
		return C;
	}

	public Coordinate plus(Coordinate B) {
		Coordinate A = this;
		Coordinate p = new Coordinate(A.x + B.x, A.y + B.y);
		return p;
	}

	public Coordinate minus(Coordinate B) {
		Coordinate A = this;
		Coordinate p = new Coordinate(A.x - B.x, A.y - B.y);
		return p;
	}
	
	public void print() {
		System.out.printf("%.3f", x);
		System.out.print(" ");
		System.out.printf("%.3f", y);
		System.out.println();
	}

}

class RoutationMatrix extends Matrix {

	double angle;
	double theta;

	public RoutationMatrix(double angle) {
		super(2, 2);
		this.angle = angle;
		this.theta = Math.PI / 180.0 * angle;
		this.data = new double[R][C];

		this.data[0][0] = Math.cos(theta);
		this.data[0][1] = -Math.sin(theta);
		this.data[1][0] = Math.sin(theta);
		this.data[1][1] = Math.cos(theta);
	}

}

class Matrix {

	int R; // number of rows
	int C; // number of columns
	double[][] data;

	public Matrix(int R, int C) {
		this.R = R;
		this.C = C;
		this.data = new double[R][C];
	}

	public Matrix(double[][] data) {
		this.R = data.length;
		this.C = data[0].length;
		this.data = new double[R][C];
		for (int i = 0; i < R; i++) {
			for (int j = 0; j < C; j++) {
				this.data[i][j] = data[i][j];
			}
		}
	}

	public Matrix(Coordinate p) {
		this.R = 2;
		this.C = 1;
		this.data = new double[R][C];
		data[0][0] = p.x;
		data[1][0] = p.y;
	}

	public static Matrix random(int R, int C) {
		Matrix matrix = new Matrix(R, C);
		matrix.R = R;
		matrix.C = C;
		Random rnd = new Random();
		for (int i = 0; i < R; i++) {
			for (int j = 0; j < C; j++) {
				matrix.data[i][j] = rnd.nextInt(30);
			}
		}
		return matrix;
	}

	// return matrix = A + B
	public Matrix plus(Matrix B) {
		Matrix A = this;
		if (B.R != A.R || B.C != A.C)
			throw new RuntimeException("Illegal matix dimensions.");

		Matrix matrix = new Matrix(R, C);
		for (int i = 0; i < R; i++) {
			for (int j = 0; j < C; j++) {
				matrix.data[i][j] = A.data[i][j] + B.data[i][j];
			}
		}
		return matrix;
	}

	// return matrix = A - B
	public Matrix minus(Matrix B) {
		Matrix A = this;
		if (B.R != A.R || B.C != A.C)
			throw new RuntimeException("Illegal matix dimensions.");

		Matrix matrix = new Matrix(R, C);
		for (int i = 0; i < R; i++) {
			for (int j = 0; j < C; j++) {
				matrix.data[i][j] = A.data[i][j] - B.data[i][j];
			}
		}
		return matrix;
	}

	// return matrix = A * B
	public Matrix times(Matrix B) {
		Matrix A = this;
		if (A.C != B.R)
			throw new RuntimeException("Illegal matrix dimentions.");

		Matrix matrix = new Matrix(A.R, B.C);
		for (int i = 0; i < matrix.R; i++) {
			for (int j = 0; j < matrix.C; j++) {
				for (int k = 0; k < A.C; k++) {
					matrix.data[i][j] += (A.data[i][k] * B.data[k][j]);
				}
			}
		}
		return matrix;
	}

	public void print() {
		System.out.println("---Print Matrix---");
		for (int i = 0; i < R; i++) {
			for (int j = 0; j < C; j++) {
				System.out.printf("%.3f", data[i][j]);
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}