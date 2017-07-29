package userInterface;

public class MISFrameInitializer extends BasicFrameInitializer {

	private static MISFrameInitializer misFrameInitializer;

	public static MISFrameInitializer getMISFrameInitializerInstance() {
		// TODO Auto-generated method stub
		if (getMisFrameInitializer() == null) {
			setMisFrameInitializer(new MISFrameInitializer());
		}
		return getMisFrameInitializer();
	}

	public MISFrameInitializer() {
		// TODO Auto-generated constructor stub
	}

	public void initializeBasicFrame() {
		// TODO Auto-generated method stub
		super.initializeBasicFrame();
		
	}

	private static MISFrameInitializer getMisFrameInitializer() {
		return misFrameInitializer;
	}

	private static void setMisFrameInitializer(MISFrameInitializer misFrameInitializer) {
		MISFrameInitializer.misFrameInitializer = misFrameInitializer;
	}

}
