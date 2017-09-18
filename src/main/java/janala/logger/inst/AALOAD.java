package janala.logger.inst;

public class AALOAD extends Instruction {
  public AALOAD(long tid, int iid, int mid) {
    super(tid, iid, mid);
  }
  public AALOAD(int iid, int mid) {
	    super(iid, mid);
  }
  public void visit(IVisitor visitor) {
    visitor.visitAALOAD(this);
  }

  @Override
  public String toString() {
    return "AALOAD iid=" + iid + " mid=" + mid + " tid=" + tid;
  }
}
