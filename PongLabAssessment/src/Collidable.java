
public interface Collidable {
	
	boolean didCollideLeft(Object obj);
	boolean didCollideRight(Object obj);
	boolean didCollideTop(Object obj);
	boolean didCollideBottom(Object obj);
	boolean didCollideLeft1(Paddle obj);
	boolean didCollideRight1(Paddle obj);
	boolean didCollideTop1(Paddle obj);
	boolean didCollideBottom1(Paddle obj);
}

