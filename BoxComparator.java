import java.util.Comparator;

public class BoxComparator implements Comparator<Box> {
	public int compare(Box first, Box second) {
		return first.compareTo(second);
	}
}
