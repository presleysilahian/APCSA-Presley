
public interface Collidable {
	
	boolean didCollideLeft(Block obj);
	boolean didCollideRight(Block obj);
	boolean didCollideTop(Block obj);
	boolean didCollideBottom(Block obj);
}

