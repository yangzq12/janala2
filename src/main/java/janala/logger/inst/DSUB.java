package janala.logger.inst;

public class DSUB extends Instruction {
  public DSUB(long tid, int iid, int mid) {
    super(tid, iid, mid);
  }

  public void visit(IVisitor visitor) {
    visitor.visitDSUB(this);
  }

  public DSUB(int iid, int mid) {
	    super(iid, mid);
	  }
  @Override
  public String toString() {
    return "DSUB iid=" + iid + " mid=" + mid+ " tid=" + tid;
  }
}
